package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun("Белый итальянский", 100);
        assertEquals("Белый итальянский", bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun("Белый итальянский", 100);
        assertEquals(100.0F, bun.getPrice(), 0.0);
    }
}