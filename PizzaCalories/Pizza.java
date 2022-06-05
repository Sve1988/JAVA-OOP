package PizzaCalories;

import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int countOfToppings) {
        this.setName(name);
        this.setToppings(countOfToppings);
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int number){
        if (number < 0 || number > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = toppings;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
        double sum = 0;
        for (int i = 0; i < toppings.size(); i++) {
            sum = sum + toppings.get(i).calculateCalories();
        }
        return sum + dough.calculateCalories();
    }
}
