public public class Autor {
    private String nome;
    private boolean isUsuario; // Indica se é um Usuário ou um Autor tradicional.

    public Autor(String nome, boolean isUsuario) {
        this.nome = nome;
        this.isUsuario = isUsuario;
    }

    public String getNome() {
        return nome;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    @Override
    public String toString() {
        return nome + " (" + (isUsuario ? "Usuário" : "Autor tradicional") + ")";
    }
}
 campo Autor para atualizar principal {
    
}
