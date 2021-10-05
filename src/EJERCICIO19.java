import java.util.Scanner;

public class EJERCICIO19 {

    public static void main(String[] args) {

        float num1;
        float num2;
        String AscendenteODescendente;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero 1:");
        num1 = reader.nextFloat();

        System.out.println("Enter numero 2:");
        num2 = reader.nextFloat();

        System.out.println("Introducir (x) para ascendente y (y) para descendente:");
        AscendenteODescendente = reader.next();


        if (AscendenteODescendente.equals("x")) {
            if (num1 >= num2) {
                System.out.println(num2 + ";" + num1);
            } else {
                System.out.println(num1 + ";" + num2);
            }
        }
        if (AscendenteODescendente.equals("y")) {
            if (num1 >= num2) {
                System.out.println(num2 + ";" + num1);
            } else {
                System.out.println(num1 + ";" + num2);
            }
        }
    }
}
