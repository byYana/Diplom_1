package praktikum;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    @Mock
    IngredientType type;

    @Test
    public void testGetPrice() {
        float expected = 10.0F;
        Ingredient ingredient = new Ingredient(type, "", 10);
        assertEquals(expected, ingredient.getPrice(), 0.0);
    }

    @Test
    public void testGetName() {
        String expected = "Name";
        Ingredient ingredient = new Ingredient(type, "Name", 0);
        assertEquals(expected, ingredient.getName());
    }

    @Test
    public void testGetType() {
        IngredientType expected = type;
        Ingredient ingredient = new Ingredient(type, "", 0);
        assertEquals(expected, ingredient.getType());
    }
}