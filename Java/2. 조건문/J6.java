import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, cook_time;
        h = sc.nextInt();
        m = sc.nextInt();
        cook_time = sc.nextInt();
        h = (h + (m + cook_time) / 60) % 24;
        m = (m + cook_time) % 60;
        System.out.println(h + " " + m);
    }
}
