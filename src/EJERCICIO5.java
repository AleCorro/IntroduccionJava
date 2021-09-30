import java.util.Scanner;

public class EJERCICIO5 {

    public static void main (String[] args) {

        float num1;
        float num2;

        System.out.println("Enter numero 1:");

        //Reading the value
        Scanner inputValue1;
        inputValue1 = new Scanner(System.in);
        num1 = inputValue1.nextFloat();


        System.out.println("Enter numero 2:");

        //Reading the value
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        num2 = inputValue2.nextFloat();


        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicacion = num1 * num2;
        float division = num1 / num2;


        System.out.println((suma) + num1 + num2);
        System.out.println((resta) + num1 - num2);
        System.out.println((multiplicacion) + num1 * num2);
        System.out.println((division) + num1 / num2);

    }
}