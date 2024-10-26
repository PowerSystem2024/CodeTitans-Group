/*tipo primitivo no contienen propiedades ni metodos
un objeto puede tener propiedades y metodos
*/

let x = 10; //variable tipo primitiva
console.log(x.length); 

//Objeto: se crea un objeto en memoria con las propiedades
//del mismo y se crea un espacion de memoria hexadecimal para guardar las propiedades

let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES', 
    nombreCompleto: function(){ //metodo o funcion
        return this.nombre + ' ' + this.apellido; //para acceder a las propiedades del objeto persona usamos this
    },
    get nombreEdad(){ //Este es el metodo get
        return this.nombre+' edad: '+this.edad;
    },
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    }

}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);

//agregaremos metodos a los objetos

console.log(persona.nombreCompleto());

//new

let persona2 = new Object(); //debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '451564541';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto'); 
console.log(persona['apellido']);
console.log('Usamos el ciclo for in');

//Accedemos como si fuera un arreglo

console.log(persona['apellido']); 


//for in y accedemos al objeto como si fuera un arreglo

for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
persona.apellido = 'Betancud'; //Cambiamos dinamicamente un valor del objeto
console.log(persona);

//Distinta forma de imprimir un objeto
//Numero 1: la mas sencilla, concatenar cada valor de cada propiedad

console.log('\nDistinta forma de imprimir un objeto: forma 1');
console.log(persona.nombre +', '+persona.apellido);

//numero 2: a travez del ciclo for in

console.log('\nDistinta forma de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//numero 3: La funcion Object.value()

console.log('\nDistinta forma de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: utilizaremos el metodo JSON.stringify
//lo convierte en una cadena

console.log('\nDistinta forma de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el metodo get');
console.log(persona.nombreEdad);

console.log('Comenzamos a utilizar el metodo get y set para el idioma');
console.log(persona.lang)
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //constructor
    this.nombredePersona3 = nombre; //puse nombredePersona3 para comprender bien el uso de this
    this.apellidoPersona3 = apellido;
    this.email = email;
    
    this.nombreCompletoTelefono = function(){
        return this.nombredePersona3 + ' ' + this.apellidoPersona3 + ' '+ this.telefono;
    };
    
    this.nombreCompleto = function(){
        return this.nombredePersona3 + ' ' + this.apellidoPersona3;
    };
}

let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombredePersona3 = 'Juan';
padre.telefono = '54453256656'; //podemos agregar un atributo

let hijo = new Persona3('Robert', 'Plant', 'RobertPlant@gmail.com');

console.log(padre.nombreCompletoTelefono());
console.log(padre);

console.log(hijo);
console.log(hijo.nombreCompleto());
console.log(hijo.telefono);


/*
//Diferentes formas de crear objetos 
//Caso numero 1
let miObjeto = new Object(); //Esta es una opcion formal
//Clase numero 2
let miObjeto = {}; //Esta opcion es breve y recomendada

//Caso String
let miCaddena1 = new String('Hola'); //Sintaxis formal
//Caso String 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//Caso con numeros
let miNumero2 = new Number(1); //Sintaxis recomendada
//Caso con numeros 2 
let miNumero2 = 1 //Sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false); //formal
//caso boolean 2
let miBoolean2 = false; //Sintaxis recomendada

//caso Arreglos 1
let miArreglo1 = new Array(); //Formal
//caso Arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//caso function 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso function 2
let miFuncion2 = function(){}; //Notacion simplificada y recomendada

*/

//podemos crear un atributo que afecte a todos los objetos que vayamos creando sin tener que modificar el constructur
//para ello utilizamos la funcion prototype

Persona3.prototype.telefono;
console.log(padre);
hijo.telefono = 264136;
console.log(hijo.telefono);

//Uso de metodo call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto: function(titulo, telefono){
        return titulo + ': ' +this.nombre + ' ' + this.apellido + ' ' + telefono;
        
    },
    nombreCompleto2: function(){
        return this.nombre + ' ' + this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto('Lic', '54673523'));
console.log(persona4.nombreCompleto.call(persona5,'Ing', '4342356124'));

//Metodo Apply 
//nos permite llamar un metodo que un objeto no tiene definido
//pero si debemos pasarle los argumentos, estos deben ser a travez de un arreglo, en cambio en call se los pasabas directamente
console.log(persona4.nombreCompleto2.apply(persona5));

let arreglo = ['Ing', '4553226346'];
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));

