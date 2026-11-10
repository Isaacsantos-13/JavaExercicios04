public class Exercicio21 {
    static class Funcionario {
        protected String nome;
        protected double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public double calcularBonus() {
            return salario * 0.05; // 5% para funcionário comum
        }
    }

    static class Gerente extends Funcionario {
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double calcularBonus() {
            return salario * 0.15; // 15% de bônus para gerente
        }
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 4000.0);
        Gerente g = new Gerente("Ana", 8000.0);

        System.out.println("Bônus de " + f.nome + ": R$ " + f.calcularBonus());
        System.out.println("Bônus de " + g.nome + ": R$ " + g.calcularBonus());
    }
}