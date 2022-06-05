package CarShop;

import PizzaCalories.Dough;

public class Audi extends CarImpl implements Car {

   private Integer minRentDay;
   private Double pricePerDay;


    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    public Integer getMinRentDay() {
        return minRentDay;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }
}
