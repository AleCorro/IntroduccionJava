import java.util.Scanner;

public class EJERCICIO24 {

    public static void main (String [] args) {

        String mes;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter mes:");
        mes = reader.next();

        switch (mes) {
            case "Enero":
            case "Marzo":
            case "Mayo":
            case "Julio":
            case "Agosto":
            case "Octubre":
            case "Diciembre":
                System.out.println("Tiene 31 dias");
                break;
            case "Abril":
            case "Junio":
            case "Septiembre":
            case "Noviembre":
                System.out.println("Tiene 30 dias");
                break;
            case "Febrero":
                System.out.print("Tiene 28 días");
                break;
        }
    }
}
