import java.util.Scanner;

public class EJERCICIO36 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int num;
        System.out.println("Introduzca un numero entero: ");
        num = reader.nextInt();
        System.out.println("Tabla del " + num);

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);

        }
    }
}
