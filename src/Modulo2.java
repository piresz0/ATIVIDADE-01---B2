import java.util.Scanner;

public class Modulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            int soma = num1 + num2;
            System.out.println("Soma: " + soma);
        }

        scanner.close();
    }
}
