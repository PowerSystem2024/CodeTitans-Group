#Ejercicio Calculadora de Impuestos
#Crear una funcion para calcular el total de un pago.
#Incluyendo un impuesto aplicado (IVA)
#Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
#Proporcione el pago sin impuesto: 100
#Proporcione el monto del impuesto: 21%
#Pago con impuesto: xxxxx

# Definimos la función para calcular el pago total incluyendo el impuesto
def calcular_pago_total(pago_sin_impuesto, impuesto):
    # Calculamos el pago total utilizando la formula
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    # Devolvemos el pago total
    return pago_total

# Solicitamos al usuario que proporcione el pago sin impuesto
pago_sin_impuesto = float(input("Ingrese el pago sin impuesto: "))

# Solicitamos al usuario que proporcione el monto del impuesto
impuesto = float(input("Ingrese el monto del impuesto (en porcentaje): "))

# Llamamos a la función para calcular el pago total
pago_con_impuesto = calcular_pago_total(pago_sin_impuesto, impuesto)

# Mostramos el resultado del pago total con impuesto incluido
print(f"Pago con impuesto: {pago_con_impuesto:.2f}")
