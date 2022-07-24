package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        assertEquals(50.0F, ingredient.getPrice(), 0.0);
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        assertEquals("Сырный", ingredient.getName());
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        assertEquals(SAUCE, ingredient.getType());
    }
}