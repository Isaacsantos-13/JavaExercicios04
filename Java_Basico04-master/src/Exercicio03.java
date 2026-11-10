public class Exercicio03 {
    static class Retangulo {
        double largura;
        double altura;

        double area() {
            return largura * altura;
        }
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.largura = 5.0;
        r.altura = 3.0;
        System.out.println("Área do retângulo: " + r.area());
    }
}