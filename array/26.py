# Variables del producto
producto = "Espresso Doble"
precio_unitario = 3.50

# Variables de la transacción
cantidad = 3
tasa_iva = 0.16  # 16% de IVA

# Variables del cliente
cliente_nombre = "Ana Maria Lopez"
id_transaccion = "CAF-2025-472"

# Cálculos
precio_sin = precio_unitario * cantidad
iva = precio_sin * tasa_iva
precio_total = precio_sin + iva

# Recibo simple
print("-------- RECIBO --------")
print(f"Cliente: {cliente_nombre}")
print(f"Transacción: {id_transaccion}")
print(f"Producto: {producto}")
print(f"Precio unitario: {precio_unitario} €")
print(f"Cantidad: {cantidad}")
print(f"Subtotal: {precio_sin} €")
print(f"IVA (16%): {iva:.2f} €")
print("------------------------")
print(f"Total con IVA: {precio_total:.2f} €")
print("------------------------")
