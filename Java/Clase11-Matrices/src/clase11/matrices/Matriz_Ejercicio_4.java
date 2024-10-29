//Crear matriz 7x7, rellenarla, diagonal ppal 1 y el resto 0

package clase11.matrices;

import java.util.Scanner;



public class Matriz_Ejercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        
        //Llenado de la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i==j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }                
            }            
        }
        
        //Mostrando matriz
        System.out.println("\nMostrando matriz completa: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+" ");                
            }
            System.out.println("");            
        }
        System.out.println("");
    }
}