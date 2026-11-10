public class Exercicio11 {
    static class Conta {
        private double saldo;

        public void depositar(double valor) {
            if (valor > 0) saldo += valor;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(300.0);
        System.out.println("Saldo protegido: R$ " + c.getSaldo());
    }
}