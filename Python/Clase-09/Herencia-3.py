# Clase Padre
class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"Vehiculo de color {self.color} con {self.ruedas} ruedas."

# Clase Hija: Auto
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return (f"Auto de color {self.color}, con {self.ruedas} ruedas "
                f"y velocidad máxima de {self.velocidad} km/h.")

# Clase Hija: Bicicleta
class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return (f"Bicicleta de color {self.color}, con {self.ruedas} ruedas "
                f"y de tipo {self.tipo}.")

# Creación de objetos
vehiculo = Vehiculo("rojo", 4)
auto = Auto("azul", 4, 180)
bicicleta = Bicicleta("verde", 2, "montaña")

# Impresión de los objetos
print(vehiculo)
print(auto)
print(bicicleta)