import java.util.Scanner;

public class EJERCICIO50 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

            int numInicial;
            int numFinal;
            int contador = 0;


            System.out.println("Introduce el numero inicial:");
            numInicial = reader.nextInt();

            System.out.println("Introduce el numero final:");
            numFinal = reader.nextInt();


            for (int i = numInicial; i <= numFinal; i++) {
                if (esPrimo(i)) {
                    contador++;
                    System.out.print(i + ",");
                }
            }
            System.out.printf("Total: %d", contador);

        }


        public static boolean esPrimo(int numero) {

            if (numero == 0 || numero == 1 || numero == 4) {
                return false;
            }
            for (int x = 2; x < numero / 2; x++) {

                if (numero % x == 0)
                    return false;
            }

            return true;
        }
    }
