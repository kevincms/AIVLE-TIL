import java.io.*;

public class J8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
        int T, a, b;
        st.nextToken(); T=(int)st.nval;
        for (int i = 1; i < T+1; i++) {
            st.nextToken(); a=(int)st.nval;
            st.nextToken(); b=(int)st.nval;
            sb.append("Case #%d: %d + %d = %d\n".formatted(i,a,b,a+b));
        }
        System.out.print(sb);
    }
}
