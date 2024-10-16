import java.util.Scanner;

public class Modulo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = obterNumero(scanner, "Digite o primeiro número: ");
        double num2 = obterNumero(scanner, "Digite o segundo número: ");
        double num3 = obterNumero(scanner, "Digite o terceiro número: ");

        double media = calcularMedia(num1, num2, num3);
        System.out.println("Média: " + media);

        scanner.close();
    }

    public static double obterNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
