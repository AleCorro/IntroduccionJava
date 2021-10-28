import java.util.Scanner;

public class EJERCICIO56 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

          int[] numero = new int [10];

        for (int i = 0; i < numero.length; i++) {

            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numero[i] = reader.nextInt();
        }

        int numeroMayor;
        numeroMayor = numero [0];

        for (int j : numero) {
            if (j > numeroMayor) {
                numeroMayor = j;
            }
        }
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
