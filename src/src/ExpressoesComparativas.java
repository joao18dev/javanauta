import java.util.Scanner;

public class ExpressoesComparativas {

    public static void main(String[] args) {

        System.out.println(" Sistema de comparação de números.");

        Scanner comparacao = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = comparacao.nextInt();


        System.out.print("Digite o segundo número: ");
        int num2 = comparacao.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais!");

        } else {
            System.out.println("Os números são diferentes!");
        }

    }
}
