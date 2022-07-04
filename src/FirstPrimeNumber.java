public class FirstPrimeNumber {
    public static void main(String[] args) {
        int dem = 0;
        int i = 0;
        while (dem < 20) {
            if (checkPrime(i)){
                dem++;
                System.out.println(i);
            }
            i++;
        }
    }
    public static boolean checkPrime(int number) {
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
