nums = [4, 9, 6, 3, 2, 16]
clave = 1

def busqueda(nums, clave):
    for i in range(len(nums)):
        if nums[i] == clave:
            return i  
    return -1        

resultado = busqueda(nums, clave)
print(f"El número {clave} está en la posición {resultado} del array")  
