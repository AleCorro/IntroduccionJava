public class EJERCICIO33 {

    public static void main(String[] args) {

        System.out.println("Los 50 primeros numeros pares en orden descendente son: ");

        int num = 0;
        for (int i = 98; i >= 0;) {
            if (num % 2 == 0) {
                System.out.println(i);
                i-=2;
            }
            num++;
        }
    }
}
