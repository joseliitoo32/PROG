a = int(input("Dime cuanto mide A: "))
b = int(input("Dime cuanto mide B: "))
c = int(input("Dime cuanto mide C: "))

# Tres lados iguales
if a == b == c:
        print("Triángulo equilátero")

# Sólo dos lados iguales
elif a == b or a == c or b == c:
    print("Triángulo isósceles")

# Ningún lado igual
elif a != b != c:
    print("Triángulo escaleno")
