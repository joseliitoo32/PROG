def cuentaYReemplazaVocales(texto):
    vocales = "aeiouAEIOU"
    cuenta = 0
    nuevoTexto = ""
    
    for letra in texto:
        if letra in vocales:
            cuenta += 1
            nuevoTexto += "X"
        else:
            nuevoTexto += letra
            
    return cuenta, nuevoTexto

frase = "Hola y Adios"
cantidad, reemplazada = cuentaYReemplazaVocales(frase)
print("Cantidad de vocales:", cantidad)
print("Texto con vocales reemplazadas:", reemplazada)
