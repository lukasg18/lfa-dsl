import turtle
from lark import Lark
import turtle_dsl

class Loop:
    def loop_instruction(t):
        for i in range(len(t.children)):
            ident_loop, count, block = t.children[i].children
            for i in range(int(count)):
                turtle_dsl.run_instruction(block)