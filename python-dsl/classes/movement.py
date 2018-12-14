import turtle
import random
from lark import Lark

class Movement:
    def movement_turtle(t):
        name, number = t.children
        { 'f': turtle.fd,
          'b': turtle.bk,
          'l': turtle.lt,
          'r': turtle.rt, }[name](int(number))