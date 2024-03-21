import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigada por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: R$" + saldo + " já está disponível para saque.");


    }
}
