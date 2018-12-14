# This example implements a LOGO-like toy language for Python's turtle, with interpreter.
import turtle
from lark import Lark
from classes.functions import PrivateFunction
from classes.movement import Movement
from classes.colors import Colors
from classes.loop import Loop
from classes.fill import Fill

parser = Lark(open('grammar/grammar.lark'))
dic = {}

def run_turtle(program):
    parse_tree = parser.parse(program)
    for inst in parse_tree.children:
        run_instruction(inst)

def run_instruction(t):
    if t.data == 'change_color':
          color = Colors
          color.change_pencil_color(dic,t)

    elif t.data == 'change_bg':
        bg = Colors
        bg.change_background(t)

    elif t.data == 'movement':
        move = Movement
        move.movement_turtle(t)

    elif t.data == 'repeat':
        l = Loop
        l.loop_instruction(t)

    elif t.data == 'fill':
        f = Fill
        f.fill_instruction(t)

    elif t.data == 'tree_parser':
        print(t.children)

    elif t.data == 'code_block':
        for i in t.children:
            if((i != '{') and (i != '}')):
                run_instruction(i)


    elif t.data == 'assign_var':
        name, ident_assign, color = t.children[0].children
        dic[name.value] = color.value

    elif t.data == 'var':
        name = t.children[0].value
        print(dic[name])
    
    elif t.data == 'call_function':
        func = PrivateFunction

        for i in range(len(t.children)):
            ident_func, name_function = t.children[i].children

            if(name_function == 'circle'):
                func.circle()

            elif(name_function == 'designone'):
                func.cool_design_one()

            elif(name_function == 'wind'):
                func.wind_vane()

            elif(name_function == 'olympic'):
                func.olympics()

            elif(name_function == 'hello'):
                func.hello_world()
    
    elif t.data == 'clear_screen':
        turtle.clear()

    else:
        raise SyntaxError('Unknown instruction: %s' % t.data)
