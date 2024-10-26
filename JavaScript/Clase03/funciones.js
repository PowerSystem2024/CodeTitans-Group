//Llamar una funcion antes de definirla o despues se lo conoce como hosting
//hosting: mueve la declaracion de la funcion al inicio del programa para utilizarla en cualquier parte 

miFuncion(8, 2);


function miFuncion(a, b){                               //Una funcion puede o no tener parametros que al momento
    console.log("Sumamos "+a+" + "+b+": " + (a + b));   //de ser llamada seran argumentos
    return "Sumamos "+a+" + "+b+": " + (a + b);  //ponemos return para***
}

//Llamando la funcion

miFuncion(5, 4);

//*** que cuando queramos asignar la funcion a una variable mostrara el console.log
//y para que se muestre en el output de la variable creada, usamos return

let resultado = miFuncion(6, 7); 
console.log(resultado);

//Funciones de tipo expresion o funciones anonimas

let x = function(a, b){ return a + b};
resultado = x(5, 6);
console.log(resultado);

//funciones de tipo self y invoking

(function(a, b){
    console.log('Ejecutamos la funcion: '+(a + b));
})(9, 6); //se llama a si misma con los parentesis al final y no se puede reutilizar 

//metodo arguments
//asocia los argumentos como si fueran un arreglo ya que una funcion es un objeto que tiene propiedades y metodos
//lo usamos para saber cuantos argumentos tiene y con .length nos mostrara la cantidad de argumentos que tendra
//se debe estar dentro del bloque de la funcion

console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments);
    console.log(arguments.length);
}

miFuncionDos(5, 7);

//toString = convierte la funcion a texto
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones flecha
//cuando utilizamos funciones fechas, no es necesario utilizar la palabra reservada function, tampoco las llaves
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); //asignamos el valor a una variable
console.log(resultado);
/*
al definir una funcion, dentro de los pararentesis se definen variables, a esto se lo
conoce parametros, cuando llamamos a la funcion, le ponemos los argumentos
los argumentos son los valores que le asignamos a los parametros definidos en la funcion
la funcion tiene una propiedad llamada arguments es un arreglo, para poder acceder a los
diferentes valores de los parametros
*/

//funcion por expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //muestra el parametro de a
    console.log(arguments[1]);
    console.log(arguments[2]);
    return a + b + arguments[2];
}
resultado = sumar(3, 2, 9); //no es necesario que coincidan el numero de argumentos con el numero de parametros
console.log(resultado);

//sumar todos los argumentos

let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//Tipos primitivos
//aqui la variable solo paso una copia, pero no se modifico, esto se conoce como paso por valor

let k = 10;
function cambiarValor(a){ //paso por valor
    return a = 20;
}

cambiarValor(k);
console.log(k);

//Paso por referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
} 

//modificamos a travez de una funcion/metodo, los valores de los atributos creados en el objeto persona
//le pasamos la referencia hexadecimal del espacio de memoria donde esta alojado el objeto
console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);



