import java.util.Scanner;

public class EJERCICIO53 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        char[] letras = new char[] {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Introduce DNI sin letra:");
        int dni = reader.nextInt();

        int indice = dni - ((dni / 23) * 23);
        System.out.println("Su letra de DNI es: " + letras[indice]);
    }
}
