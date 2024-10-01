class Cubo:
    """
    Crear la clase cubo con los atributos, ancho, alto y profundidad.
    con el metodo calcular_volumen que tendra la formula:
    volumen = ancho * alto * profundidad. Pero los atributos deben ser ingresados por el usuario
    """
    
    def __init__(self, ancho, alto, profundidad): # Método constructor se lo llama init Dunder
        self.ancho = ancho #atributo ancho
        self.alto = alto
        self.profundidad = profundidad
        
    def calcular_volumen(self): #creamos otro metodo dentro de la clase Cubo para calcular el volumen
        return self.ancho * self.alto * self.profundidad #retornamos el volumen del cubo
    
    
#creamos las variables y con int convertimos a entero    
ancho = int(input("Ingrese el ancho del cubo: ")) #pedimos al usuario que ingrese el ancho
alto = int(input("Ingrese el alto del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))
cubo1 = Cubo(ancho, alto, profundidad) #le pasamos los argumentos para los operandos
print(f"El volumen del cubo es: {cubo1.calcular_volumen()}")
