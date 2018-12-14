## Turtle DSL
Este trabalho consiste na implementação de uma Linguagem de Dominio Especifico para trabalhar com o módulo Turtle.

#### Sobre o Turtle
Turtle é um módulo Python que oferece funcionalidades para fazermos desenhos na tela, com comandos muito simples. Esse módulo segue a idéia da linguagem de programação Logo, que é muito utilizada em escolas como apoio ao ensino de disciplinas regulares e também para introdução a programação para crianças. A linguagem Logo segue a ideia de um robô que o usuário pode controlar através de comandos simples de movimentação.

#### Sobre o Lark
Lark é um analisador de gramatica livre de contexto. Segundo sua documentação, ele pode analisar qualquer gramática que você lançar nele, não importa o quão complicado ou ambíguo, e fazê-lo de forma eficiente.

#### Executando o codigo
Para execução do projeto é recomendado utilizar uma maquina virtual do python mas nao é obrigatorio para o funcionamento do codigo.
A seguir sao apresentados os comandos necessários para executar o projeto.

* Insira o comando abaixo para criar uma maquina virtal do python
```bash
virtualenv venv --python=python3
```

* Para ativar a mauquina insira o comando:
```bash
source venv/bin/activate
```

* Insira o comando abaixo para instalar a biblioteca do lark-parser
```bash
pip install lark-parser
```

* Entre no diretório "python-dsl/"

* Insira o comando para executar o código:
```bash
python main.py
```

#### Funcionalidade da DSL
A seguir apresentarei algumas explicações sobre a funcionalidade da DSL dita anterioemente.

##### Função Lark
Responsavel por analisar a gramatica livre de contexto desenvolvida. Mostrado no trecho de código abaixo:
```python
parser = Lark(open('grammar.lark'))
```
##### Função Parse
Após a analise feita pela função "lark", a função "parse" retorna uma árvore de análise completa. Veja o trecho abaixo:
```python
parse_tree = parser.parse(program)
```
##### Função Data
Após a construção da arvore feita pela função "parse", a função "data" retorna o nome da regra ou alias definida na gramatica. No trecho abaixo o nome da regra é dado por "movement".
```typescript
instruction: MOVEMENT NUMBER             -> movement
```
Para descobrimos o nome da regra basta chamar a funcao "data".
```python
parse_tree.data
```

##### Função Children
Esta função lista de sub-regras e terminais correspondentes, ou seja, com essa função é capaz acessar os filhos da arvore construida pela função parse. Veja o codigo abaixo:
```python
parse_tree.children
```

#### Comandos da linguagem
Segue abaixo alguns comandos da linguagem.

##### Trocar a cor da caneta de desenho
Utiliza-se a letra "c" acompanhado de uma cor para mudar a cor da caneta.
```python
c red
```

##### Trocar a cor de fundo do painel.
Utiliza-se o comando "bg" acompanhado de uma cor para mudar o fundo do painel.
```python
bg black
```
##### Escrever no painel
Utiliza-se os comandos "f, b, l, r" acompanhado de um numero. Onde:

* f: move para frente;
* b: move para trás;
* l: move o angulo da caneta para esquerda;
* r: move o angulo da caneta para direita;
```python
f 100 r 90 f 100 r 90 f 100 r 90 f 100 r 90
```

##### Preenchendo um desenho
Utiliza-se o comando "fill" acompanhado por um "{" e "}" para preencher um desenho. Lembrando que tudo o que está entre "{" e "}" é um bloco, logo por ordem de prioridade os blocos inferiores sao executados primeiro.
```python
fill { f 100 r 90 f 100 r 90 f 100 r 90 f 100 r 90}
```

##### Função loop
Utiliza-se o comando "repeat" acompanhado por um numero e "{" e "}". 
```python
repeat 4 { f 100 r 90 } 
```

##### Chamada de função definida pelo sistema
Utiliza-se o comando "func" acompanhado por um nome.
```python
func wind
```

##### Atribuição 
Utiliza-se "=" acompanhado por um nome.
```python
my_color = red
c my_color
```

#### Exemplos
O trabalho contem alguns arquivos de exmeplo para testar a DSL. Os arquivos podem ser encontrados dentro do diretorio "examples/". 
A seguir apresentaremos alguns comandos inseridos na DSL e logo em seguida seus respectivos resultados.

##### Exemplo 1: Quadrado
O primeiro exemplo mostra como desenhar um quadrado. Veja o trecho de código abaixo:
```python
my_color = red      
c my_color fill { repeat 4 { f 100 r 90 } }
```
Resultado: <br>
<figure>
<img src="https://raw.githubusercontent.com/lukasg18/lfa-dsl/dev/dsl_images/example1.1.png" width="60%" height="60%" style="display: block; margin-left: auto; margin-right: auto;">
<figcaption style="text-align: center">Figura 1 - Exemplo quadrado</figcaption>
</figure>
A seguir é apresentado a arvore que foi gerada pela função parse:

```python
Tree(tree_view, [Tree(code_block, [Token(LCHA, '{'), 
Tree(change_bg, [Tree(custom_bg, [Token(COLOR, 'black')])]), 
Tree(change_color, [Tree(custom_color, [Token(COLOR, 'red')])]), 
Tree(fill, [Tree(change_fill, [Tree(code_block, [Token(LCHA, '{'), 
Tree(repeat, [Tree(loop, [Token(NUMBER, '4'), Tree(code_block, [Token(LCHA, '{'), 
Tree(movement, [Token(MOVEMENT, 'f'), Token(NUMBER, '100')]), 
Tree(movement, [Token(MOVEMENT, 'r'), Token(NUMBER, '90')]), Token(RCHA, '}')])])]), Token(RCHA, '}')])])]), Token(RCHA, '}')])])
```

##### Exemplo 2: Sol
O segundo exemplo mostra como desenhar um sol. Veja o trecho de código abaixo:
```python
bg black c red yellow fill { repeat 36 { f200 l170 }}
```
Resultado: <br>
<figure>
<img src="https://raw.githubusercontent.com/lukasg18/lfa-dsl/dev/dsl_images/example1.png" width="60%" height="60%" style="display: block; margin-left: auto; margin-right: auto;">
<figcaption style="text-align: center">Figura 2 - Exemplo sol</figcaption>
</figure>
A seguir é apresentado a arvore que foi gerada pela função parse:


```python
[Tree(tree_view, [Tree(code_block, [Token(LCHA, '{'), 
Tree(change_bg, [Tree(custom_bg, [Token(COLOR, 'black')])]), 
Tree(change_color, [Tree(custom_color, [Token(COLOR, 'red'), Token(COLOR, 'yellow')])]), 
Tree(fill, [Tree(change_fill, [Tree(code_block, [Token(LCHA, '{'), 
Tree(repeat, [Tree(loop, [Token(NUMBER, '36'), 
Tree(code_block, [Token(LCHA, '{'), 
Tree(movement, [Token(MOVEMENT, 'f'), Token(NUMBER, '200')]), 
Tree(movement, [Token(MOVEMENT, 'l'), Token(NUMBER, '170')]), Token(RCHA, '}')])])]), Token(RCHA, '}')])])]), Token(RCHA, '}')])])]
```

##### Exemplo 3: Cata-vento
A linguagem conta com algumas funções prontas, como por exemplo a função do cata-vento(func wind)
```python
func wind
```
Resultado: <br>
<figure>
<img src="https://raw.githubusercontent.com/lukasg18/lfa-dsl/dev/dsl_images/examplefunc1.png" width="60%" height="60%" style="display: block; margin-left: auto; margin-right: auto;">
<figcaption style="text-align: center">Figura 3 - Exemplo cata-vento</figcaption>
</figure>
A seguir é apresentado a arvore que foi gerada pela função parse:

```python
Tree(tree_view, [Tree(code_block, [Token(LCHA, '{'), 
Tree(call_function, [Tree(function, [Token(NAME, 'wind')])]), Token(RCHA, '}')])])
```


#### Referências

https://pythonhelp.wordpress.com/2011/07/09/o-modulo-turtle/

https://lark-parser.readthedocs.io/en/latest/

https://github.com/lark-parser/lark/blob/master/README.md