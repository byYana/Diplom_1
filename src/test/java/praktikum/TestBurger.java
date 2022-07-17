package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestBurger {

    @Mock
    //Burger burger;
    IngredientType type;
    Ingredient ingredient;
   // Bun bun;

    @Test
    public void testSetBuns(){
        Burger burger = new Burger();
        Bun bun = new Bun("",0);
        burger.setBuns(bun);
        assertNotNull(bun);
    }

    @Test
    public void testAddIngredient(){
        Burger burger = new Burger();
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient ingredient = new Ingredient(type,"",0);
        burger.addIngredient(ingredient);
        //assertEquals(0,ingredients.size());
        //    public void addIngredient(Ingredient ingredient) {
        //        ingredients.add(ingredient);
    }

   /* @Test
    public void testRemoveIngredient() {
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient ingredient = new Ingredient(type,"",0);
        int expected = 2;
        ingredients.add(ingredient);
        ingredients.add(ingredient);
        ingredients.add(ingredient);
        System.out.println(ingredients.size());

       // burger.removeIngredient(0);
        System.out.println(ingredients.size());

        ingredients.remove(0);
        System.out.println(ingredients.size());
        //assertEquals(expected,ingredients.size());
    }*/
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