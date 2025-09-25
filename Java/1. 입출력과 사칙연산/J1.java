import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class J1 {
    // Buffer를 이용해 입출력을 할 경우 main 함수에 throws Exception를 추가해 예외처리를 해주어야 한다.
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World!");

        bw.flush();
        bw.close();
    }
    
}

/*
public class J1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

 */