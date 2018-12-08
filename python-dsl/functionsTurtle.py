import turtle

def cool_design_one():
        turtle.speed(0) # sets the speed of drawing to 0, which is the fastest
        turtle.pencolor('white') # sets the color of the pen/lines to white
        turtle.bgcolor('black') # sets the color of the background/canvas to black

        x = 0 # creates a variable x with value 0
        turtle.up() # lifts up the pen, so no lines are drawn

        #note fd() means move forward, bk() means move back
        # rt() or lt() means tilt right by a certain angle

        turtle.rt(45) 
        turtle.fd(90) 
        turtle.rt(135) 

        turtle.down() # sets down the pen, so that turtle can draw
        while x < 120: # while the value of x is lesser than 120,
                        #continuously do this:
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
                x = x+1 # adds 1 to the value of x,
                        # so that it is closer to 120 after every loop

        turtle.exitonclick() # When you click, turtle exits.

        #That's all! Try customizing the script! 8)