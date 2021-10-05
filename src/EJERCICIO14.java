import java.util.Scanner;

public class EJERCICIO14 {

    public static void main (String[] args) {

        int edad;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter edad:");
        edad = reader.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
