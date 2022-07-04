import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }while (i <= 10);
    }
}
