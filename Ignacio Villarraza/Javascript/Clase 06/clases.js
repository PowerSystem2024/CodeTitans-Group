class Persona {
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
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
