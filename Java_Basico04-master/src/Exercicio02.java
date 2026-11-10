public class Exercicio02 {
    static class Produto {
        String nome;
        double preco;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto(); p1.nome = "Mouse"; p1.preco = 50.0;
        Produto p2 = new Produto(); p2.nome = "Teclado"; p2.preco = 120.0;
        Produto p3 = new Produto(); p3.nome = "Monitor"; p3.preco = 900.0;

        Produto maisCaro = p1;
        if (p2.preco > maisCaro.preco) maisCaro = p2;
        if (p3.preco > maisCaro.preco) maisCaro = p3;

        System.out.println("O produto mais caro é: " + maisCaro.nome + " por R$ " + maisCaro.preco);
    }
}