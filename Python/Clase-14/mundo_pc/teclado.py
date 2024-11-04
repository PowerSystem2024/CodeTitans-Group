from mundo_pc.dispositivo_entrada import DispositivoEntrada


class Teclado(DispositivoEntrada):
    
    contador_teclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_taclados += 1
        self._id_teclado = Teclado.contador_teclados
        super().__init__(marca, tipo_entrada)

        def __str__(self):
            return f"id: {self._id_teclados}, Marca: {self._marca}, Tipo entrada: {self._tipo_entrada}"
        
if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    print(teclado1)
    teclado2 = Teclado("Gamer", "Bluetooth")
    print(teclado2)
        