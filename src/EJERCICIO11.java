import java.util.Scanner;

public class EJERCICIO11 {

    public static void main (String[] args) {

        String dia[] = {"Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado", "Domingo"};

        int numero;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter dia del año:");
        numero = inputValue.nextInt();

        if (numero > 0 && numero < 366);
        {
            if (numero <= 7)
                System.out.println(dia[numero - 1]);
        }  if ((numero % 7) == 0) {
            System.out.println(dia[6]);
        } { if ((numero % 7) == 0) ;
            System.out.println(dia[(numero - 1) % 7]);
        }{ if (numero < 1 || numero > 365);
        }
    }
    }
