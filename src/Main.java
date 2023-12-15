import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        System.out.println("----- Conversor Temperaturas -----");
        System.out.println(" ");
        System.out.print("Digite um valor: ");
        Scanner valorDigitado = new Scanner(System.in);
        celsius = Double.parseDouble(valorDigitado.nextLine());
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(fahrenheit + " ºF");
        System.out.println(" ");
        System.out.println("----------------------------------");

    }
}