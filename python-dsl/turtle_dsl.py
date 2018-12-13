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
        for i in range(len(t.children)):
            if bool(dic):                   # se existe alguma coisa no dicionario
                name = (t.children[i].children[0].value)
                turtle.color(dic[name])  
            else:
                turtle.color(*t.children[i].children)   

    elif t.data == 'change_bg':
        for i in range(len(t.children)):
            turtle.bgcolor(*t.children[i].children)   

    elif t.data == 'movement':
        name, number = t.children
        { 'f': turtle.fd,
          'b': turtle.bk,
          'l': turtle.lt,
          'r': turtle.rt, }[name](int(number))

    elif t.data == 'repeat':
        for i in range(len(t.children)):
            count, block = t.children[i].children
            for i in range(int(count)):
                run_instruction(block)

    elif t.data == 'fill':
        for i in range(len(t.children)):
            turtle.begin_fill()
            run_instruction(t.children[i].children[0])
            turtle.end_fill()

    elif t.data == 'tree_parser':
        print(t.children)

    elif t.data == 'code_block':
        for i in t.children:
            if((i != '{') and (i != '}')):
                run_instruction(i)
            # LCHA, block, RCHA = i
        # print(LCHA)
        # print(block)
        # print(RCHA)
        # for cmd in block:
        #     print(cmd)
            # run_instruction(block)
        # print(t.children)
        # for cmd in t.children:
        #     print(cmd)
        #     run_instruction(cmd)


    elif t.data == 'assign_var':
        name, color = t.children
        dic[name.value] = color.value

    elif t.data == 'var':
        name = t.children[0].value
        print(dic[name])
    
    elif t.data == 'call_function':
        func = PrivateFunction

        for i in range(len(t.children)):
            name_function = t.children[i].children[0].value

            if(name_function == 'circle'):
                func.circle()

            elif(name_function == 'designone'):
                func.cool_design_one()

            elif(name_function == 'designtwo'):
                func.cool_design_two()
    
    elif t.data == 'clear_screen':
        turtle.clear()

    else:
        raise SyntaxError('Unknown instruction: %s' % t.data)
