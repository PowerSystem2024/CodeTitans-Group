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

//Funciones de tipo expresion

