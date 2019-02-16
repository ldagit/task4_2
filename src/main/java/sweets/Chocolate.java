package sweets;

public class Chocolate extends Sweets {
    private String with;

    public Chocolate(String name, double weight, double price, String with) {
        super(name, weight, price);
        this.with = with;
    }

    public String getWith() {
        return with;
    }

    public void setWith(String with) {
        this.with = with;
    }

    @Override
    public String toString() {
        return "Шоколад [" + super.toString() + "; с наполнителем: " + with + "]";
    }
}
