// https://velog.io/@xav/Java-String-StringBuffer-StringBuilder

import java.io.*;

public class J6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();

        st.nextToken();
        int n, a, b;
        n = (int) st.nval;
        for (int i = 0; i < n; i++) {
            st.nextToken(); a = (int) st.nval;
            st.nextToken(); b = (int) st.nval;
            sb.append(a + b).append("\n");
        }
        System.out.print(sb);
    }
}

/* 입력 buffer, 출력 StringBuilder
import java.io.*;

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
 */

/* 입력 buffer, 출력 buffer
import java.io.*;

public class J6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, a, b;
        n = Integer.parseInt(br.readLine());
        String[] str;
        for (int i = 0; i < n; i++) {
            str=br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            bw.write(String.valueOf(a+b)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
 */

/* 입력 Scanner
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