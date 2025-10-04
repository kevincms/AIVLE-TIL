import java.io.*;

public class J11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
        int a, b;
        while (true) {
            st.nextToken(); a=(int)st.nval;
            st.nextToken(); b=(int)st.nval;
            if(a==0 && b==0) break;
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}
