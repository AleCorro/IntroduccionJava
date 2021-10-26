public class EJERCICIO50 {

    public static void main(String[] args) {


            int contador = 0;


            for (int i = 3; i <= 100; i++) {
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
