

cantidad = int(input("¿Cuantos números quieres ingresar? "))

nums = []

for i in range(cantidad):
    num = int(input("Dime un número: "))
    nums.append(num)

print("Los números en orden inverso son: ")
for n in reversed(nums):
    print(n)

