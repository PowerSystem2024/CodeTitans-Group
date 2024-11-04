from mundo_pc.computadora import computadora
from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado
from mundo_pc.orden import Orden

teclado1 = Teclado("HP", "USB") # type: ignore
raton1 = Raton("HP", "USB") # type: ignore
monitor1 = Monitor("HP", "15 Pulgadas") # type: ignore
computadora1 = computadora("HP", monitor1, teclado1, raton1)


teclado2 = Teclado("Acer", "Bluetooth") # type: ignore
monitor2 = Monitor("Acer", "27 Pulgadas") # type: ignore
raton2 = Raton("Acer", "USB") # type: ignore
computadora2 = computadora("Acer", monitor2, teclado2, raton2)

computadoras1 = [computadora1, computadoras2]
orden1 = Orden(computadoras1)
print(orden1)