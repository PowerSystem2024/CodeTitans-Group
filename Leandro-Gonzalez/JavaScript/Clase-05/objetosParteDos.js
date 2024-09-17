// OBJETOS

let x = 10; //Variable de tipo primitiva
console.log(x.length); //Devuelve "undefined"
console.log("Tipos primitivos");

//Creamos un objeto
let persona = {
  nombre: "Leandro",
  apellido: "Gonzalez",
  email: "leandev@test.com",
  edad: 28,
  idioma: "es",
  get lang() {
    return this.idioma.toUpperCase(); //Convierte las minusculas a mayusculas
  },
  set lang(lang) {
    this.idioma = lang.toUpperCase();
  },
  nombreCompleto: function () {
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    //Este es el metodo "get"
    return "El nombre es: " + this.nombre + ", Edad: " + this.edad;
  },
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

//Metodo get
console.log("Comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

console.log("Comenzamos con el metodo get y set para idiomas");
persona.lang = "en"; //Cambiamos el idioca con "toUpperCase"
console.log(persona.lang);

//Constructores de objetos
function Persona3(nombre, apellido, email) {
  //Constructor
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  this.nombreCompleto = function () {
    //Creamos una funcion dentro del constructor
    return this.nombre + " " + this.apellido;
  };
}
let padre = new Persona3("Leandro", "Gonzalez", "leandev@test.com");
padre.nombre = "Agustin"; //Podemos modificar los valores ya asignados
padre.telefono = "5493814241823"; //Propiedad exclisiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion creada dentro del constructor

let madre = new Persona3("Ines", "Albarracin", "ines2024@test.com");
console.log(madre);
console.log(madre.telefono); //Devuelve "undefined" por que la propiedad no esta definida
console.log(madre.nombreCompleto()); //Utilizamos la funcion creada dentro del constructor

//Diferentes formas de vrear objetos

//Caso objeto 1
let miObjeto = new Object(); //Esta es una opcion formal

//Caso objeto 2
let miObjeto2 = {}; //Esta es la opcion breve y recomendada

//Caso String 1
let miCadena1 = new String("Hola"); //Sintaxis formal

//Caso String 2
let miCadena2 = "Hola"; //Sintaxis breve y recomendada

//Caso con numeros 1
let miNumero = new Number(1); //Sintaxis formal y no recomendable

//Caso con numeros 2
let miNumero2 = 1; //Sintaxis breve y recomendada

//Caso boolean 1
let miBoolean1 = new Boolean(false); //Sintaxis formal

//Caso boolean 2
let miBoolean2 = false; //Sintaxis breve y recomendada

//Caso arreglos 1
let miArreglo1 = new Array(); //Sintaxis formal

//Caso arreglos 2
let miArreglo2 = []; //Sintaxis breve y recomendada

//Caso funcion 1
let miFuncion1 = new (function () {})(); //Todo despues de new es considerado objeto

//Caso funcion 2
let miFuncion2 = function () {}; //Sintaxis breve y recomendada

//Uso de prototype
Persona3.prototype.telefono = "3814241823";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "543814241823";
console.log(madre.telefono);

//Uso del metodo Call
let persona4 = {
  nombre: "Jose",
  apellido: "Peña",
  nombreCompleto2: function (titulo, telefono) {
    return titulo + ": " + this.nombre + " " + this.apellido + " " + telefono;
    //return this.nombre+" "+this.apellido
  },
};

let persona5 = {
  nombre: "Carlos",
  apellido: "Gonzalez",
};

console.log(persona4.nombreCompleto2("Lic.", "5493815231278"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing.", "5493814231277"));

//Uso del metodo Apply
let arreglo = ["Ing.", "5493815786921"];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
