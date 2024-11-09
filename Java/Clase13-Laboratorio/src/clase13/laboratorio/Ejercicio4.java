/*Ejercicio 4: leer 10 elementos numericos y una posicion del 0 al 9
eliminar el elemnto seleccionado sin dejar huecos*/
package clase13.laboratorio;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion, j=0;
        
        System.out.println("Llenar el arreglo: ");        
        for (int i = 0; i < 10; i++) {
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();            
        }
        
        System.out.println();
        do {
            System.out.print("Digite una posicion a eliminar del 0 al 9: ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion >9);
        
        //Eliminado el elemento
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i+1];            
        }
        
        System.out.println("\nEl arreglo queda; ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i]+" - ");            
        }
        System.out.println();
    }    
}
