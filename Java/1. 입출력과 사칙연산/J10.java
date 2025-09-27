import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, d1, d2, d3;
        num1=sc.nextInt();
        num2=sc.nextInt();
        d1=num2%10;
        d2=(num2/10)%10;
        d3=(num2/100)%10;
        System.out.println(num1*d1);
        System.out.println(num1*d2);
        System.out.println(num1*d3);
        System.out.println(num1*num2);
    }
}
