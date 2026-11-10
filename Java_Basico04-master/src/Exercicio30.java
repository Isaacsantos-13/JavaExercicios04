public class Exercicio30 {
    interface Filtro {
        boolean aceitar(int numero);
    }

    public static void main(String[] args) {
        // Implementação via classe anônima
        Filtro apenasPares = new Filtro() {
            @Override
            public boolean aceitar(int numero) {
                return numero % 2 == 0;
            }
        };

        int[] numeros = {1, 2, 3, 4, 5, 6};
        System.out.print("Números pares filtrados: ");
        for (int n : numeros) {
            if (apenasPares.aceitar(n)) {
                System.out.print(n + " ");
            }
        }
    }
}