public class EJERCICIO32 {

    public static void main(String[] args) {

        System.out.println("Los 50 primeros numeros impares son: ");

        int num = 0;
        for (int i = 0; i <= 49;) {
            if (num % 2 == 1) {
                System.out.println(num);
                i++;
            }
            num++;
        }
    }
}
