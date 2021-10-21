import java.util.Scanner;

public class EJERCICIO34 {

       public static void main(String [] args) {

           Scanner reader = new Scanner(System.in);

           int numeros;
           int positivos = 0;
           int i;

           for (i = 0; i < 10; i++) {

               System.out.println("Introduce el numero " + (i + 1) + ": ");
               numeros = reader.nextInt();

               if (numeros >= 0) {
                   positivos++;
               }
           }
           System.out.println("Los numeros positivos son: " + positivos);
       }
}
