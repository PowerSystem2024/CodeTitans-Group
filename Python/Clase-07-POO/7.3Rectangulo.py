class Rectangulo:

    def __init__(self, alto, base):
        self.alto = alto
        self.base = base

    def area(self):
        return self.alto * self.base


base = int(input("Ingrese el largo de la Base del rectangulo: "))
altura = int(input("Ingrese la Altura del rectangulo: "))

rectangulo1 = Rectangulo(altura, base)
print(f'El area del Rectangulo es: {rectangulo1.area()}')
