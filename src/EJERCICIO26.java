import java.util.Scanner;

public class EJERCICIO26 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Dame horas, minutos y segundos:");
        int horas = reader.nextInt();
        int minutos = reader.nextInt();
        int segundos = reader.nextInt();

        System.out.println("Dame otra vez horas, minutos y segundos:");
        int segundosTotales = reader.nextInt() + horas;
        int minutosTotales = reader.nextInt() + minutos;
        int horasTotales = reader.nextInt() + segundos;

        int minutosExtra;
        int horasExtra;

        if (segundosTotales > 59) {
            minutosExtra = segundosTotales / 60;
            segundosTotales -= minutosExtra * 60;
            minutosTotales += minutosExtra;
        }

         if (minutosTotales > 59) {
             horasExtra = minutosTotales / 60;
             minutosTotales -= horasExtra * 60;
             horasTotales += horasExtra;
         }

       System.out.println("Resultado: " + horasTotales +  "h " + minutosTotales +  "m " + segundosTotales +  "s");
    }
}
