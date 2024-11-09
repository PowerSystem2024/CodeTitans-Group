class Persona:
    def  __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Datos de la persona a mostrar: {self._nombre} {self._apellido}, {self._edad} años')

    @property
    def nombre(self): #Metodo Getter
        print(self._nombre)
        return self._nombre
    @nombre.setter
    def nombre(self, nombre): #Metodo Setter
        self._nombre = nombre

    @property
    def apellido(self):  # Metodo Getter
        print(self._apellido)
        return self._apellido

    @apellido.setter
    def apellido(self, apellido): #Metodo Setter
        self._apellido = apellido

    @property
    def edad(self):  # Metodo Getter
        print(self._edad)
        return self._edad

    @edad.setter
    def edad(self, edad): #Metodo Setter
        self._edad = edad

    def __del__(self):
        print(f'Eliminando Instancia Objeto con Atributos: {self._nombre} {self._apellido}, {self._edad} años')

if __name__ == '__main__':
    persona1 = Persona(nombre="Juan", apellido="Garcia", edad=40)
    persona1.mostrar_detalles()
    persona1.nombre = "Jacinto"
    persona1.apellido = "Marquez"
    persona1.edad = 29
    persona1.mostrar_detalles()
    print()
    # Crear 3 objetos mas, utilizando los metodos getters y setters
    # para modificar y mostrar los cambios con el metodo mostrar_detalles()

    persona2 = Persona("Gonzalo", "Gonzalez", 25)
    persona2.mostrar_detalles()
    persona2.nombre = "Gonza"
    persona2.apellido = "Gnlz"
    persona2.edad = 17
    persona2.mostrar_detalles()

    print()
    persona3 = Persona("Fernando", "Fernandez", 28)
    persona3.mostrar_detalles()
    persona3.nombre = "Fer"
    persona3.apellido = "Frdz"
    persona3.edad = 18
    persona3.mostrar_detalles()

    print()
    persona4 = Persona("Martin", "Martinez", 30)
    persona4.mostrar_detalles()
    persona4.nombre = "Marty"
    persona4.apellido = "Martz"
    persona4.edad = 15
    persona4.mostrar_detalles()