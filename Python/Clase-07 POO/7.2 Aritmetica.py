class Aritmetica:

    def __init__(self, num1, num2):
        self.num1 = num1
        self.num2 = num2

    def sumar(self):
        return self.num1 + self.num2
    def restar(self):
        return self.num1 - self.num2
    def multiplicar(self):
        return self.num1 * self.num2
    def dividir(self):
        return self.num1 / self.num2

aritmetica1 = Aritmetica(5, 9)
print(f'El resultado de la suma es: {aritmetica1.sumar()}')
print(f'El resultado de la resta es: {aritmetica1.restar()}')
print(f'El resultado de la multiplicacion es: {aritmetica1.multiplicar()}')
print(f'El resultado de la division es: {aritmetica1.dividir():.2f}')
