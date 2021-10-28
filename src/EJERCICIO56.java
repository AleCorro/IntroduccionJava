import java.util.Scanner;

public class EJERCICIO56 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numeroMayor = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduzca un numero:");
            int numero = reader.nextInt();

            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
        }
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
