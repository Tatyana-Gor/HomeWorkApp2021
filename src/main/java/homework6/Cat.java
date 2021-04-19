package homework6;

    public class Cat extends Animal {

        private static int catCount = 0;

        public Cat() {
            catCount++;
            runLimit = (int) (10 + Math.random() * 100);
            swimLimit = 0;
        }

        @Override
        public void run(int distance) {
            if(distance <= runLimit) {
                System.out.println("Кот пробежал " + distance + "метров");
            } else {
                System.out.println("Кот устал");
            }

        }

        @Override
        public void swim(int distance) {
            throw new RuntimeException("Кот не плавает");

        }

        public static int getCatCount() {
            return catCount;
        }
    }
