//Dada la siguien te tupla (array en JS)
const array = [13, 1, 8, 3, 2, 5, 8]; // Definimos el array

// Crear un array que solo incluya los números menores a 5
// e imprimir el resultado en la consola

// Definimos el array para almacenar los números menores a 5
const lista = [];

// Recorremos cada elemento del array
for (let i = 0; i < array.length; i++) {
  // Verificamos si el elemento es menor a 5
  if (array[i] < 5) {
    lista.push(array[i]); // Agregamos el número a 'lista'
  }
}

// Imprimimos el array en la consola una vez terminado el bucle
console.log(lista);
