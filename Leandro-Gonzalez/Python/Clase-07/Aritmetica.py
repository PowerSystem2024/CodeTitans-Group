class Aritmetica:
    """
    El nombre de este tipo de comentario es Docstring
    esto es documentacion de la clase de python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y mas
    """
    
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
        
    #metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    #metodo para restar
    def restar(self):
        return self.operandoA - self.operandoB
    
    #metodo para multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    #metodo para dividir
    def dividir(self):
        return self.operandoA / self.operandoB
    
    
    
aritmetica1 = Aritmetica(7, 9) #le pasamos los argumentos para los operandos
print(f"La suma es: {aritmetica1.sumar()}") #llamamos al metodo sumar
print(f"La resta es: {aritmetica1.restar()}")
print(f"La multiplicacion es: {aritmetica1.multiplicar()}")
print(f"La division es: {aritmetica1.dividir():.2f}") #redondeamos a 2 decimales

        