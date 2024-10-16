import java.util.Scanner;

public class Modulo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            calcularESomar(scanner);
        }

        scanner.close();
    }

    public static void calcularESomar(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }
}
