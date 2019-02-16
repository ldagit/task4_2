/**
 * @author Литвинцова Юлия
 */

import sweets.Bonbon;
import sweets.Sweets;
import sweets.Chocolate;
import sweets.Marshmallow;

public class Base {
    public static void main(String[] args) {
        Bonbon bonbon1 = new Bonbon("Бонпари", 150, 350, 250);
        Marshmallow marshmallow1 = new Marshmallow("Зефир", 250, 300, "Ваниль");
        Chocolate chocolate1 = new Chocolate("Аленка",100,80.50, "Фундук");
        Bonbon bonbon2 = new Bonbon();
        bonbon2.setName("Мятные");
        bonbon2.setPrice(95.40);
        bonbon2.setWeight(250);
        bonbon2.setCalories(325);
        Sweets [] present = {bonbon1, bonbon2, marshmallow1, chocolate1};

        double presentWeight = 0;
        double presentPrice = 0;

        for (Sweets value: present) {
            System.out.println(value.toString());
            presentWeight += value.getWeight();
            presentPrice += value.getPrice();
        }

        System.out.printf("Общий вес подарка: %.2f; стоимость: %.2f руб.", presentWeight, presentPrice);


    }
}
