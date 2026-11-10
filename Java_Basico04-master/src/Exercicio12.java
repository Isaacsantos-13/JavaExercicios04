public class Exercicio12 {
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            if (preco < 0) {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
            this.preco = preco;
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("Caderno", 15.0);
        System.out.println("Produto criado com validação.");
    }
}