public class Exercicio06 {
    static class Aluno {
        double nota1;
        double nota2;

        double calcularMedia() {
            return (nota1 + nota2) / 2.0;
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nota1 = 8.5;
        a.nota2 = 7.0;
        System.out.println("Média do aluno: " + a.calcularMedia());
    }
}