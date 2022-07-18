package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class TestBurger {

    @Test
    public void testSetBuns(){
        Burger burger = new Burger();
        Bun bun = new Bun("",0);
        burger.setBuns(bun);
        assertNotNull(burger.bun);
    }

    @Test
    public void testAddIngredient(){
        Burger burger = new Burger();
        int expected = 1;
        Ingredient ingredient = new Ingredient(SAUCE,"",0);
        burger.addIngredient(ingredient);
        assertEquals(expected,burger.ingredients.size());
    }
//    public void removeIngredient(int index) {
//        ingredients.remove(index);
    @Test
    public void testRemoveIngredient() {
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(SAUCE,"",0);
        int expected = 1;
        burger.ingredients.add(ingredient);
        burger.ingredients.add(ingredient);
        burger.removeIngredient(0);
        assertEquals(expected,burger.ingredients.size());
    }

}
//    public Bun bun;
//    public List<Ingredient> ingredients = new ArrayList<>();

//    public void moveIngredient(int index, int newIndex) {
//        ingredients.add(newIndex, ingredients.remove(index));
//    }
//    public float getPrice() {
//        float price = bun.getPrice() * 2;
//
//        for (Ingredient ingredient : ingredients) {
//            price += ingredient.getPrice();
//        }
//
//        return price;
//    }
//
//    public String getReceipt() {
//        StringBuilder receipt = new StringBuilder(String.format("(==== %s ====)%n", bun.getName()));
//
//        for (Ingredient ingredient : ingredients) {
//            receipt.append(String.format("= %s %s =%n", ingredient.getType().toString().toLowerCase(),
//                    ingredient.getName()));
//        }
//
//        receipt.append(String.format("(==== %s ====)%n", bun.getName()));
//        receipt.append(String.format("%nPrice: %f%n", getPrice()));
//
//        return receipt.toString();
//    }