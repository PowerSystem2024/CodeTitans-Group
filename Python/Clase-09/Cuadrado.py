from FiguraGeometrica import FiguraGeometrica
from Color import Color



class cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, Color):
        #super.__init__(lado)
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, Color)

def calcular_area(self):
    return self.alto * self.ancho

