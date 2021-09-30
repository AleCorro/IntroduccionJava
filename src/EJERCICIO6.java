import java.util.Scanner;

public class EJERCICIO6 {

        public static void main (String[] args) {

            float radio;
            final double pi = 3.14159;

            System.out.println("Enter radio:");

            Scanner inputValue1;
            inputValue1 = new Scanner(System.in);
            radio = inputValue1.nextFloat();

            double perimetro = 2 * pi * radio;
            double area = pi * radio * radio;

            System.out.println("perimetro: " + perimetro);
            System.out.println("area: " + area);

        }
    }

