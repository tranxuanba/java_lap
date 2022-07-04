import java.util.Scanner;

public class geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai, cao;
        int chon = -1;
        System.out.println("Menu");
        System.out.println("1. ve hinh chu nhat");
        System.out.println("2. ve hinh tam giac");
        System.out.println("3. ve hinh tam giac nguoc");
        System.out.println("0. thoat");
        System.out.println("chon hinh ban muon ve: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.println("moi nhap chieu dai hcn:");
                dai = sc.nextInt();
                System.out.println("moi nhap chieu rong hcn");
                cao = sc.nextInt();
                for (int i = 1; i <= dai; i++) {
                    System.out.println(" ");
                    for (int j = 1; j <= cao; j++) {
                        System.out.print(" * ");
                    }
                }
                break;
            case 2:
                System.out.println("nhao vao chieu cao tam giac");
                cao = sc.nextInt();
                for (int i = 1; i <= cao; i++) {
                    System.out.println(" ");
                    for (int j = 1; j <= i; j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 3:
                System.out.println("nhao vao chieu cao tam giac");
                cao = sc.nextInt();
                for (int i = 1; i <= cao; i++) {
                    System.out.println(" ");
                    for (int j = cao; j >= i; j--){
                        System.out.print(" * ");
                    }
                }
                break;
            case 0:
                System.exit(0); break;
            default:
                System.out.println("khong co lua chon");
        }
    }
}
