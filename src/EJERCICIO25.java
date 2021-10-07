import java.util.Scanner;

public class EJERCICIO25 {

    public static void main( String [] args) {

        byte numero;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter numero del 0 al 10:");
        numero = reader.nextByte();

       switch (numero) {
           case 0:
           case 1:
           case 2:
           case 3:
               System.out.println ("Muy deficiente");
               break;
           case 4:
               System.out.println ("Insuficiente");
               break;
           case 5:
               System.out.println ("Suficiente");
               break;
           case 6:
               System.out.println ("Bien");
               break;
           case 7:
           case 8:
               System.out.println ("Notable");
               break;
           case 9:
           case 10:
               System.out.println ("Sobresaliente");
               break;
           case 11:
               System.out.println ("Error");
               break;
       }
    }
}


