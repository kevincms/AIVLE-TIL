import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, d2, d3;
        d1 = sc.nextInt();
        d2 = sc.nextInt();
        d3 = sc.nextInt();
        if (d1 == d2 && d2 == d3) System.out.println(10000 + d1 * 1000);
        else if (d1 == d2 || d2 == d3) System.out.println(1000 + d2 * 100);
        else if (d1 == d3) System.out.println(1000 + d1 * 100);
        else {
            int max = Math.max(d1, Math.max(d2, d3));
            System.out.println(max * 100);
        }
    }
}
