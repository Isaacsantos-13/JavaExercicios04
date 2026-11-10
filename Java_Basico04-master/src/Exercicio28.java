public class Exercicio28 {
    static abstract class Relatorio {
        public final void gerar() { // Método Template
            carregarDados();
            formatar();
            imprimirRodape();
        }

        protected abstract void carregarDados();
        protected abstract void formatar();

        private void imprimirRodape() {
            System.out.println("[Fim do Relatório]\n");
        }
    }

    static class RelatorioVendas extends Relatorio {
        @Override
        protected void carregarDados() {
            System.out.println("A carregar dados de vendas do sistema...");
        }

        @Override
        protected void formatar() {
            System.out.println("Formatando relatório de vendas em PDF.");
        }
    }

    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioVendas();
        relatorio.gerar();
    }
}