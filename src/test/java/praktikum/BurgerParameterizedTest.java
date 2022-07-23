package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class BurgerParameterizedTest {
    Burger burger = new Burger();
    private static final List<Ingredient> ingredients1 = Arrays.asList();
    private static final List<Ingredient> ingredients2 = Arrays.asList(new Ingredient(FILLING, "Котлета", 250));
    private static final List<Ingredient> ingredients3 = Arrays.asList(new Ingredient(SAUCE, "Сырный", 50), new Ingredient(FILLING, "Котлета", 250));
    int expected; // кол. строк бургера: булки - 2, ингредиент - 1, цена и строка между ею и бургером - 2

    public BurgerParameterizedTest(List<Ingredient> ingredients, int expected) {
        burger.ingredients = ingredients;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {ingredients1, 4},
                {ingredients2, 5},
                {ingredients3, 6},
        };
    }

    @Test
    public void testGetReceipt() {
        burger.bun = new Bun("Белый итальянский", 100);
        String[] actual = burger.getReceipt().split("\n");
        System.out.println(burger.getReceipt());
        assertEquals(expected, actual.length);
    }
}