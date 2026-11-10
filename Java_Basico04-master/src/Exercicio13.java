public class Exercicio13 {
    static class Cliente {
        private String nome;
        private String email;

        public Cliente(String nome) {
            this.nome = nome;
            this.email = "Não informado";
        }

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public void exibir() {
            System.out.println("Cliente: " + nome + " | E-mail: " + email);
        }
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente("João");
        Cliente c2 = new Cliente("Maria", "maria@email.com");
        c1.exibir();
        c2.exibir();
    }
}