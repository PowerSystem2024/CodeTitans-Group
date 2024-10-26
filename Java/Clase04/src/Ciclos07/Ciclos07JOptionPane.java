package Ciclos07;

import javax.swing.*;

public class Ciclos07JOptionPane {

    public static void main(String[] args) {

        float numero = 1, suma = 0;
        int conteo = 0;

        do{

            String input = JOptionPane.showInputDialog("Ingrese un numero: ");

            try{
            numero = Float.parseFloat(input);

            if (numero > 0 ){
                    suma = suma + numero;
                    conteo++;
                }


            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null,"Ingrese un numero por favor o utilice '.'" +
                        " en vez de ','");
            }


        }while (numero > 0);

        if(conteo == 0 ){
            JOptionPane.showMessageDialog(null,"No hay elementos para calcular el promedio");
        }else {
            float promedio = suma / conteo;
            /*
            %d: Placholder que se sustituye por el valor entero de conteo,
            que representa la cantidad de números positivos ingresados.
            %.2f: Placeholder que se sustituye por el valor de promedio, formateado con dos decimales
             */
            String mensajeDeSalida = String.format("El promedio de los %d numeros positivos" +
                    " ingresados es : %1.2f", conteo, promedio);
            JOptionPane.showMessageDialog(null,mensajeDeSalida);
        }


    }
}
