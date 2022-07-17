package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestIngredientType {

    @Test
    public void testIngredientType() {
        assertNotNull(IngredientType.values());
    }
}
