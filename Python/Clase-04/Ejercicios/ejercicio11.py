#Munu intereactivo - Cajero Automatico
#Hacer un programa que simule ser un cajero automatico
#Su saldo inicial debe ser de $1000
#El menu de opciones debe ser el siguiente:
#1. Ingresar dinero en la cuenta
#2. Retirar dinero de la cuenta
#3. Mostrar el dinero disponible
#4. Salir.


# Inicializamos el saldo
saldo = 1000

# Bucle principal del programa
while True:
    # Mostramos el menú de opciones
    print("\n--- Cajero Automático ---")
    print("\n---------MENU------------")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar el dinero disponible")
    print("4. Salir")
    
    # Pedimos al usuario que seleccione una opcion
    opcion = input("Seleccione una opcion: ")
    
    if opcion == "1":
        # Opcion para ingresar dinero
        cantidad = float(input("Ingrese la cantidad a depositar: $"))
        saldo += cantidad
        print(f"${cantidad} han sido depositados exitosamente.")
        
    elif opcion == "2":
        # Opcion para retirar dinero
        cantidad = float(input("Ingrese la cantidad a retirar: $"))
        if cantidad > saldo:
            print("Saldo insuficiente.")
        else:
            saldo -= cantidad
            print(f"${cantidad} han sido retirados exitosamente.")
            
    elif opcion == "3":
        # Opcion para mostrar el saldo
        print(f"Saldo disponible: ${saldo}")
        
    elif opcion == "4":
        # Opcion para salir
        print("Gracias por usar el cajero automatico. Hasta luego!")
        break
        
    else:
        # Opcion no valida
        print("Opcion no valida, por favor seleccione una opcion del menu.")
        print()
