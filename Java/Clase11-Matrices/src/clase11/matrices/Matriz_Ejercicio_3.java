//crear, cargar y trasponer matriz

package clase11.matrices;

import java.util.Scanner;


public class Matriz_Ejercicio_3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();                
            }            
        }
        System.out.println();
        
        System.out.println("Matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");//Se muestra traspuesta         
            }
            System.out.println();            
        }
        System.out.println();
        
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+" ");//Se muestra traspuesta         
            }
            System.out.println();            
        }
        System.out.println();
    }    
}
