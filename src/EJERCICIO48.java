import java.util.Scanner;

public class EJERCICIO48 {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas que desee:");
        int numero = reader.nextInt();


        for (int i = 1; i <= numero; i++) {



           for (int j = 0; j < numero - i; j++) {
               System.out.print("/ ");
           }

            for (int j = 0; j <= i - 1; j++) {
                System.out.print(i - j + " ");
            }
            if (i > 1) {
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            for (int j = 0; j < numero - i; j++) {
                System.out.print("/ ");
            }
            System.out.println("/ ");
        }
    }
}
