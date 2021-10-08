import java.util.Scanner;

public class EJERCICIO27 {

    public static void main(String[] args) {

        float precioHora;
        int numeroHoras;
        float sueldoNeto;
        float sueldoBruto;
        float impuestos;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter horas: ");
        numeroHoras = reader.nextInt();

        System.out.println("Enter precio por hora: ");
        precioHora = reader.nextFloat();

        if (numeroHoras <= 35) {
            sueldoBruto = numeroHoras * precioHora;
        } else {
            sueldoBruto = (35 * precioHora + (numeroHoras - 35) * precioHora * 1.5f);
        }

        if (sueldoBruto <= 500) {
            sueldoNeto = sueldoBruto;
        } else if (sueldoBruto > 500 && sueldoBruto <= 900) {
            sueldoNeto = (sueldoBruto - 500) * 0.75f + 500;
        } else {
            sueldoNeto = (sueldoBruto - 900) * 0.55f + 500 + 400 * 0.75f;
        }

        impuestos = sueldoBruto - sueldoNeto;

        System.out.println("Salario bruto: " + sueldoBruto);
        System.out.println("Salario neto: " + sueldoNeto);
        System.out.println("Impuestos: " + impuestos + " = " + ((1 - sueldoNeto / sueldoBruto) * 100) + " %");

    }
}
