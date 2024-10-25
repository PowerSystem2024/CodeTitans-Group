//objeto

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

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.mail);
console.log(persona.edad);
console.log(persona.nombreCompleto());

let persona2 = new Object(); //Crea un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Calle sin nombre 123';
persona2.telefono = '33344455666';

console.log(persona2.telefono);
console.log(persona2['telefono']);

for (propiedad in persona) {
  console.log(propiedad);
  console.log(persona[propiedad]);
}

persona.apellido = 'Giles';
console.log(persona.apellido);

persona.nombres = 'Pedro'; //Esto agrega otra propiedad al objeto porque JS es case sensitive
console.log(persona.nombres);

delete persona.nombres; //eliminamos la propiedad creada anteriormente
console.log(persona);

//Formas de Imprimir un objeto
//N1
console.log('1 - Concatenecion de propiedades');
console.log(`${persona.nombre} ${persona.apellido}`);

//N2
console.log('2 - Con Ciclo FOR IN');
for (nombrePropiedad in persona) {
  console.log(persona[nombrePropiedad]);
}

//N3
console.log('3 - Con Oject.values()');
let personaArray = Object.values(persona);
console.log(personaArray);

//N4
console.log('4 - con el metodo JSON stringify');
let personaStringify = JSON.stringify(persona);
console.log(personaStringify);
