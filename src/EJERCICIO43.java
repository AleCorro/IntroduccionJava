import java.util.Scanner;

public class EJERCICIO43 {

public static void main (String [] args){

      Scanner reader = new Scanner(System.in);

       long factorial = 1;
       int numero;
       int i = 2;

       System.out.println("Introduzca el numero:");
       numero = reader.nextInt();

       while (i < numero) {
       factorial = factorial * i;
       i++;
       }
        System.out.println("El factorial de " + numero + " es: " + factorial);
   }
}
