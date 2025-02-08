import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("BANCO DIO");
        System.out.println("*********");

        System.out.print("Informe o número da conta: ");
        var numero = scanner.nextInt();

        System.out.print("Informe a agência: ");
        var agencia = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Informe nome completo: ");
        var nome = scanner.nextLine();

        System.out.println("Informe o saldo inicial: ");
        var saldo = scanner.nextFloat();

        System.out.print("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}