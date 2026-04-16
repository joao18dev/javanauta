import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);

        System.out.print("Digite um número que deseja iniciar a contagem: ");
        int cont = contador.nextInt();

        for ( int i = cont; i < 11; i++) {
            System.out.println(i);
        }
    }
}




