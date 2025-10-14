def cuentaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    return cuenta

def cuentaABucle(texto):
    cuenta = 0
    for letra in texto:
        cuenta += 1

def cuentaYReemplazaA(texto):
    cuenta = texto.count("a") + texto.count("A") 
    nuevoTexto = texto.replace("a", "x")
    nuevoTexto = nuevoTexto.replace("A", "X")
    return nuevoTexto


    
frase = "Hola y Adios"
print(cuentaA(frase))
print(cuentaYReemplazaA(frase))
