import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n, a, b;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sb.append(a + b).append("\n");
        }
        System.out.print(sb);
    }
}