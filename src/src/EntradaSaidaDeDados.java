import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Olá, " + nome + ". digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("O nome do usúario é " + nome + " e ele tem " + idade + " anos.");

    }
}
