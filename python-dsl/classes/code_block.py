import turtle
from lark import Lark
import turtle_dsl

class CodeBlock:
    def block_instruction(t):
        for i in t.children:
            if((i != '{') and (i != '}')):
                turtle_dsl.run_instruction(i)