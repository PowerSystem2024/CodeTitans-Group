let persona = {
  nombre: 'Carlos',
  apellido: 'Gil',
  mail: 'cgil@mail.com',
  edad: 30,
  idioma: 'es',
  get lang() {
    return this.idioma.toUpperCase();
  },
  set lang(lang) {
    this.idioma = lang;
  },
  nombreCompleto: function () {
    return `${this.nombre} ${this.apellido}`;
  },
  get nombreEdad() {
    return `${this.nombre} - Edad: ${this.edad} años.`;
  },
};

//Metodo GET
console.log('Utilizando Metodo GET');
console.log(persona.nombreEdad);

//Metodo SET
console.log('Utilizando Metodo SET');
console.log(persona.lang);
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, mail) {
  this.nombre = nombre;
  this.apellido = apellido;
  this.mail = mail;
  this.nombreCompleto = function () {
    return `${this.nombre} ${this.apellido}`;
  };
}

let padre = new Persona3('Leo', 'Lopez', 'llop@mail');
console.log(padre);
padre.nombre = 'Leonardo';
console.log(padre);

let madre = new Persona3('Laura', 'Contreras', 'lcont@mail');
console.log(madre);
console.log(madre.nombreCompleto());

//Diferentes Formas de Crear Objetos
// La primera opcion es la opcion formal, y la segunda es la recomendada.
let miObjeto1 = new Object();
let miObjeto2 = {};

let miCadena1 = new String('Hola Mundo');
let miCadena2 = 'Hola Mundo';

let miNumero1 = new Number(1);
let miNumero2 = 1;

let miBooleano1 = new Boolean(true);
let miBooleano2 = true;

let miArray1 = new Array();
let miArray2 = [];

let miFuncion1 = new Function();
let miFuncion2 = function () {};

Persona3.prototype.telefono = '0343456';

console.log(madre.telefono);

//Uso CALL

let persona2 = {
  nombre: 'Juan',
  apellido: 'Perez',
  nombreCompleto: function (titulo, telefono) {
    return `${titulo} ${this.nombre} ${this.apellido} - Telefono: ${telefono}`;
    // return `${this.nombre} ${this.apellido}`;
  },
};

let persona3 = {
  nombre: 'Carlos',
  apellido: 'Juarez',
};

// console.log(persona2.nombreCompleto('Lic.', '22334455'));
// console.log(persona2.nombreCompleto.call(persona3, 'Ing.', '55667788'));

let arrayCarlos = ['Ing.', '55667788'];
console.log(persona2.nombreCompleto.apply(persona3, arrayCarlos));
