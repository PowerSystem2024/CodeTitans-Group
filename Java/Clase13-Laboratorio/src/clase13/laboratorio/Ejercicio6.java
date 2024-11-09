/*Ejercicio6: Leer dos series de 10 enteros, ordenados crecientemente
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados*/
package clase13.laboratorio;

import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;
        
        System.out.println("Llenar el primer arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            //Comprobamos si el arreglo está ordenado
            for (int i = 0; i < 9; i++) {
                if(a[i] < a[i+1]){
                    creciente = true;
                }
                if (a[i] > a[i+1]) {
                    creciente = false;
                    break;                    
                }
            }
            
            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, vuelca a digitar: ");                
            }
        } while (creciente == false);
        
        System.out.println("Llenar el segundo arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println((i+1)+". Digite un numero: ");
                b[i] = entrada.nextInt();                
            }
            
            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i+1]) {
                    creciente = true;                    
                }
                if (b[i] > b[i+1]) {
                    creciente = false;
                    break;                    
                }                
            }
            
            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado");                
            }
        } while (creciente);
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i < 10 && j < 10){
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;                
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        
        if (i==10) {
            while(j<10){
                c[k] = b[j];
                j++;
                k++;
            }            
        }
        else{
            while(i<10){
                c[k] = a[i];
                i++;
                k++;                        
            }
        }
        
        System.out.println("\nEl arreglo c completo es:");
        for (k=0; k<20; k++) {
            System.out.print(c[k]+" - ");            
        }
        System.out.println();
    }    
}
