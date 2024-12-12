import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testAutorUsuario() {
        Autor autor = new Autor("João Silva", true);
        assertEquals("João Silva", autor.getNome());
        assertTrue(autor.isUsuario());
    }

    @Test
    public void testAutorTradicional() {
        Autor autor = new Autor("Maria Oliveira", false);
        assertEquals("Maria Oliveira", autor.getNome());
        assertFalse(autor.isUsuario());
    }
}
