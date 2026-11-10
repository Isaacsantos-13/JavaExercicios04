import java.util.ArrayList;
import java.util.List;

public class Exercicio25 {
    static class ItemPedido {
        private String produto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String produto, int quantidade, double precoUnitario) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double getSubtotal() {
            return quantidade * precoUnitario;
        }
    }

    static class Pedido {
        private List<ItemPedido> itens = new ArrayList<>();

        public void adicionarItem(String produto, int quantidade, double preco) {
            itens.add(new ItemPedido(produto, quantidade, preco));
        }

        public double calcularTotal() {
            double total = 0;
            for (ItemPedido item : itens) {
                total += item.getSubtotal();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Mouse", 2, 50.0);
        pedido.adicionarItem("Teclado", 1, 120.0);

        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}