import java.util.Scanner;

public class EJERCICIO20 {

    public static void main (String[] args) {

        byte d;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter numero del 1 al 7:");
        d = reader.nextByte();

        if (d == 1) {
            System.out.println("Lunes");
        } else if (d == 2) {
            System.out.println("Martes");
        } else if (d == 3) {
            System.out.println("Miercoles");
        } else if (d == 4) {
            System.out.println("Jueves");
        } else if (d == 5) {
            System.out.println("Viernes");
        } else if (d == 6) {
            System.out.println("Sabado");
        } else if (d == 7){
            System.out.println("Viernes");
        }
    }
}

//La version mas eficiente es la de este ejercicio porque ocupa menos bytes para realizar el mismo objetivo: averiguar en que dia del año cae el dia numero "x".//*