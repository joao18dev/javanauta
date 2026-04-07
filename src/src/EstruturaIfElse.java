import java.util.Scanner;

public class EstruturaIfElse {

    public static void main(String[] args){

        boolean temdinheiro = false;
        boolean temcartao = false;

        if ( temdinheiro && temcartao) {
            System.out.println(" Vamos para o cocobambu! ");
        }
        else if ( temdinheiro || temcartao) {
            System.out.println(" Vamos para o MiniMundo! ");
        }
        else {
            System.out.println(" Estou liso! ");
        }

    }
}
