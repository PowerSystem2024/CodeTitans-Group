// OBJETOS

let x = 10; //Variable de tipo primitiva
console.log(x.length); //Devuelve "undefined"
console.log("Tipos primitivos");

//Creamos un objeto
let persona = {
  nombre: "Leandro",
  apellido: "Gonzalez",
  email: "leandev@test.com",
};

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto());
console.log(persona);
console.log("Ejecutando con un objeto");

//Creamos un nuevo objeto de diferente manera
let persona2 = new Object();
persona2.nombre = "Juan";
persona2.direccion = "Mitre 69";
persona2.telefono = "43456789";
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");

//Acceder a las propiedades de los objetos
console.log(persona["apellido"]); //accedemos como si fuera un arreglo
console.log("Usamos el ciclo for in");
//for in para acceder a la propiedad y luego a su valor
for (propiedad in persona) {
  console.log(propiedad); //Accedemos a la propiedad del objeto
  console.log(persona[propiedad]); //Accedemos al valor del objeto
}

console.log("Cambios y eliminamos un error");
//Agregar y eliminar propiedades de un objeto
persona.apellida = "Gomez"; //Creamos dinamicamente un valor al objeto
delete persona.apellida; //Eliminamos el valor creado por error
console.log(persona);

//Distintas formas para imprimir un objeto

//Nº1: la mas sencilla es concatenar cada valor de cada propiedad
console.log("Distintas formas para imprimir un objeto: Forma 1");
console.log(persona.nombre + ", " + persona.apellido);

//Nº2: Con el ciclo for in
console.log("Distintas formas para imprimir un objeto: Forma 2");
for (nombrePropiedad in persona) {
  console.log(persona[nombrePropiedad]);
}

//Nº3: Con la funcion "objet.values()" devuelve nuestro objeto pero como un array
console.log("Distintas formas para imprimir un objeto: Forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//Nº4: Utilizamos el metodo JSON.stringify
console.log("Distintas formas para imprimir un objeto: Forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);
