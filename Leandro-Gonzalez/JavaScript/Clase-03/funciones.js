//Funciones con js

//Llmamos a la funcion "antes de crearla (esto se conoce como hoisting)"
miFuncion(10, 6); //Este resultado se mostrara primero

//Creamos la funcion
function miFuncion(a, b) {
  //console.log("Sumamos: " + (a + b));
  return a + b;
}

//LLamamos la funcion
miFuncion(5, 4); //Le pasamos los valores que queremos que se sumen

let resultado = miFuncion(7, 8);
console.log(resultado);

//Declaramos una funcion de tipo expresion o funcion anonima
let x = function (a, b) {
  return a + b;
};

resultado = x(5, 6);
console.log(resultado);

//Funciones de tipo self o invoking
//Tambien es una funcion anonima y se esta llamando asimisma
(function (a, b) {
  console.log("Ejecutando la funcion: " + (a + b));
})(9, 6); //No la podemos reutilizar

//Saber de que tipo es nuestra funcion y cuantos argumentos tiene
console.log(typeof miFuncionDos);
function miFuncionDos(a, b) {
  console.log(arguments);
}

miFuncionDos(4, 5);

//toString
var miFuncionString = miFuncionDos.toString();
console.log(miFuncionString);

//Funciones de tipo flecha
// No se utiliza la palabra reservada "function"
// No se utlizan las llaves
// No se utiliza la palabra "return"
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(10, 8); //Asignamos el valor a una variable
console.log(resultado);

//Funcion de tipo expresion
let sumar = function (a = 4, b = 8) {
  console.log(arguments[0]); //Muestra el parametro de a
  console.log(arguments[1]); //Muestra el parametro de b
  return a + b + arguments[2];
};
resultado = sumar(3, 2, 9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo() {
  let suma = 0;
  for (let i = 0; i < arguments.lengt; i++) {
    suma += arguments[i]; //arguments es para arreglos
  }
  return suma;
}

//Tipos primitivos
let j = 10;
function cambiarValor(a) {
  //Paso por valor
  a = 20;
}

cambiarValor(j);
console.log(j);

//Paso por referencia
const persona = {
  nombre: "Juan",
  apellido: "Sanchez",
};
console.log(persona);

function cambiarValorObjeto(p1) {
  p1.nombre = "Pablo";
  p1.apellido = "Lopez";
}

cambiarValorObjeto(persona);
console.log(persona);
