
package test;

import domain.Persona;


public class TestArreglosObjet {
    
    public static void main(String[] args) {
        
        //Los arreglos se definen en plural!!!!!!!!! (personas)
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Guille");
        personas[1] = new Persona("Shakes");
        System.out.println("personas 0 = "+personas[0]);//Muestra la direccion de memoria
        System.out.println("personas 1 = "+personas[1]);
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas "+i+" = "+personas[i]);
        }
        
        String frutas[] = {"Banana", "Pera", "Manzana"};//Creacion e inicializacion de arreglo resumido
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = "+frutas[i]);
        }
    }
    
}
