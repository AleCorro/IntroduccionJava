import java.util.Scanner;

public class EJERCICIO46 {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            int numeroDieces = 0;
            float nota;
            float suma = 0;
            float numeroDeNotas = 0;

            do {
                System.out.println("Introducir nota: ");
                nota = reader.nextFloat();

                if (nota == 10) {
                    numeroDieces++;
                }

                if (nota > -1) {
                    suma += nota;
                    numeroDeNotas++;
                }
            } while (nota > -1);

            float notaMedia = suma / numeroDeNotas;

            System.out.println("Nota media: " + notaMedia);
            System.out.println("Numero de dieces: " + numeroDieces);
        }
    }
