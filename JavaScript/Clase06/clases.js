//no se permite crear un objeto antes de que la clase 
//este instanciada con su constructor
//let persona3 = new Persona('Jeff', 'Beck');
//concepto de hosting

class Persona{ //Clase padre
    constructor(nombre,apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre+' '+this._apellido;
    }

}

class Empleado extends Persona{//Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); //llamamos al contructor de la clase padre
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}



let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = "Robert";
console.log(persona1.nombre);
persona1.apellido = "Plant";
console.log(persona1.nombre +' '+ persona1.apellido);

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.apellido);
persona2.nombre = "Rod";
console.log(persona2.nombre)
persona2.apellido = "Stewart";
console.log(persona2.nombre +' '+ persona2.apellido);

let empleado1 = new Empleado('Eric', 'Clapton', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

