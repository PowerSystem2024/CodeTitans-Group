#Creamos la clase FiguraGeometrica
class FiguraGeometrica:
    #Creamos el metodo constructor
    def __init__(self, ancho, alto):
        #Creamos los atributos de la clase
        self._ancho = ancho
        self._alto = alto
    
    
    #Creamos los metodos get y set para el atributo alto y ancho
    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        self._ancho = ancho
        
        
    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        self._alto = alto    
        
    def __str__(self):#creamos el metodo __str__ para mostrar los atributos de la clase
        return f'FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]'    