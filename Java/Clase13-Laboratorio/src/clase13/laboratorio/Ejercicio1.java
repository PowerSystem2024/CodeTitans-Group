/*Leer 10 numeros enteros, guardarlos en un arreglo.
Debemos mostrarlos el primero y el ultimo, el segundo
y el penultimo y asi sucesivamente*/
package clase13.laboratorio;

import  java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextInt();            
        }
        
        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]+" ");
            System.out.print(numeros[9-i]+" ");
        }
        System.out.println("");        
    }    
}
