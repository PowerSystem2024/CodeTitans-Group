@startuml
class Persona {
    +nombre : String
    +edad : int
    +mostrarInfo() : void
}

class Empleado {
    +sueldo : float
    +calcularBonificacion() : float
}

Empleado --|> Persona
@enduml