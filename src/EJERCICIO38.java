import java.util.Scanner;

public class EJERCICIO38 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero;
        int i;

        System.out.println("Introduzca un numero: ");
        numero = reader.nextInt();

        System.out.println("Los divisores del numero " + numero + " son:");

        for (i = 1; i <= numero; i++) {

            if (numero % i == 0) {
            System.out.println(i);
            }
        }
    }
}
