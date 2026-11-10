public class Exercicio24 {
    interface FormaPagamento {
        void pagar(double valor);
    }

    static class Pix implements FormaPagamento {
        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento de R$ " + valor + " efetuado via PIX.");
        }
    }

    static class Cartao implements FormaPagamento {
        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento de R$ " + valor + " efetuado via Cartão de Crédito.");
        }
    }

    public static void main(String[] args) {
        FormaPagamento pagamento1 = new Pix();
        FormaPagamento pagamento2 = new Cartao();

        pagamento1.pagar(150.0);
        pagamento2.pagar(350.0);
    }
}