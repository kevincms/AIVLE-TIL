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

