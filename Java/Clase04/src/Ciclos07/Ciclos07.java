/*
Pedir numeros hasta que se introduzca un numero negativo y calcular la media
 */

package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numero = 1, suma = 0;
        int conteo = 0;

        do{
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextFloat();

            if (numero > 0 ){
                suma = suma + numero;
                conteo++;
            }


        }while (numero > 0);

        if(conteo == 0 ){
            System.out.println("No hay elementos para calcular el promedio");
        }else {
            double promedio = suma / conteo;
            System.out.printf("El promedio de los "+conteo+" numeros positivos ingresados es : %1.2f", promedio);
        }


    }
}
