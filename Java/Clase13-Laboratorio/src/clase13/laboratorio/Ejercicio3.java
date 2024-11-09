/*Ejercicio 3: leer 5 numeros en forma creciente, los guardamos en una tabla de 
tamaño 10, leemos otro numero, al insertarlo debe quedar la tabla ordenanda*/
package clase13.laboratorio;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;
        
        System.out.println("Llenar el arreglo: ");
        do {
            //llenando el arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();                
            }
            
            //Comprobar si esta ordenado
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i+1]) {
                    creciente = true;                    
                }
                if (arreglo[i] > arreglo[i+1]) {
                    creciente = false;
                    break;                    
                }                
            }
            
            if (creciente == false) {
                System.out.println("\nEl arreglo no está ordenado");                
            }            
        } while (creciente == false);
        
        System.out.println("Digite un numero a insertar: ");
        numero = entrada.nextInt();
        
        //Esto es para saber en que posicion va el numero
        while(arreglo[j] < numero && j<5){
            sitio_num++;
            j++;
        }
        
        //trasladamos una posicion
        for (int i = 4; i >=sitio_num; i--) {
            arreglo[i+1] = arreglo[i];            
        }
        
        //Insertamos el numero
        arreglo[sitio_num] = numero;
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i]+" - ");            
        }
        System.out.println();
    }    
}
