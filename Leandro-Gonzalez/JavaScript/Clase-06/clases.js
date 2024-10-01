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
  //Creamos un metodo para obtener el nombre completo
  nombreCompleto() {
    return this._nombre + " " + this._apellido;
  }

  //Sobreescribimos el metodo toString de la clase padre Object
  toString() {
    //se aplica el polimorfismo (multiples formas en tiempo de ejecucion)
    //el metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
    return this.nombreCompleto();
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

  //Sobreescribimos el metodo nombreCompleto de la clase Persona
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento;
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
console.log(empleado1.nombreCompleto()); //Accedemos al metodo nombreCompleto del objeto empleado1

//Object.prototype.toString Esta es la manera de acceder a atributos y metodos de manera dinamica

console.log(empleado1.toString()); //Accedemos al metodo toString del objeto empleado1
console.log(persona1.toString()); //Accedemos al metodo toString del objeto persona1
