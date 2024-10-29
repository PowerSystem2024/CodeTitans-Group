#Importamos las clases Empleado y Gerente
from Empleado import Empleado
from Gerente import Gerente

#Creamos un metodo para imprimir detalles
def imprimir_detalles(objeto):
    #print(objeto) #Llama al metodo __str__ de la clase Empleado o Gerente
    print(type(objeto)) #Muestra el tipo de objeto
    print(objeto.mostrar_detalles()) #Llamamos al metodo mostrar_detalle de la clase Empleado
    if isinstance(objeto, Gerente): #Verifica si el objeto es una instancia de la clase Gerente
        print(objeto.departamento) #Muestra el atributo departamento del objeto

#Creamos los objetos
empleado = Empleado("Juan", 3000)
gerente = Gerente("Carlos", 5000, "Sistemas")

#Llamamos al metodo imprimir_detalles
imprimir_detalles(empleado)
imprimir_detalles(gerente)


