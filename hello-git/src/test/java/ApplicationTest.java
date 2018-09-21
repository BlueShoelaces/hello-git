import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void shouldBeAbleToRunMainMethod() {
        Application.main(null);
        assertTrue("Can run the app!", true);
    }
}