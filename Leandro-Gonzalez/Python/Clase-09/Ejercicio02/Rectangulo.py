#importamos las clases necesarias
from FiguraGeometrica import FiguraGeometrica
from Color import Color

#Creamos la clase Rectangulo
class Rectangulo(FiguraGeometrica, Color): #Heredamos de las clases FiguraGeometrica y Color (Clase Padre)
    #Creamos el metodo constructor
    def __init__(self, ancho, alto, color):
        #Creamos los atributos de la clase
        FiguraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)
        
    #creamos un metodo para calcular el area del rectangulo
    def calcular_area(self):
        return self.ancho * self.alto    
    
    #creamos el metodo __str__ para mostrar los atributos de la clase
    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'