import java.util.Scanner;

public class EJERCICIO18 {

    public static void main (String[] args) {

        float num1;
        float num2;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero 1:");
        num1 = reader.nextFloat();

        System.out.println("Enter numero 2:");
        num2 = reader.nextFloat();

        if (num1 < num2) {
            System.out.println("El orden ascendente es el siguiente: " + num1 + ";" + num2);
        } else {
            System.out.println("El orden ascendente es el siguiente: " + num2 + ";" + num1);
        }
    }
}
