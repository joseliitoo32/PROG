array1 = [10, 20, 30]
array2 = [30, 10, 20]

# 1Iguales 
if array1 == array2:
    print("Son iguales")

# Comparar longitud
elif len(array1) > len(array2):
    print("El array 1 es más largo que el array 2")
elif len(array2) > len(array1):
    print("El array 2 es más largo que el array 1")

# Mismos valores pero en distinto orden
elif sorted(array1) == sorted(array2):
    print("Tienen los mismos valores pero en distinto orden")

# Diferentes en valores
else:
    print("Son diferentes")
