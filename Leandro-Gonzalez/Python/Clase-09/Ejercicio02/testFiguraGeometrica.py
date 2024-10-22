#importamos las clases necesarias
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from FiguraGeometrica import FiguraGeometrica

#creamos un objeto de la clase Cuadrado
print("Creacion de objeto clase cuadrado".center(50, "-"))
cuadrado1 = Cuadrado(4, "Rojo")
cuadrado1.alto = 7
cuadrado1.ancho = 7
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f"El area del cuadrado es: {cuadrado1.calcular_area()}")

#Hacemos uso del metodo "MRO" para saber el orden de la jerarquia de clases
#print(Cuadrado.mro()) #MRO = Method Resolution Order

print(cuadrado1) #Imprimimos el objeto cuadrado1

#Creamos un objeto de la clase Rectangulo
print("Creacion de objeto clase rectangulo".center(50, "-"))
rectangulo1 = Rectangulo(3, 9, "Azul")
rectangulo1.ancho = 8
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')
print(rectangulo1)


#figura1 = FiguraGeometrica() #No se puede crear un objeto de una clase abstracta
print(Cuadrado.mro()) #MRO = Method Resolution Order