#Pilas usando listas
pila = [1, 2, 3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Elimar elementos desde el fina
elementoBorrado =  pila.pop() #Elimina el ultimo elemento y lo guarda en la variable
print(f"Sacamos el elmento {elementoBorrado}")
print(f"La pila que ahora asi: {pila}")
