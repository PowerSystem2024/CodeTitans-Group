// Ciclo while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;             // Operador unario de post incremento 
}
console.log("Fin del ciclo while");

// Ciclo do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++; 
}while(conteo < 3);
console.log("Fin del ciclo do while");

// Ciclo for
for(let contando = 0; contando < 3 ; contando++ ){
    console.log(contando);
}
console.log("Fin del ciclo for");

// Palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando); 
        break;                 // Al encontrar el primer numero par rompe el ciclo for
    }
}
console.log("Termina el ciclo al encontrar el primer numero par")

// La palabra continue 

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){     //cuando es un numero impar
        continue;               // Ignora el numero par, va a la siguiente iteracion  
    }                           // E imprime por consola todos los pares
    console.log(contando);
}
console.log("Termina el ciclo")

// Etiquetas Labels
// nos permite ir a una parte de nuestro programa
// Programacion go to, no es recomendada
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){     
        break inicio;           // Va a la siguiente iteracion               
    }                           
    console.log(contando);
}
console.log("Termina el ciclo")