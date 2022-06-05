package PizzaCalories;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }


    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        }
        else {
            String msg = String.format("Cannot place %s on top of your pizza", toppingType);
            throw new IllegalArgumentException(msg);
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        }
        else {
            String msg = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(msg);
        }
    }

    public double calculateCalories(){
        double modifier = GetToppingModifier(toppingType);
        return 2 * weight * modifier;
    }

    private double GetToppingModifier(String toppingType) {
        switch (toppingType){
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;
            default:
                return 0;
        }
    }
}
