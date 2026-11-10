public class Exercicio04 {
    static class Conta {
        double saldo;

        void depositar(double valor) {
            if (valor > 0) saldo += valor;
        }
    }

    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(500.0);
        System.out.println("Saldo da conta: R$ " + c.saldo);
    }
}