import java.util.Scanner;

public class EJERCICIO15 {

    public static void main (String[] args) {

        int numero;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero:");
        numero = reader.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
