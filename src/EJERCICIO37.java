import java.util.Scanner;

public class EJERCICIO37 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero1;
        int numero2;
        int i;

        System.out.println("Introduzca el primer numero:");
        numero1 = reader.nextInt();

        System.out.println("Introduzca el segundo numero:");
        numero2 = reader.nextInt();

        System.out.println("La secuencia de numeros sera la siguiente:");

        for (i = numero1; i <= numero2; i++) {
            if (numero1 < numero2)
            System.out.println(i);
        }
    }
}
