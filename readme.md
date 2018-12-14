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

#### Exemplos
O trabalho contem alguns arquivos de exmeplo para testar a DSL. Os arquivos podem ser encontrados dentro do diretorio "examples/". 
A seguir apresentaremos alguns comandos inseridos na DSL e logo em seguida seus respectivos resultados.
##### Exemplo 1




#### Referências

https://pythonhelp.wordpress.com/2011/07/09/o-modulo-turtle/

https://lark-parser.readthedocs.io/en/latest/

https://github.com/lark-parser/lark/blob/master/README.md