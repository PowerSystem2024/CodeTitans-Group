package Operaciones;

//El tipo de escritura para la clase es pascalcase

public class Aritmetica {

    //Atributos de la clase

    int a; //el valor por default es 0
    int b; //Memoria stack


    //El metodo constructor es un metodo especial
    //Este se crearia por defecto
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este constructor numero uno");
    }

    //si nosotros creamos otro constructor como este de abajo con parametros,
    // inevitablemente debemos
    //crear el constructor vacio que se encuentra arriba
    //Estmos viendo lo que se llama sobrecarga de constructores
    //Los parametros inicializan los atributos

    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor numero 2");
    }


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
