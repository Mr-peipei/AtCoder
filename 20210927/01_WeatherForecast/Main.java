import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String S = sc.next();

        String[] array = S.split("");
        if(array[(int)N-1].equals("o")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
