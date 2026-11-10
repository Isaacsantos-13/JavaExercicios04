public class Exercicio17 {
    enum Prioridade {
        BAIXA(24), MEDIA(12), ALTA(4);

        private final int slaHoras;

        Prioridade(int slaHoras) {
            this.slaHoras = slaHoras;
        }

        public int getSlaHoras() {
            return slaHoras;
        }
    }

    public static void main(String[] args) {
        System.out.println("SLA Prioridade ALTA: " + Prioridade.ALTA.getSlaHoras() + " horas");
    }
}