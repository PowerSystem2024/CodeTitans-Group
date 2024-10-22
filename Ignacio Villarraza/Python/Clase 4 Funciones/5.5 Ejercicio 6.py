#Ejercicio 6: Tabla de multiplicar


lista = []
def multiplicar():
    numero = int(input("Ingrese un numero: "))
    for num in range(1, 11):
        lista.append(num * numero)

multiplicar()
print(lista)