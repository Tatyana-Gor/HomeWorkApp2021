package homework7;

public class Main {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Васька");
        allCats[1] = new Cat("Рыжик");
        allCats[2] = new Cat("Кешка");

        Plate plate = new Plate(150);

        for (Cat cat : allCats) {
            cat.eat(plate);
        }

        for (Cat cat : allCats) {
            cat.eat(plate);
        }
    }
}
