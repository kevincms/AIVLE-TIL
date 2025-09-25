import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J2 {
    // Buffer를 이용해 입출력을 할 경우 main 함수에 throws Exception를 추가해 예외처리를 해주어야 한다.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a, b;
        // case 1
        String[] input;
        input = br.readLine().split(" ");
        a=Integer.parseInt(input[0]);
        b=Integer.parseInt(input[1]);

        // case 2
        // split()보다 더 빠르게 문자열을 쪼갤 수 있다. (백준 시스템 상 큰 차이는 없는 것으로 추정))

        // st=new StringTokenizer(br.readLine(), " ");
        
        // a=Integer.parseInt(st.nextToken());
        // b=Integer.parseInt(st.nextToken());
        
        br.close();
        
        System.out.print(a+b);
        
    }   
}

/*
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        // case 1
        // next + 자료형으로 입력받기

        // a=sc.nextInt();
        // b=sc.nextInt();

        // case 2
        // 자료형.parse자료형()으로 자료형을 바꿀 수 있음.

        // String input1, input2;
        // input1=sc.next();
        // input2=sc.next();
        // a=Integer.parseInt(input1);
        // b=Integer.parseInt(input2);

        // case 3
        // nextLine 으로 한 줄을 입력 받고 그 문자열을 쪼갤 수 있음.

        String[] input;
        input = sc.nextLine().split(" ");
        a=Integer.parseInt(input[0]);
        b=Integer.parseInt(input[1]);

        System.out.println(a+b);
    }
}

*/


