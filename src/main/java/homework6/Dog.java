package homework6;

public class Dog extends Animal{

    private static int dogCount = 0;

    public Dog() {
        runLimit = (int) (20 + Math.random() * 200);
        swimLimit = (int) (5 + Math.random() * 50);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if(distance <= runLimit) {
            System.out.println("Пес пробежал " + distance + " метров");
        } else {
            System.out.println("Пес устал");
        }

    }

    @Override
    public void swim(int distance) {
        if(distance <= runLimit) {
            System.out.println("Пес проплыл " + distance + " метров");
        } else {
            System.out.println("Пес устал");
        }

    }

    public static int getDogCount() {
        return dogCount;
    }
}
