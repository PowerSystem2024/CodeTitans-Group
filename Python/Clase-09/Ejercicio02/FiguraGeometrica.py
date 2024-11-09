from abc import ABC, abstractmethod #Importamos las librerias abstractas de python
# ABC es una clase abstracta que nos permite crear metodos abstractos

#Creamos la clase FiguraGeometrica
class FiguraGeometrica (ABC): #Heredamos de la clase abstracta ABC
    #Creamos el metodo constructor
    def __init__(self, ancho, alto):
        #Creamos los atributos de la clase
        if self._validar_valor(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'Valor de ancho no valido: {ancho}')    
        if self._validar_valor(alto):    
            self._alto = alto
        else:
            self._alto = 0  
            print(f'Valor de alto no valido: {alto}')  
    
    
    #Creamos los metodos get y set para el atributo alto y ancho
    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valor(ancho):
         self._ancho = ancho
        else:
            print(f'Valor de ancho no valido: {ancho}') 
         
        
        
    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valor(alto):
         self._alto = alto
        else:
            print(f'Valor de alto no valido: {alto}')     
        
    @abstractmethod #Metodo abstracto
    def calcular_area(self):
        pass    
        
    def __str__(self):#creamos el metodo __str__ para mostrar los atributos de la clase
        return f'FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]'    
    
    
    #Utilizamos un metodo encapsulado
    def _validar_valor(self, valor):
        return True if 0 < valor < 10 else False