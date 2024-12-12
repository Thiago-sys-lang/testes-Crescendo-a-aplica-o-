import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testArtigoPublicado() {
        Autor autor = new Autor("João Silva", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Maria Oliveira", false);
        Artigo artigo = new Artigo("Explorando Java", autor, "programação", false);

        assertEquals("Explorando Java", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("programação", artigo.getGenero());
        assertFalse(artigo.isPublicado());
    }
}
