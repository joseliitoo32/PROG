nota = input("Dime tu nota: ")
nota = int(nota)

Insuficiente = [0, 1, 2, 3, 4]
Suficiente = [5]
Bien = [6]
Notable = [7, 8]
Sobresaliente = [9, 10]

if nota in Insuficiente:
    print(" Tu nota es insuficiente")

elif nota in Suficiente:
    print(" Tu nota es suficiente")

elif nota in Bien:
    print(" Tu nota es un bien")
    
elif nota in Notable:
    print(" Tu nota es notable")

elif nota in Sobresaliente:
    print(" Tu nota es sobresaliente")
    
else:
    print("Nota no válida")
