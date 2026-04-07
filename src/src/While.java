/*
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);

        System.out.print("Escreva o número que deseja contar até 10: ");
        int contar = contador.nextInt();

        while(contar>10) {
            System.out.println("Contando...");
        }
    }
}
*/

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);

        System.out.print("Escreva o número que deseja contar até 10: ");
        int contar = contador.nextInt();

        while(contar <= 10) {
            System.out.println(contar);
            contar++;
        }
    }
}
