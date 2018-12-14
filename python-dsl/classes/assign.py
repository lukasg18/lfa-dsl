import turtle
from lark import Lark
import turtle_dsl

class AssignVar:
    def assign_instruction(dic,t):
        name, ident_assign, color = t.children[0].children
        dic[name.value] = color.value