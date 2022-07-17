package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBun {

    @Test
    public void testGetName() {
        String expected = "Name";
        Bun bun = new Bun("Name", 0);
        assertEquals(expected, bun.getName());
    }

    @Test
    public void testGetPrice() {
        float expected = 10.0F;
        Bun bun = new Bun("Name", 10);
        assertEquals(expected, bun.getPrice(), 0.0);
    }
}