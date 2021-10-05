import java.util.Scanner;

public class EJERCICIO16 {

    public static void main (String[] args) {

        int numero;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero:");
        numero = reader.nextInt();

        if (numero >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("Numero es negativo");
        }
    }
}
