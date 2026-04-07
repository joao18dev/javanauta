/*
public class OperadoresAritmeticos {
    public static  void main(String[] args) {
        int nota1 = 7 ;
        int nota2 = 7 ;
        int soma = 0;

        soma = ( nota1 + nota2 ) / 2;
        System.out.println(" A media final é: " + soma);
    }
}
*/

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 8.35 ;
        double mortadela = 5.67 ;
        double queijo = 4.56 ;
        double suco = 6.50 ;
        int totalDiasMes = 30 ;

        double valorTotal = pao + mortadela + queijo + suco;
        double valorTotalMes = valorTotal * totalDiasMes;
        System.out.println(" O valor gasto de café da manhã, todos os dias no mês é de: "
                + valorTotalMes);
    }
}

