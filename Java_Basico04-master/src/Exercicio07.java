public class Exercicio07 {
    static class Livro {
        String titulo;
        boolean disponivel = true;

        void emprestar() {
            if (disponivel) {
                disponivel = false;
                System.out.println("Livro emprestado com sucesso.");
            } else {
                System.out.println("Livro já se encontra emprestado.");
            }
        }

        void devolver() {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");
        }
    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";
        l.emprestar();
        l.devolver();
    }
}