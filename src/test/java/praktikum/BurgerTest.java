package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;

    @InjectMocks
    Burger burger;

    @Test
    public void testSetBuns() {
        burger.setBuns(bun);
        assertNotNull(burger.bun);
    }

    @Test
    public void testAddIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        burger.addIngredient(ingredient);
        assertEquals(1, burger.ingredients.size()); // сравнение кол. ингредиентов бургера
    }

    @Test
    public void testRemoveIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        burger.ingredients.add(ingredient);
        burger.ingredients.add(ingredient);
        burger.removeIngredient(0);
        assertEquals(1, burger.ingredients.size()); // сравнение кол. ингредиентов бургера
    }

    @Test
    public void testMoveIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "Сырный", 50);
        Ingredient expected = new Ingredient(FILLING, "Котлета", 250);
        burger.ingredients.add(ingredient);
        burger.ingredients.add(expected);
        burger.moveIngredient(0, 1);
        assertEquals(expected, burger.ingredients.get(0));
    }

    @Test
    public void testGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(100F);
        burger.ingredients.add(new Ingredient(SAUCE, "Сырный", 50));
        burger.ingredients.add(new Ingredient(FILLING, "Котлета", 250));
        assertEquals(500, burger.getPrice(), 0); //сравнение цен за бургер
    }
}
