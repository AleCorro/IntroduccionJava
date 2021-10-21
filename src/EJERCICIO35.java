import java.util.Scanner;

public class EJERCICIO35 {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        int numeros;
        int pares = 0;
        int i;

        for (i = 0; i < 10; i++) {

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros = reader.nextInt();

            if (numeros % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Los numeros pares son: " + pares);
    }
}
