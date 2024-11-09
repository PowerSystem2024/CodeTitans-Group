class Cubo:
    def __init__(self, base, altura, profundidad):
        self.base = base
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.base * self.altura * self.profundidad

base = int(input("Ingrese el largo de la Base del Cubo: "))
altura = int(input("Ingrese la Altura del Cubo: "))
profundidad = int(input("Ingrese la Profundidad del Cubo: "))

cubo1 = Cubo(base=base, altura=altura, profundidad=profundidad)
print(f'El volumen del cubo es de: {cubo1.calcular_volumen()}')