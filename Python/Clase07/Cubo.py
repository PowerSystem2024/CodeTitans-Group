class Cubo:

    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


alto = float(input("Ingrese el alto del cubo: "))
ancho = float(input("Ingrese el ancho del cubo: "))
profundidad = float(input("Ingrese el profundidad del cubo: "))
cubo1 = Cubo(ancho, alto, profundidad)
print(f'El volumen del cubo es: {cubo1.calcular_volumen()}')