public class Homework_2 {
    public static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printSign(int value){
        if (value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int value) {
        return value > 0;
    }

    public static void priNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }

    }

}
