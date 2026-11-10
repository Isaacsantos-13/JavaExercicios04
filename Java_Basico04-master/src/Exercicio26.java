public class Exercicio26 {
    static class Professor {
        private String nome;

        public Professor(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    static class Universidade {
        private String nomeUni;
        private Professor professor; // Agregação

        public Universidade(String nomeUni, Professor professor) {
            this.nomeUni = nomeUni;
            this.professor = professor;
        }

        public void exibirInfo() {
            System.out.println("Universidade: " + nomeUni + " | Professor: " + professor.getNome());
        }
    }

    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Roberto"); // Existe independente
        Universidade uni = new Universidade("Faculdade Flamingo", prof);

        uni.exibirInfo();
    }
}