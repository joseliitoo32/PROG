inventario = ["Manzanas", "Plátanos", "Naranjas", "Peras"]
print("Inicial:", inventario)

inventario.append("Uvas")
inventario.append("Kiwi")

lote_melones = ["Melones"]
inventario.extend(lote_melones)
print("Tras llegadas:", inventario)

inventario.insert(1, "Plátanos Frescos")
print("Tras inserción:", inventario)

producto_vendido = inventario.pop()
print("Vendido:", producto_vendido)

inventario.remove("Peras")
print("Tras descarte:", inventario)

reporte_urgente = inventario[:4]
print("Reporte urgente:", reporte_urgente)

for i in range(len(reporte_urgente)):
    print("Índice", i, ":", reporte_urgente[i])
