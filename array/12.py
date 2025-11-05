a = [1,2,3,4,5,6,7,8,9,10]
print("Lista original:", a)

# eliminar concretamente los valores pares conocidos
for valor in [0,2,4,6,8,10]:
    if valor in a:
        a.remove(valor)

print("Lista resultante:", a)
