import java.util.Scanner;

public class EJERCICIO57 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] numero = new int [10];

        for (int i = 0; i < numero.length; i++) {

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numero[i] = reader.nextInt();
        }

        int numeroMenor;
        numeroMenor = numero [0];

        for (int j : numero) {
            if (j < numeroMenor) {
                numeroMenor = j;
            }
        }
        System.out.println("El numero menor es: " + numeroMenor);
    }
}
