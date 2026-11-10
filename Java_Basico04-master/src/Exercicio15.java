public class Exercicio15 {
    static class Produto {
        private String codigo;
        private String nome;
        private double preco;

        public Produto(String codigo, String nome, double preco) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$ " + preco;
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("P01", "Mochila", 150.0);
        System.out.println(p);
    }
}