'''
ejercicio6: calculadora de impuestos
crear una funcion para calcular el total de unn pago incluyendo
un impuesto aplicado (IVA)
formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
proporcione el pago sin impuesto: 1000
proporcione el monto del impuesto: 21%
pago con impuesto: xxxxx
'''

def pagoConImpuesto(pago_sin_impuesto, impuesto):

   return pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)

pago_sin_impuesto = float(input("Ingrese el monto de pago sin impuesto: "))
impuesto = float(input("Ingrese el monto del impuesto: "))
resultado = pagoConImpuesto(pago_sin_impuesto, impuesto)
print(f' El pago con impuestos es: {resultado}')

