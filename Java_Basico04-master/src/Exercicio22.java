public class Exercicio22 {
    static abstract class Veiculo {
        protected String placa;

        public Veiculo(String placa) {
            this.placa = placa;
        }

        public abstract double calcularDiaria(int dias);
    }

    static class Carro extends Veiculo {
        public Carro(String placa) { super(placa); }

        @Override
        public double calcularDiaria(int dias) {
            return dias * 120.0;
        }
    }

    static class Moto extends Veiculo {
        public Moto(String placa) { super(placa); }

        @Override
        public double calcularDiaria(int dias) {
            return dias * 60.0;
        }
    }

    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234");
        Veiculo moto = new Moto("XYZ-9876");

        System.out.println("Diária Carro (3 dias): R$ " + carro.calcularDiaria(3));
        System.out.println("Diária Moto (3 dias): R$ " + moto.calcularDiaria(3));
    }
}