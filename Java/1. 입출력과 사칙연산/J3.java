
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class J3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String[] input;
        int a, b;

        // case 1
        // input=br.readLine().split(" ");

        // a=Integer.parseInt(input[0]);
        // b=Integer.parseInt(input[1]);

        // case 2
        st=new StringTokenizer(br.readLine(), " ");
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());


        
        bw.write(String.valueOf(a-b));
        br.close();
        bw.flush();
        bw.close();
    }
}
