/*Protecto caja:
Ejercicio 1: Crear un proyecto segun las especificaciones
mostradas a continuacion
La formula es: volumen = ancho * alto * profundidad
*/

package Caja;

public class Caja {

    //Atributos
    double ancho;
    double alto;
    double profundidad;

    public Caja(){ //constructor 1 = vacio

    }

    //Constructor con parametros

    public Caja(double ancho,double alto, double profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public double volumen(){
        
        return ancho * alto * profundidad;


    }
}
