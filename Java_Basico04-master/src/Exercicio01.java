public class Exercicio01 {
    static class Pessoa {
        String nome;
        int idade;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "Carlos";
        p2.idade = 30;

        System.out.println("Pessoa 1: " + p1.nome + ", " + p1.idade + " anos");
        System.out.println("Pessoa 2: " + p2.nome + ", " + p2.idade + " anos");
    }
}