import java.util.Scanner;

public class EJERCICIO13 {

    public static void main(String[] args) {

        float num1;
        float num2;
        float resultado = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero 1");
        num1 = reader.nextFloat();

        System.out.println("Enter numero 2");
        num2 = reader.nextFloat();

        if (num1 >= num2) {
            resultado = num2 - num1;
        }
        if (num1 < num2) {
            resultado = num1 - num2;
        }

        System.out.println("Resultado: " + resultado);
    }
}
