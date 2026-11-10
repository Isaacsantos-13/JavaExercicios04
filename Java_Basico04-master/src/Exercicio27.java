public class Exercicio27 {
    static class Pessoa {
        protected String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }
    }

    static class Aluno extends Pessoa {
        private String matricula;

        public Aluno(String nome, String matricula) {
            super(nome); // Chama o construtor da superclasse
            this.matricula = matricula;
        }

        public void exibirDados() {
            System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Mariana", "202601");
        aluno.exibirDados();
    }
}