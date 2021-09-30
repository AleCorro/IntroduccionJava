import java.util.Scanner;

public class EJERCICIO7 {

        public static void main (String[] args) {

            float precioReal;
            float precioRebajado;


            Scanner inputValue;
            inputValue = new Scanner(System.in);

            System.out.println("Enter num1: ");
            precioReal = inputValue.nextFloat();

            System.out.println("Enter num2: ");
            precioRebajado = inputValue.nextFloat();

            float rebaja = (1 - (precioRebajado/precioReal) * 100);


            System.out.println("Precio Real: " + precioReal);
            System.out.println("Precio Rebajado: " + precioRebajado);
            System.out.println("Rebaja: " + rebaja + "%");

        }
    }

