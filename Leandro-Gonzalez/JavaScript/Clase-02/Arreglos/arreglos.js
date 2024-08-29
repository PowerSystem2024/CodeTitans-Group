//Trabajar con arrglos

//Sintaxis antigua
//let autos = new Array("Ferrari", "Renault", "BMW")

//Sintaxis actual
const autos = ["Ferrari", "Renault", "BMW"];
console.log(autos);

//Recorremos los elementos de un array
console.log(autos[0]);

for (let index = 0; index < autos.length; index++) {
  console.log(index + " : " + autos[index]);
}

//Modificar los elementos del array
autos[1] = "Volvo";
console.log(autos[1]);

//Agregar nuevos valores al array
autos.push("Audi"); //Con el metodo ".push()" agregamos un elemento al final
console.log(autos);

//Otras formas de agregar elementos al array
autos[autos.length] = "Porsche";
console.log(autos);

//Otra forma mas de agregar elementos (Teniendo cuidado)
autos[6] = "Fiat";
console.log(autos);

//Como preguntar si es un array
console.log(Array.isArray(autos)); //Devuelve un booleano

//Preguntamos si la variable es una instancia de la clase array
console.log(autos instanceof Array);
