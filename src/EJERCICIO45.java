import java.util.Scanner;

public class EJERCICIO45 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int i = 0;
        int numInicial;
        int num;
        int positivos = 0;

        System.out.println("Introduzca la cantidad de numeros que necesite:");
        numInicial = reader.nextInt();


        do {
            System.out.println("Introduce el numero " + (i + 1) + ": ");
            num = reader.nextInt();
            if (num >= 0) {
                positivos = positivos + 1;
            }
            i = i + 1;
        } while (i < numInicial);
        System.out.println("Los numeros positivos son: " + positivos);
    }
}
