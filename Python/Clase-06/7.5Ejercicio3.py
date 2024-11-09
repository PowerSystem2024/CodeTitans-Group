# 7.5 Ejercicio 3
#Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
#Puede ser cualquier valor positivo, por ejemplo si pasamos el valor de 5 deber imprimir
# 5
# 4
# 3
# 2
# 1

def descendente(numero):
    if numero >= 1:
        print(numero)
        descendente(numero - 1)

descendente(5)
descendente(-10) # Esta funcion no imprimira nada.
descendente(3)