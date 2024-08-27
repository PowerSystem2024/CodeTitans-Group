//Ejercicio 01: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
//Ejemplo de ejecucion: 0, 3, 6, 9

// Recorremos los números del 0 al 10
for (let i = 0; i <= 10; i++) {
  // Verificamos si el número es divisible por 3
  if (i % 3 === 0) {
    // Imprimimos el número en la consola si es divisible por 3
    console.log(i);
  }
}
