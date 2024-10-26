'''
ejercicio 3 funcion recursiva
imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
puede ser cualquier valor positivo, por ejemplo, si pasamos el valor 5 debe imprimir
5
4
3
2
1
'''

def imprimir(num):
    if num < 1:
        return "Error"

    while (num >= 1):
        print(num)
        num = num - 1

numero = int(input("Ingrese un numero"))
imprimir(numero)





