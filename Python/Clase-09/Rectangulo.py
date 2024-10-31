class Rectangulo():
    def area(self):
        return self._alto * self._ancho

    def __str__(self):
        return f"Rectangulo(alto={self._alto}, ancho={self._ancho}, color={self._color}, area={self.area()})"