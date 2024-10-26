class Persona2:

    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property # para llamar al metodo como su fuera un atributo y de forma indirecta usamos un decorador
    def nombre(self):  # Metodo Getter
        print('Estamos utilizando el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print('Estamos utilizando el metodo set')
        self._nombre = nombre

    @property
    def apellido(self):
        print('Estamos utilizando el metodo get')
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        print('Estamos utilizando el metodo set')
        self._apellido = apellido

    @property
    def edad(self):
        print('Estamos utilizando el metodo get')
        return self._edad

    @edad.setter
    def edad(self, edad):
        print('Estamos utilizando el metodo set')
        self._edad = edad

    def __del__(self):
        print(f'Ejecutamos el metodo destructor, eliminamos: {self._nombre} {self._apellido} {self._edad}')

if __name__ == '__main__':  # comprobacion del metodo principal en ejecucion

    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # mediante el property accedemos al metodo get

    print(persona1.mostrar_detalles()) # llamamos el metodo para mostrar detalles
    # sino habria metodo setter:
    # persona1.edad = 40
    # Atributo read-only seria la edad porque no tiene metodo set
    # print(persona1.edad)

    persona2 = Persona2('','',0)
    persona2.nombre = 'Jimi'
    persona2.apellido = 'Hendrix'
    persona2.edad = 27
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona3 = Persona2('','',0)
    persona3.nombre = 'Rod'
    persona3.apellido = 'Stewart'
    persona3.edad = 78
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.mostrar_detalles()

    persona4 = Persona2('','',0)
    persona4.nombre = 'Jeff'
    persona4.apellido = 'Beck'
    persona4.edad = 65
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.mostrar_detalles()

    print(__name__)  # esto sirve para decirnos donde termina la clase Persona2 y su ejecucion
