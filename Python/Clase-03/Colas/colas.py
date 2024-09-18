#Colas con listas
#Estructura de datos de tipo "fifo" (first input / first output)

cola = ["Leandro", "Agustin", "Ines", "Amanda"]

#Agregamos elementos al final
cola.append("Andrea")
cola.append("Olga")
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0) #En este caso sacamos al primero de la "cola" simulando que ya lo antendieron
print(f"Antendido el cliente/a: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Antendido el cliente/a: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Antendido el cliente/a: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Antendido el cliente/a: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Antendido el cliente/a: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Antendido el cliente/a: {seRetira}")
print(cola)