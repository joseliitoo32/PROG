original = [1, 2, 3, 4, 5]

copia1 = original.copy()    
copia2 = original[:]         
copia3 = [1, 2, 3, 4, 5]

for x in original:
    copia3.append(x)
    
copia4 = original
copia4.remove(5)
    
print(copia1)
print(copia2)
print(copia3)
