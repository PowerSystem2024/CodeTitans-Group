# Ejercicio11
# Cajero automático interactivo con un saldo inicial de 1000 unidades.
# Menú de opciones:
# 1) Ingresar dinero en la cuenta
# 2) Retirar dinero de la cuenta
# 3) Mostrar dinero disponible
#

saldo_total = 1000.00
opcion = 0

while opcion != 4:
    opcion = int(input(
        '\nMenu de opciones:'
        '\n1) Ingresar dinero en la cuenta'
        '\n2) Retirar dinero de la cuenta'
        '\n3) Mostrar dinero disponible'
        '\n4) Salir'
        '\n\n Seleccione una opcion: '

    ))
    if opcion == 1:
        saldo_ingresado = float(input('Ingrese el monto a depositar: '))
        saldo_total += saldo_ingresado
    elif opcion == 2:
        saldo_extraccion = float(input('Ingrese el monto a extraer: '))
        if saldo_extraccion > saldo_total:
            print(f'El monto a extraer es superior al que posee en su cuenta. Saldo actual: {saldo_total} ')
        else:
            saldo_total -= saldo_extraccion
    elif opcion == 3:
        print(f'Dinero disponible: {saldo_total}')


