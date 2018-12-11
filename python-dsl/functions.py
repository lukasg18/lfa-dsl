import turtle
import random

class PrivateFunction:
        def circle():
                turtle.circle(50)

        def olympics():
                turtle.color("blue")
                turtle.circle(50)
                turtle.penup()
                turtle.setposition(-120, 0)
                turtle.pendown()
                turtle.color("purple")
                turtle.circle(50)
                
                turtle.penup()
                turtle.setposition(60,60)
                turtle.pendown()
                turtle.color("red")
                turtle.circle(50)
                
                turtle.penup()
                turtle.setposition(-60, 60)
                turtle.pendown()
                turtle.color("yellow")
                turtle.circle(50)
                
                turtle.penup()
                turtle.setposition(-180, 60)
                turtle.pendown()
                turtle.color("green")
                turtle.circle(50)

        def cool_design_one():
                turtle.speed(0) 
                turtle.pencolor('white') 
                turtle.bgcolor('black') 

                x = 0 
                turtle.up() 

                turtle.rt(45) 
                turtle.fd(90) 
                turtle.rt(135) 

                turtle.down() 
                while x < 120: 
                                
                        turtle.fd(200)     
                        turtle.rt(61)
                        turtle.fd(200)
                        turtle.rt(61)
                        turtle.fd(200)
                        turtle.rt(61)
                        turtle.fd(200)
                        turtle.rt(61)
                        turtle.fd(200)
                        turtle.rt(61)
                        turtle.fd(200)
                        turtle.rt(61)

                        turtle.rt(11.1111) 
                        x = x+1 

                turtle.exitonclick()


        def cool_design_two():
                turtle.speed(0)

                turtle.bgcolor('black')
                x = 1

                while x < 400:
                        r = random.randint(0,255)
                        g = random.randint(0,255)
                        b = random.randint(0,255)

                        turtle.colormode(255)

                        turtle.pencolor(r,g,b)

                        turtle.fd(50 + x)
                        turtle.rt(90.911)

                        x = x+1 

                turtle.exitonclick()