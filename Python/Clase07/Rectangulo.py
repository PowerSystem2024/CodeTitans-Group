class Rectangulo:

    def __init__(self, altura, base):
        self.altura = altura;
        self.base = base;

    def calcular_area(self):
        return self.base * self.altura


base = float(input("Ingrese la base del rectangulo: "))
altura = float(input("Ingrese la altura del rectangulo: "))
rectangulo1 = Rectangulo(base, altura)
print(f'El area del rectangulo es: {rectangulo1.calcular_area():.2f}')