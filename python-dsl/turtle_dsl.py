# This example implements a LOGO-like toy language for Python's turtle, with interpreter.
import turtle
from lark import Lark
from functions import PrivateFunction

parser = Lark(open('grammar.lark'))
dic = {}

def run_turtle(program):
    parse_tree = parser.parse(program)
    for inst in parse_tree.children:
        run_instruction(inst)

def run_instruction(t):
    if t.data == 'change_color':
        # if bool(dic):                   # se existe alguma coisa no dicionario
        #     name = t.children[0].value
        #     turtle.color(dic[name])   # We just pass the color names as-is
        # else:
        #     turtle.color(*t.children)   # We just pass the color names as-is
        func = PrivateFunction
        func.olympics()

    elif t.data == 'change_bg':
        turtle.bgcolor(*t.children)   # We just pass the color names as-is

    elif t.data == 'movement':
        name, number = t.children
        { 'f': turtle.fd,
          'b': turtle.bk,
          'l': turtle.lt,
          'r': turtle.rt, }[name](int(number))

    elif t.data == 'repeat':
        count, block = t.children
        for i in range(int(count)):
            run_instruction(block)

    elif t.data == 'fill':
        turtle.begin_fill()
        run_instruction(t.children[0])
        turtle.end_fill()

    elif t.data == 'code_block':
        for cmd in t.children:
            run_instruction(cmd)

    elif t.data == 'assign_var':
        name, color = t.children
        dic[name.value] = color.value

    elif t.data == 'var':
        name = t.children[0].value
        print(dic[name])
    
    elif t.data == 'function':
        print("teste func")
    
    elif t.data == 'clear_screen':
        turtle.clear()

    else:
        raise SyntaxError('Unknown instruction: %s' % t.data)
