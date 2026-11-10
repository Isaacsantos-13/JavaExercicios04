public class Exercicio08 {
    static class Curso {
        String nome;
        int cargaHoraria;

        Curso(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }
    }

    public static void main(String[] args) {
        Curso c = new Curso("Programação Orientada a Objetos", 40);
        System.out.println("Curso: " + c.nome + " | Carga Horária: " + c.cargaHoraria + "h");
    }
}