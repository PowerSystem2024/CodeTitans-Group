package Operaciones;

//El tipo de escritura para la clase es pascalcase

public class Aritmetica {

    //Atributos de la clase

    int a; //el valor por default es 0
    int b;

    //Metodo
    //se utiliza camelcase

    public void sumar(){

        //este es el cuerpo de la clase y las variables que se utilizan se llaman variables locales
        //tambien pueden llamarse otros metodos

        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }

    public int sumarConRetorno() {

        //int resultado = a + b ;
        return a + b; //retorna una suma entre a y b
    }

    public int sumarConArgumentos(int arg1, int arg2){ //el argumento es la informacion que va a recibir el metodo

        // el argumento a se le asigna al atributo this.a
        // el operador this hace que se diferencien los atributos de los argumentos que tengan el mismo nombre

        this.a = arg1; // no modifica los valores de los atributos del objeto
        this.b = arg2;

        //return a + b;

        return sumarConRetorno(); //union de metodo dentro de la misma clase
    }


}
