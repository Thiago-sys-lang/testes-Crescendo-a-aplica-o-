package testes java script;

public class classe artigo com exempolo na maiin {
    public class Artigo {
        private String titulo;
        private Autor autor;
        private String genero;
        private boolean publicado;
    
        public Artigo(String titulo, Autor autor, String genero, boolean publicado) {
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.publicado = publicado;
        }
    
        @Override
        public String toString() {
            return "Artigo: " + titulo + ", Autor: " + autor + ", Gênero: " + genero + ", Publicado: " + (publicado ? "Sim" : "Não");
        }
    }
    
}
