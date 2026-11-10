public class Exercicio14 {
    static final class Cpf {
        private final String valor;

        public Cpf(String valor) {
            if (valor == null || valor.length() != 11) {
                throw new IllegalArgumentException("CPF inválido.");
            }
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Cpf cpf = new Cpf("12345678901");
        System.out.println("CPF imutável criado: " + cpf.getValor());
    }
}