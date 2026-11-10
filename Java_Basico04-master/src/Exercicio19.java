import java.time.LocalDate;
import java.time.Period;

public class Exercicio19 {
    static class DataNascimento {
        private LocalDate data;

        public DataNascimento(LocalDate data) {
            this.data = data;
        }

        public int calcularIdadeNaData(LocalDate dataReferencia) {
            return Period.between(data, dataReferencia).getYears();
        }
    }

    public static void main(String[] args) {
        DataNascimento dn = new DataNascimento(LocalDate.of(2000, 5, 15));
        int idade = dn.calcularIdadeNaData(LocalDate.of(2026, 6, 1));
        System.out.println("Idade calculada: " + idade + " anos");
    }
}