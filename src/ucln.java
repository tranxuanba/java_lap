import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("moi nhap vao so thu nhat");
        a = sc.nextInt();
        System.out.println("moi nhap vao so thu hai");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("khong co uoc chung lon nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("uoc chung lon nhat la: " + a);
    }
}
