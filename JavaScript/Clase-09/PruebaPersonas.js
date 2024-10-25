class Persona {
  static contadorPersonas = 0; //Atributo estatico de la clase

  //Constructor
  constructor(nombre, apellido, edad) {
    //atributos encapsulados
    this._idPersona = ++Persona.contadorPersonas;
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
  }

  //Metodos get y set
  get idPersona() {
    return this._idPersona;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get apellido() {
    return this._apellido;
  }

  set apellido(apellido) {
    this._apellido = apellido;
  }

  get edad() {
    return this._edad;
  }

  set edad(edad) {
    this._edad = edad;
  }

  //Metodo toString
  toString() {
    return `
        idPersona: ${this._idPersona}, 
        nombre: ${this._nombre}, 
        apellido: ${this._apellido}, 
        edad: ${this._edad}`;
  }
}

//Creamos la clase Empleado
class Empleado extends Persona {
  static contadorEmpleados = 0;

  //Constructor
  constructor(nombre, apellido, edad, sueldo) {
    super(nombre, apellido, edad); //Atributos heredados de la clase Persona
    this._idEmpleado = ++Empleado.contadorEmpleados; //Atributo propio de la clase
    this.sueldo = sueldo; //Atributo propio de la clase
  }

  //Metodos get y set
  get idEmpleado() {
    return this._idEmpleado;
  }

  get sueldo() {
    return this._sueldo;
  }

  set sueldo(sueldo) {
    this._sueldo = sueldo;
  }

  //Metodo toString
  toString() {
    return `
            ${super.toString()} 
            idEmpleado: ${this._idEmpleado}, 
            sueldo: ${this._sueldo}`;
  }
}

//Creamos la clase Cliente
class Cliente extends Persona {
  static contadorClientes = 0;

  constructor(nombre, apellido, edad, fecharegistro) {
    super(nombre, apellido, edad);
    this._idCliente = ++Cliente.contadorClientes;
    this._fechaRegistro = fecharegistro;
  }

  get idCliente() {
    return this._idCliente;
  }

  get fechaRegistro() {
    return this._fechaRegistro;
  }

  set fechaRegistro(fechaRegistro) {
    this._fechaRegistro = fechaRegistro;
  }

  toString() {
    return `
            ${super.toString()} 
            idCliente: ${this._idCliente}, 
            fechaRegistro: ${this._fechaRegistro}`;
  }
}

//Prueba clase Persona
let persona1 = new Persona("Juan", "Perez", 28);
console.log(persona1.toString());

let persona2 = new Persona("Carlos", "Lara", 35);
console.log(persona2.toString());

//Prueba clase Empleado
let empleado1 = new Empleado("Carla", "Gomez", 25, 5000);
console.log(empleado1.toString());

let empleado2 = new Empleado("Laura", "Quintero", 33, 7000);
console.log(empleado2.toString());

//Prueba clase Cliente
let cliente1 = new Cliente("Miguel", "Fernandez", 40, new Date());
console.log(cliente1.toString());

let cliente2 = new Cliente("Luis", "Lopez", 50, new Date());
console.log(cliente2.toString());
