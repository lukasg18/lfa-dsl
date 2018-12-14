import turtle
import random
from lark import Lark

class Colors:
    def change_pencil_color(dic,t):
        for i in range(len(t.children)):
            if bool(dic):                   # se existe alguma coisa no dicionario
                name = (t.children[i].children[1].value)
                turtle.color(dic[name])  
            else:
                turtle.color(*t.children[i].children[1:]) 