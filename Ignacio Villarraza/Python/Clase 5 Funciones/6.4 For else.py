numeros = [1,2,3,4,5,6]

for n in numeros:
    print(n)
    #La unica manera de que no se ejecute el else es con un IF
    if n == 3:
        break
else:
    print("Esto se termina!") #No se ejecutara por el break en el IF 