package lesson2;

public class homework2 {
    public static void main(String[] args) {
        System.out.println(isSumBetween(10,11));
        printSign(5);
        System.out.println(negative(7));
        printWordNTimes(1);

    }
    public static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    public static void printSign(int value) {
        if (value >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean negative(int a) {
        if (a > 0) return true;
        else return false;
    }

    public static void printWordNTimes(int n) {
        for (int i = 0; i < n; i++){
            System.out.println(n);
        }
    }

}
