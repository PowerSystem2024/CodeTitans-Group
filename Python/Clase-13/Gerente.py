from Empleado import Empleado

class Gerente(Empleado):
    def __init__(self, nombre, sueldo, Departamento):
        super().__init__(nombre, sueldo)
        self.departamento = Departamento


    def __str__(self):
        return f"Empleado [Departamento: {self.departamento}] {super().__str__()}"