import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
private Cat c;
    @BeforeEach
    void setUp() {
    c = new Cat("Lars", 8.4, 'm');
    }

    @Test
    void getName() {
        assertNotNull(c.getName());
        assertFalse(c.getName().equals(""));
    }

    @Test
    void getWeight() {
        assertTrue(c.getWeight() > 0 && c.getWeight() <= 10);
    }



    @Test
    void getGender() {
        assertTrue(c.getGender() == 'm'|| c.getGender() == 'f');
    }
}