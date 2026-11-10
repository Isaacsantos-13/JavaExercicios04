public class Exercicio09 {
    static class Celular {
        String marca;
        String modelo;

        Celular(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
    }

    public static void main(String[] args) {
        Celular tel = new Celular("Samsung", "Galaxy S23");
        System.out.println("Celular: " + tel.marca + " " + tel.modelo);
    }
}