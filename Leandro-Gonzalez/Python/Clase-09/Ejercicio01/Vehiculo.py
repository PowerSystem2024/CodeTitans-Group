#creamos la clase Vehiculo
class Vehiculo:
    '''
    Definir una clase padre llamada Vehiculo y dos clases hijas llamadas 
    Coche y Bicicleta, las cuales heredan de la clase Padre Vehiculo.
    La clase padre debe tener los siguientes atributos y métodos:
    Vehiculo (Clase Padre):
    - Atributos (color, ruedas)
    - Métodos (- __init__(color, ruedas), __str__())
    
    Auto(clase hija de Vehiculo):
    -Atributos (velocidad)
    - Métodos (- __init__(color, ruedas y velocidad), __str__())
    
    Bicicleta(clase hija de Vehiculo):
    -Atributos (tipo(Montaña, Urbana, etc))
    - Métodos (- __init__(color, ruedad y tipo), __str__())
    
    Crear un objeto de cada clase
    '''
    
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    
    def __str__(self):
        return f'Color: {self.color}, Ruedas: {self.ruedas}'
   
    
  #creamos las clases hijas de Vehiculo  
class Auto(Vehiculo):
        def __init__(self, color, ruedas, velocidad):
            super().__init__(color, ruedas)
            self.velocidad = velocidad
        
        def __str__(self):
            return f'{super().__str__()}, Velocidad: {self.velocidad}'
        
        

class Bicicleta(Vehiculo):
        def __init__(self, color, ruedas, tipo):
            super().__init__(color, ruedas)
            self.tipo = tipo
        
        def __str__(self):
            return f'{super().__str__()}, Tipo: {self.tipo}'
        
#creamos los objetos de cada clase
vehiculo = Vehiculo('Rojo', 4)
auto = Auto('Azul', 4, 120)
bicicleta = Bicicleta('Negra', 2, 'Montaña')

#imprimimos los objetos
print(vehiculo)
print(auto)
print(bicicleta)

                
    
    
    