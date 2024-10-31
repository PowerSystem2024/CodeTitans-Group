from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    print(objeto) #de manera indirecta llama al str de la clase empleado o gerente
    print(type(objeto)) #esto es para saver el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado = Empleado("martiniano", 50000.00)
imprimir_detalles(empleado)

gerente = Gerente("Leandro", 60000, "sistemas")
imprimir_detalles(gerente)