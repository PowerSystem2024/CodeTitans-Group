/*Ejercicio 2: Leer dos tablas de 10 numeros y mezclarlas en una tercera
el 1° de a el 1° de b, el 2° de a el 2° de b*/
package clase13.laboratorio;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int numeros1[] = new int[10];
        int numeros2[] = new int[10];
        int numeros3[] = new int[20];
        
        System.out.println("Llenamos el primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros1[i] = entrada.nextInt();            
        }
        
        System.out.println("Llenamos el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros2[i] = entrada.nextInt();            
        }
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            numeros3[j] = numeros1[i];
            j++;
            numeros3[j] = numeros2[i];
            j++;            
        }
        
        System.out.print("Mostramos el tercer arreglo: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros3[i]+" ");            
        }
        System.out.println();
    }
}
