import java.io.*;

public class J12 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
        int a, b;
        while (true) {
            if(st.nextToken()==StreamTokenizer.TT_EOF) break;
            a=(int)st.nval;
            st.nextToken(); b=(int)st.nval;
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}
