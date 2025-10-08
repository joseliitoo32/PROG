n = int(input('Introduce el numero '))
if n > 0:
    for x in range(1, n + 1):
        if x < n:
            print(x, end=', ')
        else:
            print(x) # asi salgo del bucle al ser mayor que el numero pedido y no pone coma al final
else:
    print('Escribe un numero mayor que cero')
