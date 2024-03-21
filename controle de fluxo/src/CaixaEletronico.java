public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 578.65;
        double saque = 97.5;

        if (saque < saldo) {
            saldo -= saque;
            System.out.println(saldo);
        }

        while (saldo > saque) {
            saldo -= saque;
            System.out.println(saldo);
        }
    }
}
