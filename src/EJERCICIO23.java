import java.util.Scanner;

public class EJERCICIO23 {

    public static void main( String [] args) {

        int numero1;
        int numero2;
        int resultado;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero 1:");
        numero1 = reader.nextInt();

        System.out.println("Enter numero 2:");
        numero2 = reader.nextInt();

       int suma = numero1 + numero2;
       int resta = numero1 - numero2;
       int multiplicacion = numero1 * numero2;
       int division = numero1 / numero2;

       System.out.println("Enter operacion:");
       resultado = reader.nextInt();

       switch (resultado) {
           case 1:
               System.out.println("Resultado suma: " + suma);
               break;
           case 2:
               System.out.println("Resultado resta: " + resta);
               break;
           case 3:
               System.out.println("Resulatdo multiplicacion: " + multiplicacion);
               break;
           case 4:
               System.out.println("Resultado division: " + division);
               break;
       }
    }
}
