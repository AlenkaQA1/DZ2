public class DZ2 {
    public static void main(String[] args) {
        doThree(1, 2);
        doFour(1);
        doFive(3);
        printWordNTimes("123", 3);
    }

    static boolean doThree(int a, int b) {
        System.out.println("10 >= 20");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }

    static void doFour(int a) {
        System.out.println("a >= 0");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean doFive(int a) {
        System.out.println("a < 0");
        if (a < 0) return true;
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}





