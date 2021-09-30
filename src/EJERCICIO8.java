import java.util.Scanner;

public class EJERCICIO8 {

    public static void main (String[] args) {

        int edad;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter edad:");
        edad = inputValue.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }
}
