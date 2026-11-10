import java.util.Objects;

public class Exercicio16 {
    static class Usuario {
        private int id;
        private String nome;

        public Usuario(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Usuario)) return false;
            Usuario usuario = (Usuario) o;
            return id == usuario.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario(1, "Ana");
        Usuario u2 = new Usuario(1, "Ana Beatriz");
        System.out.println("São iguais pelo ID? " + u1.equals(u2));
    }
}