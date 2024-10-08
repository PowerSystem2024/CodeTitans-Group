/*
let persona3 = new Persona("Pedro", "Martinez"); 
Esto no se puede hacer porque la clase Persona DEBE estar definida antes de ser utilizada
*/

//Definimos una "clase"
class Persona {
  //clase padre

  static contadorPersonas = 0; //atributo estatico de nuestra clase
  //email = "Valor default email"; //atributo no estatico de nuestro objeto

  //definimos un metdo estatico
  static get MAX_OBJ() {
    //metodo estatico que simula una constante
    return 5;
  }

  //Definimos el constructor
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    if (Persona.contadorPersonas < Persona.MAX_OBJ) {
      this.idPersona = ++Persona.contadorPersonas; //atributo no estatico
    } else {
      console.log("Se han superado el maximo de objetos permitidos");
    }

    //Persona.contadorObjetosPersona++; //cada vez que se crea un objeto de la clase Persona se incrementa el contador
    //console.log("Se incrementa contador: " + Persona.contadorObjetosPersona);
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
    return this.idPersona + " " + this._nombre + " " + this._apellido;
  }

  //Sobreescribimos el metodo toString de la clase padre Object
  toString() {
    //se aplica el polimorfismo (multiples formas en tiempo de ejecucion)
    //el metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
    return this.nombreCompleto();
  }

  //Agregamos el metodo "static" para poder acceder a el sin necesidad de instanciar un objeto
  static saludar() {
    console.log("Saludos desde el metodo static");
  }

  //creamos otro metodo static
  static saludar2(persona) {
    console.log(persona.nombre + " " + persona.apellido);
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

//Accedemos al metodo static de la clase Persona
//persona1.saludar(); no se utiliza desde el objeto, se utiliza desde la clase

Persona.saludar(); //esta es la manera correcta de acceder a un metodo static
Persona.saludar2(persona1); //esta es la manera correcta de acceder a un metodo static

//Accedemos al metodo static de la clase Empleado
Empleado.saludar(); //esta es la manera correcta de acceder a un metodo static
Empleado.saludar2(empleado1); //esta es la manera correcta de acceder a un metodo static

// Probamos el contador de objetos de la clase Persona
//console.log(persona1.contadorObjetosPersona); //No se puede acceder a un atributo static desde un objeto
console.log(Persona.contadorObjetosPersona); //Accedemos al atributo static de la clase Persona (padre)
console.log(Empleado.contadorObjetosPersona); //Accedemos al atributo static de la clase Empleado (hijo)

//atributo no estatico
console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); //no se puede acceder a un atributo no estatico desde la clase

console.log(persona1.toString()); //Al llamar al metodo toString de persona1 se ejecuta el metodo toString de la clase Persona
console.log(persona2.toString()); //Al llamar al metodo toString de persona2 se ejecuta el metodo toString de la clase Persona
console.log(empleado1.toString()); //Al llamar al metodo toString de empleado1 se ejecuta el metodo toString de la clase Empleado
console.log(Persona.contadorPersonas); //Accedemos al atributo static de la clase Persona (padre)

//Creamos mas objetos del tipo persona
let persona3 = new Persona("Paula", "Ramirez");
console.log(persona3.toString()); //Al llamar al metodo toString de persona3 se ejecuta el metodo toString de la clase Persona
console.log(Persona.contadorPersonas); //Accedemos al atributo static de la clase Persona (padre)

// Probamos el metodo static MAX_OBJ
console.log(Persona.MAX_OBJ); //Accedemos al metodo static de la clase Persona
//Persona.MAX_OBJ = 10; No se puede modificar el valor de un atributo static
console.log(Persona.MAX_OBJ); //Accedemos al metodo static de la clase Persona

//creamos un objeto de la clase Persona
let persona4 = new Persona("Luis", "Gomez");
console.log(persona4.toString()); //Al llamar al metodo toString de persona4 se ejecuta el metodo toString de la clase Persona
let persona5 = new Persona("Laura", "Quintero");
console.log(persona5.toString());
