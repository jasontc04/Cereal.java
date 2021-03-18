public class Cereal {
    
    private String cerealName;
    private int calories;

    public Cereal(String name, int caloriesInput) {
        cerealName = name;
        calories = caloriesInput;
    }

    public String getName() {
        return cerealName;
    }
    public int getCalories() {
        return calories;
    }

    public String toString() {
        return "The cereal name is " + cerealName + ". It has " + calories + " calories.";
    }

}