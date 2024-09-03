//Creacion de Array o arreglos
//let autos = new Arrey ('Ferrari', 'Renault', 'BMW'); esta es la sintaxis vieja

const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Recorremos los elementos de una arreglo

console.log(autos[0]);
console.log(autos[2]);

// Recorrer arreglo con ciclo for

for(let i = 0; i < autos.length; i ++){
    console.log((i + 1)+' : '+autos[i]);
}

// Modificamos los elementos del arreglo

autos[1] = 'Volvo';
console.log(autos[1]);
console.log(autos);

// Agregamos nuevos valores al arreglo

autos.push('Audi');
console.log(autos);

//Otras formas de agregar elementos al arreglo

autos[autos.length] = 'Porche';
console.log(autos);

//Tercera forma de agregar elementos teniendo cuidado

autos[6] = 'Renault';
console.log(autos);

//este espacio vacio en el espacio 5 del arreglo, esta ocupando memoria

//Como preguntar si es un Array o Arreglo

console.log(Array.isArray(autos));

console.log(autos instanceof Array); //Preguntamos si la variable es una instancia de la clase Array

