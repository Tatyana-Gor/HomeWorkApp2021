package homework6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(Animal.getAnimalCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());

        cat.run(50);
        dog.run(70);
        dog.swim(30);
        cat.swim(12);
    }
}
