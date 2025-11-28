import re
#texto = "Nació en 1977 y el libro es de 2025"
#patron = r'\d{4}'
#print(re.search(patron, texto))

texto = "animal, árbol, amigo, oso"

patron = r'a\w*o'
print(re.search(patron, texto))
