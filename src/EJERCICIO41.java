import java.util.Scanner;

public class EJERCICIO41 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int primerTermino = 0;
        int segundoTermino = 1;
        int tercerTermino;
        int numero;
        int i;

        System.out.println("Introduzca un numero de elementos para la serie:");
        numero = reader.nextInt();

        for (i = 0; i < numero; i++) {
            System.out.println(primerTermino);
            tercerTermino = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = tercerTermino;

        }
    }
}
