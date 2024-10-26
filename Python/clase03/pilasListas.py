# Pilas usando listas

pila = [1, 2, 3]

# Agregar elementos a la pila por el final
# este metodo sirve para agregar siempre al final o quitar al final de nuestra lista

pila.append(4)
pila.append(5)
pila.append(6)
print(pila)

# Sacamos elementos desde el final, la funcion .pop elimina el ultimo elemento de nuestra lista

elementoBorrado = pila.pop()
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedo asi: {pila}')

# Colas con listas
# Estructuras de datos de tipo fifo(first input / first output)

cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos

cola.append('Natalia')
cola.append('Jose')
print(cola)

# Sacamos elementos de la cola

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

