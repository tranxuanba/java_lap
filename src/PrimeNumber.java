public class PrimeNumber {
    public static void main(String[] args) {
        int x = 0;
        while (x < 100) {
            if (Prime(x)) {
                System.out.println(x);
            }
            x++;
        }
    }
    public static boolean Prime(int number) {
        if (number < 2) return false;
        if (number < 4) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
}
