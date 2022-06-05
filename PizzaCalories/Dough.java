package PizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        }
        else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }
        else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories(){
        double flourTypeModifier = getFlourTypeModifier(flourType);
        double bakingTechiqueModifier = getBakingTechniqueModifier(bakingTechnique);
        return 2 * weight * flourTypeModifier * bakingTechiqueModifier;
    }

    private double getBakingTechniqueModifier(String bakingTechnique) {
        switch (bakingTechnique){
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            case "Homemade":
                return 1;
            default:
                return 0;
        }
    }

    private double getFlourTypeModifier(String flourType) {
        switch (flourType){
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;
            default:
                return 0;
        }
    }
}
