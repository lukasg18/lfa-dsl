import turtle
from lark import Lark
import turtle_dsl

class Fill:
    def fill_instruction(t):
        for i in range(len(t.children)):
            turtle.begin_fill()
            turtle_dsl.run_instruction(t.children[i].children[1])
            turtle.end_fill()