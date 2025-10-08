num1 = int(input("Primer número: "))
num2 = int(input("Segundo número: "))
num3 = int(input("Tercer número: "))


if num1 > num2 and num1 > num3:
    print("El mayor es:", num1)
    
elif num2 > num1 and num2 > num3:
    print("El mayor es:", num2)
    
elif num3 > num1 and num3 > num2:
    print("El mayor es:", num3)
    
else:
    print("Hay números iguales.")
