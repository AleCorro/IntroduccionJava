import java.util.Scanner;

public class EJERCICIO47 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas que desee:");
        int numero = reader.nextInt();

        int i;
        int j;

        for (i = 1; i <= numero; i++) {

           for (j = 1; j <= i; j++) {

               System.out.print(j + " ");
           }
           System.out.println(" ");
        }
    }
}
