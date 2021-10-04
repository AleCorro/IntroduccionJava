import java.util.Scanner;

public class EJERCICIO12 {

    public static void main(String[] args) {

        float numero, num1;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter numero: ");
        numero = inputValue.nextFloat();

        if (numero >= 0) {
            num1 = numero;
        } { if (numero >= 0) {
                num1 = -numero;
                System.out.println("Valor absoluto: " + num1);
        }
        }
    }
}