#Desempaquetado de Listas

def show(nombre, apellido):
    print(f"{nombre} {apellido}")

lista_personas = ["Nacho", "Villarraza"]
tupla_personas = ("Ignacio", "Villarraza")
dict_personas = {"nombre" : "Ariel", "apellido": "Betancud"}

show(*lista_personas)
show(*tupla_personas)
show(**dict_personas)