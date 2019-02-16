package sweets;

public class Bonbon extends Sweets {
    private int calories;

    public Bonbon(String name, double weight, double price, int calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    public Bonbon(){}

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Леденцы [" + super.toString() + "; кКал: " + calories + "]";
    }
}
