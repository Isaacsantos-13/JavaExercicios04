public class Exercicio23 {
    interface Autenticavel {
        boolean autenticar(String senha);
    }

    static class Usuario implements Autenticavel {
        @Override
        public boolean autenticar(String senha) {
            return "user123".equals(senha);
        }
    }

    static class Administrador implements Autenticavel {
        @Override
        public boolean autenticar(String senha) {
            return "admin999".equals(senha);
        }
    }

    public static void main(String[] args) {
        Autenticavel u = new Usuario();
        Autenticavel admin = new Administrador();

        System.out.println("Usuário autenticado com 'user123'? " + u.autenticar("user123"));
        System.out.println("Admin autenticado com 'errada'? " + admin.autenticar("errada"));
    }
}