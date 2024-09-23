def desplegar_nombres(nombres):
    for nombre in nombres:
        print(nombre)

nombres = ["Pedro", "Tito", "Carlos"]
desplegar_nombres(nombres)
desplegar_nombres("Carla")
# desplegar_nombres(10) # No se puede iterar sobre numeros
desplegar_nombres([10])
desplegar_nombres((22, 55))