class miclase:

    #variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = "esta es una variable de clase"

    def __init__(self, variable_instancia): #la variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia

print(miclase.variable_clase)
miclase1 = miclase("esta es una variable de instancia")
print(miclase1.variable_instancia)

miclase2 = miclase("esta es otra prueba de variable de instancia")
print(miclase1.variable_instancia)
print(miclase1.variable_clase)
miclase2 = miclase("esta es otra prueba de variable de instancia")
print(miclase2.variable_instancia)
print(miclase2.variable_clase)