#Creamos la clase Color
class Color:
    #Creamos el metodo constructor
    def __init__(self, color):
        #Creamos el atributo de la clase
        self._color = color
   
   #Creamos el metodo get y set para el atributo color
    @property
    def color(self):
        return self._color
    
    @color.setter
    def color(self, color):
        self._color = color
        
    def __str__(self):#creamos el metodo __str__ para mostrar el atributo de la clase
        return f'Color [Color: {self._color}]'