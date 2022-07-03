import java.util.Scanner;

public class InterestRates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        double rate;
        int months;
        System.out.println("moi nhap vao so tien gui");
        money = sc.nextDouble();
        System.out.println("moi nhap vao so thang");
        months = sc.nextInt();
        System.out.println("moi nhap vao lai suat theo thang");
        rate = sc.nextDouble();
        double profitAmount = 0;
        for (int i = 0; i < months; i++) {
            profitAmount += money * (rate/100) / 12 * months;
        }
        System.out.println("so tien lai la: " + profitAmount);
    }
}

