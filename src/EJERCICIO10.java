import java.util.Scanner;

public class EJERCICIO10 {

    public static void main (String[] args) {

        int numero1, numero2, numero3;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter numero 1:");
        numero1 = inputValue.nextInt();

        System.out.println("Enter numero 2:");
        numero2 = inputValue.nextInt();

        System.out.println("Enter numero 3:");
        numero3 = inputValue.nextInt();

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("Numero mayor: " + numero1);
            } {
                System.out.println("Numero mayor: " + numero3);
            }
        } if (numero2 > numero3) {
            System.out.println("Numero mayor: " + numero2);
        } {
            System.out.println("Numero mayor: " + numero3);
        }
    }
}
