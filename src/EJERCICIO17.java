import java.util.Scanner;

public class EJERCICIO17 {

    public static void main (String[] args) {

        int numero1;
        int numero2;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero 1:");
        numero1 = reader.nextInt();

        System.out.println("Enter numero 2:");
        numero2 = reader.nextInt();


        if (numero1 > numero2) {
            System.out.println("El numero 1 es el numero mayor");
        } else {
            System.out.println("El numero 2 es el numero mayor");
        }
    }
}











