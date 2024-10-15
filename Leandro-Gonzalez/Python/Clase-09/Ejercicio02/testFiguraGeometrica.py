#importamos las clases necesarias
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

#creamos un objeto de la clase Cuadrado
cuadrado1 = Cuadrado(4, "Rojo")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"El area del cuadrado es: {cuadrado1.calcular_area()}")

#Hacemos uso del metodo "MRO" para saber el orden de la jerarquia de clases
print(Cuadrado.mro()) #MRO = Method Resolution Order

print(cuadrado1) #Imprimimos el objeto cuadrado1

#Creamos un objeto de la clase Rectangulo
rectangulo1 = Rectangulo(3, 5, "Azul")
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')
print(rectangulo1)
