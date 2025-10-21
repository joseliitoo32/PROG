# Loggearse

usuario_correcto = "alvaro"
usuario = input("Introduce tu nombre de usuario: ")
banco = 50

# Funcion de pago

def pagar(total, banco):
    pago = banco - total
    return pago

# Comprobar usuario
if usuario == usuario_correcto:
    print(f"¡Bienvenido {usuario}!")

    total = 0
    contador = 0
    
# Seleccionar producto
    
    while True:
        print("Selecciona la operación:")
        print("1. Kinder (1.50€)")
        print("2. Agua (0.80€)")
        print("3. Papas (1.20€)")
        print("4. Vapes (5.00€)")
        print("5. Papel de fumar (2.00€)")
        print("0. Pagar")
        opcion = int(input())
        
# Sumatoria al contador

        if opcion == 1:
            total += 1.50
            contador += 1
            print("Has seleccionado Kinder.")
        elif opcion == 2:
            total += 0.80
            contador += 1
            print("Has seleccionado Agua.")
        elif opcion == 3:
            total += 1.20
            contador += 1
            print("Has seleccionado Papas.")
        elif opcion == 4:
            total += 5.00
            contador += 1
            print("Has seleccionado Vapes.")
        elif opcion == 5:
            total += 2.00
            contador += 1
            print("Has seleccionado Papel de fumar.")
        elif opcion == 0:
            print(f"Realizando pago...")
            print(f"Has seleccionado {contador} productos, con un total de {total}€.")
            pago = pagar(total, banco)
                    break
        else:
            print("Opción no válida.")
        
        print()

else:
    print("Usuario incorrecto.")
