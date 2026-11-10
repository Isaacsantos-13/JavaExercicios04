public class Exercicio18 {
    // Simulação conceitual de uma classe modelada dentro de um pacote (ex: br.edu.modelo)
    public static class AlunoModelo {
        private String nome;
        public AlunoModelo(String nome) { this.nome = nome; }
        public String getNome() { return nome; }
    }

    public static void main(String[] args) {
        // Noutra classe faria: import br.edu.modelo.AlunoModelo;
        AlunoModelo aluno = new AlunoModelo("Pedro");
        System.out.println("Aluno instanciado: " + aluno.getNome());
    }
}