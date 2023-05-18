package maven.example.basic;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ApplicationTest extends TestCase {

    private Application app;

    @Before
    public void setUp() {
        app = new Application();
    }

    @Test
    public void testCountWords() {
        int count = app.countWords("Esto son cuatro palabras");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countWords(null);
        assertTrue(count == 0);
    }
}