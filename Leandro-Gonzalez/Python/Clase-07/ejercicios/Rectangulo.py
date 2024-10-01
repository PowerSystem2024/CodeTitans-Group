class Rectangulo:
    """
    Crear una clase llamada Rectangulo con dos atributos: base y altura.
    el nombre del metodo sera calcular_area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario
    los objetos deben ser tres.
    """
    
    def __init__(self, base, altura): # Método constructor se lo llama init Dunder
        self.base = base  #atributo base
        self.altura = altura #atributo altura
        
    def calcular_area(self): #creamos otro metodo dentro de la clase Rectangulo para calcular el area
        return self.base * self.altura #retornamos el area del rectangulo
   
   
base = int(input("Ingrese la base del rectangulo: ")) #pedimos al usuario que ingrese la base
altura = int(input("Ingrese la altura del rectangulo: ")) #pedimos al usuario que ingrese la altura
rectangulo1 = Rectangulo(base, altura) #le pasamos los argumentos para los operandos
print(f"El area del rectangulo  es: {rectangulo1.calcular_area()}")
