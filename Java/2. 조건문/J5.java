import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        m -= 45;
        if (m < 0) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }
        System.out.println(h + " " + m);
    }
}
