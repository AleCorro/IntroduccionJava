import java.util.Scanner;

public class EJERCICIO49 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero;
        int contador = 0;
        int i;

        System.out.println("Introduce un numero:");
        numero = reader.nextInt();


        for (i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
