import java.util.Scanner;

public class Ciclos08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num;i++){
            System.out.println(i);
        }


        scanner.close();
    }

}