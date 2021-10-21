import java.util.Scanner;

public class EJERCICIO40 {

    public static void main (String [] args ) {

        Scanner reader = new Scanner(System.in);

        long factorial = 1;
        int num;
        int i;

        System.out.println("Introduce un numero: ");
        num = reader.nextInt();

        for (i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
}
}
