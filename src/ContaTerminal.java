import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo na conta!");
        float saldo = scanner.nextFloat();



        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo+" já está disponível para saque");

    }
}
