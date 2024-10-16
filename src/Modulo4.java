import java.util.Scanner;

public class Modulo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite dois números: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Soma: " + (num1 + num2));
        }

        scanner.close();
    }
}
