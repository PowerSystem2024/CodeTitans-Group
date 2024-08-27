//Ejercicio 3: Crear un rango de 3 a 10 con incremento de 2 en 2
//Ejemplo de ejecucion: 3, 5, 7, 9

const inicio = 3;
const fin = 11;
const incremento = 2;

// Array para almacenar la secuencia generada
const rango = [];

// Generamos la secuencia usando un bucle "for"
for (let i = inicio; i < fin; i += incremento) {
  rango.push(i); // Agregamos el número actual al array 'rango'
}

// Recorremos el array 'rango' y lo imprimimos en la consola
for (let i = 0; i < rango.length; i++) {
  console.log(rango[i]);
}
