import java.util.Scanner;

public class EJERCICIO44 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int primerTermino = 0;
        int segundoTermino = 1;
        int tercerTermino;
        int numero;
        int i = 0;

        System.out.println("Introduzca un numero de elementos para la serie:");
        numero = reader.nextInt();

        while (i < numero) {
            System.out.println(primerTermino);
            tercerTermino = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = tercerTermino;
            i++;
        }
    }
}
