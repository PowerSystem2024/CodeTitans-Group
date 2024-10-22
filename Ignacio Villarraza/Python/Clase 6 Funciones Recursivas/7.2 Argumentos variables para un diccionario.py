
def listar_terminos(**kwargs):
    for llave, valor in kwargs.items():
        print(f"{llave} : {valor}")

listar_terminos(IDE='Integrated Development Environment', PK='Primary Key')
listar_terminos(Nombre="Lionel Messi")