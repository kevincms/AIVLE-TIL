import java.io.*;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n, a, b;
        n = Integer.parseInt(br.readLine());
        String[] str;
        for (int i = 0; i < n; i++) {
            str=br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            sb.append(a + b).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}

/*
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
 */