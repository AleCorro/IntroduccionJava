import java.util.Scanner;

public class EJERCICIO39 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int num1;
        int num2;
        int i;


        System.out.println("Introduzca el primer numero: ");
        num1 = reader.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        num2 = reader.nextInt();


        for (i = 0; i < num2; i++) {
            System.out.println(num1);
        }

        System.out.println("El resultado de la suma sucesiva es: " + (num1 * num2));
    }
}
