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
