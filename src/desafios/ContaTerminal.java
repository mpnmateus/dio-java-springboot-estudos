package desafios;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /** Lista TO-DO
        *1. Conhecer e importar a classe Scanner
        *2. Exibir as mensagens para nosso usuário
        *3. Obter, pelo Scanner, os valores digitados no terminal
        *4. Exibir a mensagem da conta criada
        */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
