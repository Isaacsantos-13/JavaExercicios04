import java.util.Scanner;

public class Exercicio20 {
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Produto: " + nome + " | Preço: R$ " + preco;
        }
    }

    public static void main(String[] args) {
        // Simulação de input por consola (substituível por new Scanner(System.in))
        Scanner scanner = new Scanner("Teclado\n150.0\n");
        String nome = scanner.nextLine();
        double preco = Double.parseDouble(scanner.nextLine());

        Produto produto = new Produto(nome, preco);
        System.out.println(produto);
        scanner.close();
    }
}