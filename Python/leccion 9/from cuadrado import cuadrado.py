from cuadrado import cuadrado
from rectangulo import rectangulo

cuadrado1 = cuadrado(s, "azul")
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f"calculo del area del cuadrado: {cuadrado1.calcular_area()}")

#mro = method resolution order
#print(cuadrado.mro())

print(cuadrado1)
print("creacion de objeto clase rectangulo" .center (50, "_"))
rectangulo1 = rectangulo(3, 9, "verde")
rectangulo1.ancho = 15
print(f"calculo del area del rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)

#figura1 = figurageometrica()
print(cuadrado.mro())