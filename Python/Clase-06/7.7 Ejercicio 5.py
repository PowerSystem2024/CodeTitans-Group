#7.7 Ejercicio 5 Funciones (Celsius a Fahrenheit)
#Realizar 2 funciones para convertir de gradis celcius a farenheit y viceversa

def convertidor(temp, opcion):
    if opcion == 1:
        return (temp * 9 / 5) + 32
    elif opcion == 2:
        return (temp - 32) * 5 / 9
    else:
        return

temperatura = float(input("Ingrese la temperatura a converir: "))
opcion = int(input("Ingrese 1) Para convertir CELSIUS a FAHRENHEIT\nIngrese 2) Para convertir FAHRENHEIT a CELSIUS\n\t: "))
tipo_temp = "C" if opcion == 1 else "F"
nueva_temp = convertidor(temperatura, opcion)
if nueva_temp is not None:
    print(f"{temperatura}°{tipo_temp} es igual a {nueva_temp}°")
else:
    print("Hay un error en el la formula, intente nuevamente.")