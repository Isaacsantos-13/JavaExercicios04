public class Exercicio29 {
    static class Validador {
        static class Resultado {
            private boolean valido;
            private String mensagem;

            public Resultado(boolean valido, String mensagem) {
                this.valido = valido;
                this.mensagem = mensagem;
            }

            public boolean isValido() { return valido; }
            public String getMensagem() { return mensagem; }
        }

        public static Resultado validarIdade(int idade) {
            if (idade >= 18) {
                return new Resultado(true, "Acesso permitido.");
            } else {
                return new Resultado(false, "Acesso negado: menor de idade.");
            }
        }
    }

    public static void main(String[] args) {
        Validador.Resultado res = Validador.validarIdade(16);
        System.out.println("Válido? " + res.isValido() + " | Mensagem: " + res.getMensagem());
    }
}