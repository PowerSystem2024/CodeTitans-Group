/*
Ejercicio 9: pedir el dia, mes y año de una fecha, indicar si
la fecha es correcta. Suponiendo que todos los meses son de 30
dias
 */

package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Digite el dia: ");
        dia = entrada.nextInt();
        System.out.println("Digite el mes: ");
        mes = entrada.nextInt();
        System.out.println("Digite el año: ");
        anio = entrada.nextInt();

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)){
                if ((anio >= 1) && (anio <= 2024)){
                    System.out.println("La fecha ingresada es : "+ dia+"/"+mes+"/"+anio);
                }
                else {
                    System.out.println("Fecha incorrecta");
                }
            }
            else {
                System.out.println("Fecha incorrecta");
            }
        }
        else {
            System.out.println("Fecha incorrecta");
        }


    }
}
