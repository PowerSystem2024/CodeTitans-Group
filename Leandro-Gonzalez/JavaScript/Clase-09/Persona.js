//Creamos la clase Persona
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
