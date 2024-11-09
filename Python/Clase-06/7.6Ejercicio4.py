#7.6 Ejercicio 4: Calculadora de Impuestos
#Crear una funcion para calcular el total de un pago incluyendo un impuesto aplicado
#Formula: Pago total = pago sin impuesto + pago sin impuesto * (impuesto/100)

def calcular_total(pago, impuesto):
    return pago + (pago * (impuesto/100))

pago_sin_impuesto = float(input("Ingrese el total del pago sin Impuestos: $"))
impuestos = int(input("Ingrese el porcentaje del impuesto: "))
pago_total = calcular_total(pago_sin_impuesto, impuestos)
print(f"El total del pago con el impuesto incluido es de ${pago_total}")