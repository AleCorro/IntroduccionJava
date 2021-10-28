import java.util.Scanner;

public class EJERCICIO52 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] numero = new int[10];
        int i;

        System.out.println("Por favor, introduzca 10 números enteros.");

        for (i = 0; i < 10; i++) {
            numero[i] = reader.nextInt();
        }

        System.out.println("El orden descendente es el siguiente:");
        for (i = 9; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
