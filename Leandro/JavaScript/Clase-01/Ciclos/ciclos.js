// While

//Inicializamos la variable "contador" en 0
let contador = 0;
//ponemos la condicion dentro de los parentecis
while (contador < 3) {
  console.log(contador);
  contador++;
}
console.log("Fin del ciclo while");

// do while
let conteo = 0;

do {
  console.log(conteo);
  conteo++;
} while (conteo < 3);
console.log("Fin del ciclo do while");

// Ciclo for
for (let contando = 0; contando < 3; contando++) {
  console.log(contando);
}
console.log("Fin del ciclo for");

// Palabra reservada "break"
for (let contando = 0; contando <= 10; contando++) {
  if (contando % 2 == 0) {
    console.log(contando); //Muestra los pares
    break; // Encuentra el primer numero "par" y termina
  }
}
console.log("Fin del ciclo al encontrar el primer numero par");

// La palabra continue
for (let contando = 0; contando <= 10; contando++) {
  if (contando % 2 !== 0) {
    continue; //Ir a la siguiente iteracion
  }
  console.log(contando);
}
console.log("Fin del ciclo");

// Etiquetas leabels
// No son recomendadas
inicio: for (let contando = 0; contando <= 10; contando++) {
  if (contando % 2 !== 0) {
    break inicio; //Ir a la siguiente iteracion
  }
  console.log(contando);
}
console.log("Fin del ciclo");
