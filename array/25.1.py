palabra = input("Dime una palabra: ")

print(f"La palabra es {palabra}")

invertida = palabra[::-1]
print(f"La palabra invertida es {invertida}")
if palabra == invertida:
    print("Es palíndromo")
else:
    print("NO es palindromo")
