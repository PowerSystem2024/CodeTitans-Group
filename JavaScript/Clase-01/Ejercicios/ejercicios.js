// Ejercicio 1: iterar un rango de 0 a 10 
//e imprimir numeros divisibles entre 3

for (i = 0; i < 11; i++){
    if (i % 3 == 0){
        console.log(i);
    }
}
console.log('Termina el ciclo');

// Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos

let numero = 2;
while(2 <= numero && numero < 7){
    console.log(numero);
    numero++;
}

// Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1

for (i = 3; i < 11; i+= 2){
    console.log(i);
}