class Persona {
  static contadorPersona = 0; //Atributo estatico
  // email = 'Valor Default Email';

  static get MAX_OBJ() {
    return 5;
  }

  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    if (Persona.contadorPersona < Persona.MAX_OBJ) {
      this.idPersona = ++Persona.contadorPersona;
    } else {
      console.log('Ha alcanzado el maximo de Instancias');
    }
    // console.log(
    //   `Se incremento contadorObjetoPersona: ${Persona.contadorObjetoPersona}`
    // );
  }

  get nombre() {
    return this._nombre;
  }
  get apellido() {
    return this._apellido;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }
  set apellido(apellido) {
    this._apellido = apellido;
  }

  nombreCompleto() {
    return `${this.idPersona} - ${this._nombre} ${this._apellido}`;
  }

  toString() {
    return this.nombreCompleto();
  }

  static saludar() {
    return 'Hola Mundo desde el Metodo Estatico';
  }

  static saludar2(persona) {
    return `${persona.nombre} ${persona.apellido}`;
  }
}

class Empleado extends Persona {
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }
  set departamento(departamento) {
    this._departamento = departamento;
  }

  //Sobreescritura de metodos
  nombreCompleto() {
    return `${this.idPersona} - ${this._nombre} ${this._apellido} - Area: ${this._departamento}`;
  }
}

let persona1 = new Persona('Martin', 'Perez');
// console.log(persona1);
console.log(persona1.nombre);
console.log(persona1.apellido);

persona1.nombre = 'Martiniano';
persona1.apellido = 'Gomez';

console.log(persona1.nombre);
console.log(persona1.apellido);

let persona2 = new Persona('Juan', 'Estevez');
// console.log(persona2);
console.log(persona2.nombre);
console.log(persona2.apellido);

persona2.nombre = 'Juan Carlos';
persona2.apellido = 'Estevanez';

console.log(persona2.nombre);
console.log(persona2.apellido);

let empleado1 = new Empleado('Maria', 'Jimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.apellido);
console.log(empleado1.departamento);
console.log(empleado1.nombreCompleto());

//persona1.saludar() //Se debe llamar desde la clase no desde el objeto
console.log(Persona.saludar());
console.log(Persona.saludar2(persona2));

console.log(Empleado.saludar());
console.log(Empleado.saludar2(empleado1));

console.log(Persona.contadorObjetoPersona);
console.log(persona1.email);

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersona);
let persona3 = new Persona('Roberto', 'Gomez Bolaños');
console.log(persona3.toString());
console.log(Persona.contadorPersona);
let persona4 = new Persona('Carlos', 'Villagran');
console.log(persona4.toString());
console.log(Persona.contadorPersona);
let persona5 = new Persona('Florinda', 'Meza');
console.log(persona5.toString());
console.log(Persona.contadorPersona);
