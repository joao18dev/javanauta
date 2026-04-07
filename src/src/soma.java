import java.util.Scanner;

public class soma {

    public static void main(String[] args) {

        int soma = 0;
        char resp = 's';

        Scanner calculadora = new Scanner(System.in);

        while (resp == 's') {
            System.out.print("Digite um número: ");
            int num = calculadora.nextInt();

            System.out.print("Deseja continuar? ");
            resp = calculadora.next().charAt(0);

            soma = soma + num;

        }


        System.out.println("O resultado da soma dos número é: " + soma);

    }
}
