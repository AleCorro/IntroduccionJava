import java.util.Scanner;

public class EJERCICIO30 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String dia;

        System.out.println("Enter dia:");
        dia = reader.next();

        int horarioDeApertura;

        if (dia.equals("Sabado") || dia.equals("Domingo")) {
            horarioDeApertura = 12;
        } else {
            horarioDeApertura = 9;
        }

        System.out.println("El horario de apertura es a las: " + horarioDeApertura);
    }
}

