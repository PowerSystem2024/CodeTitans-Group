from teclado import Teclado
from raton import Raton
from monitor import Monitor
from computadora import Computadora       
from orden import Orden 

teclado1 = Teclado("HP", "USB") 
raton1 = Raton("HP", "USB") 
monitor1 = Monitor("HP", "15 Pulgadas")
computadora1 = Computadora("HP", monitor1, teclado1, raton1)


teclado2 = Teclado("Acer", "Bluetooth") 
monitor2 = Monitor("Acer", "27 Pulgadas")
raton2 = Raton("Acer", "USB") 
computadora2 = Computadora("Acer", monitor2, teclado2, raton2)

#creamos otra lista de computadoras
teclado3 = Teclado("Lenovo", "USB")
raton3 = Raton("Lenovo", "USB")
monitor3 = Monitor("Lenovo", "24 Pulgadas")
computadora3 = Computadora("Lenovo", monitor3, teclado3, raton3)

teclado4 = Teclado("Asus", "Bluetooth")
monitor4 = Monitor("Asus", "27 Pulgadas")
raton4 = Raton("Asus", "USB")
computadora4 = Computadora("Asus", monitor4, teclado4, raton4)


#Creamos otra lista de computadoras 
teclado5 = Teclado("Apple", "USB")
raton5 = Raton("Apple", "USB")
monitor5 = Monitor("Apple", "27 Pulgadas")
computadora5 = Computadora("Apple", monitor5, teclado5, raton5)

computadora6 = Computadora("Apple", monitor5, teclado5, raton5)
computadora7 = Computadora("Gamer", monitor2, teclado3, raton4)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadoras(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora4, computadora5]
orden2 = Orden(computadoras2)
orden2.agregar_computadoras(computadora6)
print(orden2)
