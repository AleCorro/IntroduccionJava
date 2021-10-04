import java.util.Scanner;

public class EJERCICIO9 {

        public static void main (String[] args) {

            int numero;

            Scanner inputValue;
            inputValue = new Scanner(System.in);

            System.out.println("Enter numero:");
            numero = inputValue.nextInt();

            if ((numero % 2) == 0) {
                System.out.println("Numero par");
            }
        }
}
