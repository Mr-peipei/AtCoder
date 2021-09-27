import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        long a = Long.parseLong(s1, n);
        long b = Long.parseLong(s2, n);
        System.out.println(a * b);
    }
}
