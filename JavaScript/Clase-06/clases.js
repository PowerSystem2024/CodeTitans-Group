/*
let persona3 = new Persona("Pedro", "Martinez"); 
Esto no se puede hacer porque la clase Persona DEBE estar definida antes de ser utilizada
*/

//Definimos una "clase"
class Persona {
  //Definimos el constructor
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
  }
  //Creamos nuestro metodo "get" para obtener el nombre
  get nombre() {
    return this._nombre;
  }

  //Creamos nuestro metodo "set" para establecer el nombre
  set nombre(nombre) {
    this._nombre = nombre;
  }

  //Creamos nuestro metodo "get" para obtener el apellido
  get apellido() {
    return this._apellido;
  }

  //Creamos nuestro metodo "set" para establecer el apellido
  set apellido(apellido) {
    this._apellido = apellido;
  }
}

//Creamos la clase "hijo" de la clase Persona
class Empleado extends Persona {
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido); //Llamamos al constructor de la clase padre con la palabra reservada "super"
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = departamento;
  }
}

//Creamos un objeto de la clase Persona
let persona1 = new Persona("Juan", "Perez");
console.log(persona1.nombre); //Accedemos a la propiedad nombre del objeto persona1
persona1.nombre = "Carlos"; //Cambiamos el nombre del objeto persona1
console.log(persona1.nombre); //Accedemos a la propiedad nombre del objeto persona1
//console.log(persona1);
console.log(persona1.apellido); //Accedemos a la propiedad apellido del objeto persona1
persona1.apellido = "Gomez"; //Cambiamos el apellido del objeto persona1
console.log(persona1.apellido); //Accedemos a la propiedad apellido del objeto persona1

console.log("\n*********************");

let persona2 = new Persona("Maria", "Gomez");
console.log(persona2.nombre); //Accedemos a la propiedad nombre del objeto persona2
persona2.nombre = "Ana"; //Cambiamos el nombre del objeto persona2
console.log(persona2.nombre); //Accedemos a la propiedad nombre del objeto persona2
//console.log(persona2);
console.log(persona2.apellido); //Accedemos a la propiedad apellido del objeto persona2
persona2.apellido = "Perez"; //Cambiamos el apellido del objeto persona2
console.log(persona2.apellido); //Accedemos a la propiedad apellido del objeto persona2

//Creamos un objeto de la clase Empleado (clase hija de Persona)
let empleado1 = new Empleado("Pedro", "Martinez", "Sistemas");
console.log(empleado1); //Mostramos el objeto empleado1
console.log(empleado1.nombre); //Accedemos a la propiedad nombre del objeto empleado1
