import java.util.Scanner;

public class EJERCICIO29 {

    public static void main(String[] args) {

        long anio;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter año:");
        anio = reader.nextLong();


        boolean resultado = esBisiesto(anio);

        if (resultado) {
            System.out.println("Sí es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

    public static boolean esBisiesto(long anio) {

        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
    }
}
