#Importamos la clase Persona2
from Persona2 import Persona2

print("Creacion de objetos".center(50, "-")) 

if __name__ == "__main__": #Solo se ejecuta si se ejecuta este
    
    persona5 = Persona2("Juana", "Perez", 30)
    persona5.mostrar_detalles()

    print(__name__) #Imprime el nombre del modulo
    
    
print("Eliminacion de objetos".center(50, "-")) 
del persona5 #Eliminamos el objeto