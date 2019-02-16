package sweets;

public class Marshmallow extends Sweets {
    private String taste;

    public Marshmallow(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Зефир [" + super.toString()+ "; со вкусом: " + taste + "]";
    }
}
