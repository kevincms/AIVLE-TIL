import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for (int i = 1; i < N+1; i++) sb.append(" ".repeat(N-i)).append("*".repeat(i)+"\n");
        System.out.print(sb);
    }
}
