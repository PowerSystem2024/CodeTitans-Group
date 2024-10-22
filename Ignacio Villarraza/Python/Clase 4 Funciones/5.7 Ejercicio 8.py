# 5.7 Ejercicio 8 Cajero Automatico

saldo_inicial = 1000
ingreso = 0
retiro = 0

print("Bienvenido al Cajero automatico del Banco CodeTitans")
while True:
    print("Ingrese las siguientes opciones para continuar")
    opcion = int(input("1. Ingresar Dinero en La Cuenta. \n2. Retirar Dinero de la Cuenta. \n3. Consultar Saldo Disponible.\n4. Salir.\n"))
    if opcion == 1:
        print("1. Ingresar Dinero en La Cuenta.")
        ingreso = float(input("Digite la cantidad de dinero que desea ingresar y luego coloque los billetes en el cajero: "))
        saldo_inicial += ingreso
        print(f"Operacion Exitosa, su nuevo saldo es de: $ {saldo_inicial}")
        print()
    elif opcion == 2:
        print("2. Retirar Dinero de la Cuenta.")
        retiro = float(input("Digite la cantidad de dinero que desea retirar: "))
        saldo_inicial -= retiro
        print(f"Operacion Exitosa, su nuevo saldo es de: $ {saldo_inicial}")
        print()
    elif opcion == 3:
        print("3. Consultar Saldo Disponible.")
        print(f"Su saldo disponible en la cuenta es de: $ {saldo_inicial}")
        print()
    elif opcion == 4:
        print("Gracias por Utilizar nuestro Cajero Automatico\nLo esperamos pronto!")
        break
