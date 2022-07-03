import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime;
        System.out.println("moi nhap vao so can tra");
        prime = sc.nextInt();
        if (prime < 2) {
            System.out.println(prime + " khong la so nguyen to");
        }
        if (prime < 4) {
            System.out.println(prime + " la so nguyen to");
        }
        boolean n = true;
        if (prime >= 4) {
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                   n = false;
                }else {
                   n = true;
                }
            }
        }
        if (n) {
            System.out.println(prime + " la so nguyen to");
        }else {
            System.out.println(prime + " khong la so nguyen to");
        }
    }
}
