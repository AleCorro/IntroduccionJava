import java.util.Scanner;

public class EJERCICIO28 {

    public static void main(String[] args) {

        float precioInicial;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter el precio inicial: ");
        precioInicial = reader.nextFloat();

        if (0 <= precioInicial && precioInicial < 6) {
            System.out.println("Precio final: " + precioInicial + " €");

        } else if (6 <= precioInicial && precioInicial < 60) {
            System.out.println("Precio final: " + precioInicial * 0.95 + " €");

        } else if (precioInicial >= 60) {
            System.out.println("Precio final: " + precioInicial * 0.90 + " €");
        }

    }
}
