import turtle_dsl

try:
    input = raw_input   
except NameError:
    pass

def main():
    while True:
        code = input('> ')
        try:
            turtle_dsl.run_turtle(code)
        except Exception as e:
            print(e)

if __name__ == '__main__':
    main()
