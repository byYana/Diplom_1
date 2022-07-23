package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Test
    public void testSetBuns() {
        Burger burger = new Burger();
        Bun bun = new Bun("", 0);
        burger.setBuns(bun);
        assertNotNull(burger.bun);
    }

    @Test
    public void testAddIngredient() {
        Burger burger = new Burger();
        int expected = 1;   // кол. ингредиентов бургера
        Ingredient ingredient = new Ingredient(SAUCE, "", 0);
        burger.addIngredient(ingredient);
        assertEquals(expected, burger.ingredients.size());
    }

    @Test
    public void testRemoveIngredient() {
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(SAUCE, "", 0);
        int expected = 1;   // кол. ингредиентов бургера
        burger.ingredients.add(ingredient);
        burger.ingredients.add(ingredient);
        burger.removeIngredient(0);
        assertEquals(expected, burger.ingredients.size());
    }

    @Test
    public void testMoveIngredient() {
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(SAUCE, "0", 0);
        Ingredient expected = new Ingredient(SAUCE, "1", 1);
        burger.ingredients.add(ingredient);
        burger.ingredients.add(expected);
        burger.moveIngredient(0, 1);
        assertEquals(expected, burger.ingredients.get(0));
    }

    @Test
    public void testGetPrice() {
        Burger burger = new Burger();
        burger.bun = new Bun("", 100);
        Ingredient ingredient1 = new Ingredient(SAUCE, "1", 100);
        Ingredient ingredient2 = new Ingredient(SAUCE, "2", 50);
        burger.ingredients.add(ingredient1);
        burger.ingredients.add(ingredient2);
        float expected = 350;   // цена за бургер
        float actual = burger.getPrice();
        assertEquals(expected, actual, 0);
    }
}