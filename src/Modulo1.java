public class Modulo1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int soma = num1 + num2;
        System.out.println("Soma: " + soma);

        int subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);

        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            double divisao = (double) num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão por zero não é permitida.");

        }
    }
}
