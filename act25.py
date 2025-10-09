num = int(input("Introduce número a multiplicar: "))

print(f"Tabla del {num}")
print(" ")
print(f"{num} x 0 = {num*0}")
for i in range(1,11):
    print(f"{num} x {i} = {num*i}")
