# Ejercicio 2: Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menú de opciones:
# 1. Nuevo contacto
# 2. Borrar contacto
# 3. Ver contactos existentes
# 4. Salir

agenda_telefonica = {}
opcion = 0

while opcion != 4:
    print("\n1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = int(input("\nIngrese una opcion: "))

    if opcion == 1:
        nombre = input('Ingrese el nombre del contacto: ')
        telefono = input('Ingrese un telefono: ')
        if nombre not in agenda_telefonica:
            agenda_telefonica[nombre] = telefono
            print(f'El nombre {nombre} se registró correctamente.')
        else:
            print(f'El nombre {nombre} ya está registrado en la agenda.')

    elif opcion == 2:
        entrada = input('Escriba el nombre o número del contacto a eliminar: ')
        encontrado = False
        for nombre, telefono in list(agenda_telefonica.items()):
            if entrada == nombre or entrada == telefono:
                del agenda_telefonica[nombre]
                print(f'Se ha eliminado el contacto: {nombre}')
                encontrado = True
                break
        if not encontrado:
            print('Contacto no encontrado.')

    elif opcion == 3:
        if agenda_telefonica:
            print("Contactos existentes:")
            for nombre, telefono in agenda_telefonica.items():
                print(f'{nombre}: {telefono}')
        else:
            print("No hay contactos en la agenda.")

    elif opcion == 4:
        print('Saliendo de la agenda.')

    else:
        print('Ingrese una opción válida.')