import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N=sc.nextInt();
        for (int i = 0; i <N; i++) sb.append("*".repeat(i+1)+"\n");
        System.out.print(sb);
    }
}
