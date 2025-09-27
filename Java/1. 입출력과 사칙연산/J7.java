import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.next();

        // case 1
        // System.out.print(str+"??!");

        // case 2
        // System.out.printf("%s??!",str);

        // case 3
        System.out.print("%s??!".formatted(str));
    }
}
