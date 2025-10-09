def pares(numero):
    if numero % 2 ==0:
        return("El número es par")
    elif numero %2 != 0:
        return("El número es impar")

numero = int(input("Introduce un numero: "))
print(f"{pares(numero)}")
