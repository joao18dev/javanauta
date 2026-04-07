import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {

        String nome = "João Guilherme";
        String sobrenome = " Marques";
        String nome2 = "Caio";

        String nomeCompleto = nome.concat(sobrenome);

        int tamanhosDaString = nome.length();
        boolean nomesIguais = nome.equals(nome2);

        System.out.println("Olá, meu nome é " + nome + " e tem " + tamanhosDaString + " caracteres!");
        System.out.println("Os nomes são iguais ? " + nomesIguais);
        System.out.println("Meu nome completo é " + nomeCompleto);
    }
}
