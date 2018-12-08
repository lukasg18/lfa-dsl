# This example implements a LOGO-like toy language for Python's turtle, with interpreter.

try:
    input = raw_input   # For Python2 compatibility
except NameError:
    pass

import turtle
import functionsTurtle

from lark import Lark

parser = Lark(open('grammar.lark'))

def run_instruction(t):
    if t.data == 'change_color':
        turtle.color(*t.children)   # We just pass the color names as-is

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
    else:
        raise SyntaxError('Unknown instruction: %s' % t.data)


def run_turtle(program):
    parse_tree = parser.parse(program)
    for inst in parse_tree.children:
        run_instruction(inst)

def main():
    while True:
        code = input('> ')
        try:
            run_turtle(code)
        except Exception as e:
            print(e)

if __name__ == '__main__':
    # test()
    main()
