import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá usuario, Digite seu nome");
        String nome = scanner.next();

        System.out.println("Olá usuario, Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor para saque");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome +" "+ sobrenome);
        System.out.println("Numero da sua agencia: " + agencia);
        System.out.println("Numero da sua conta: " + conta); 
        System.out.println("valor disponivel para saque: " + saldo);
    }
}
