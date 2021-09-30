import java.util.Scanner;

public class EJERCICIO4 {

    public static void main(String[] argv) {
        float side;
        float squareArea;

        System.out.println("Entre the side:");

        //Reading the value
        Scanner inputValve;
        inputValve = new Scanner(System.in);
        side = inputValve.nextFloat();

        squareArea = side * side;
        System.out.println(squareArea);
    }
}