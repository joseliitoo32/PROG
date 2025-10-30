num1 = input("Introduce primer número: ")
operacion = input("Dime que quieres hacer: ")
num2 = input("Introduce segundo número: ")
num1 =  int(num1)
num2 = int(num2)

if operacion == "sumar":
    print(num1 + num2)

elif operacion == "restar":
    print(num1-num2)

elif operacion == "multiplicar":
    print(num1*num2)

elif operacion == "dividir":
    print(num1/num2)

elif operacion == "raiz":
    if num1%num1 == 0:
        
