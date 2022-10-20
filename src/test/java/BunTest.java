import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun("Белый итальянский", 100);
        assertEquals("Белый итальянский", bun.getName());
    }

    @Test
    public void testGetNameZero() {
        Bun bun = new Bun("", 100);
        assertEquals("", bun.getName());
    }

    @Test
    public void testGetNameNull() {
        Bun bun = new Bun(null, 100);
        assertNull(bun.getName());
    }

    @Test
    public void testGetNameSymbol() {
        Bun bun = new Bun("\u30C7", 100);
        assertEquals("\u30C7", bun.getName());
    }

    @Test
    public void testGetNameMax() {
        String max = "Что нужно сделать\n" +
                "Склонируй репозиторий с заготовкой кода.\n" +
                "Подключи библиотеки: Jacoco, Mockito, JUnit 4.\n" +
                "Покрой тестами классы Bun, Burger, Ingredient, IngredientType. Используй моки, стабы и параметризацию там, где нужно.\n" +
                "Процент покрытия должен быть не ниже 70%.";
        Bun bun = new Bun(max, 100);
        assertEquals(max, bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun("Белый итальянский", 100);
        assertEquals(100.0F, bun.getPrice(), 0.0);
    }

    @Test
    public void testGetPriceZero() {
        Bun bun = new Bun("Белый итальянский", 0);
        assertEquals(0.0F, bun.getPrice(), 0.0);
    }

    @Test
    public void testGetPriceNegative() {
        Bun bun = new Bun("Белый итальянский", -100);
        assertEquals(-100.0F, bun.getPrice(), 0.0);
    }

    @Test
    public void testGetPriceMax() {
        float max = 3.4e+38F;
        Bun bun = new Bun("Белый итальянский", max);
        assertEquals(max, bun.getPrice(), 0.0);
    }

}