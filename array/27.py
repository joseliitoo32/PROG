import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""

re_email = r'@'
print(re.findall(re_email, data))

re_fecha = r'\d{2}''\d{4}''\d{2}'
print(re.findall(re_fecha, data))


