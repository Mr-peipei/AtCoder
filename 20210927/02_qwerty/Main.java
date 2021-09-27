import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] P = new String[26];

        for(int i=0;i<26;i++){
            P[i] = Character.toString(sc.nextInt()+96);
        }
        sc.close();

        String ans = "";
        for(String item: P){
            ans += item;
        }
        System.out.println(ans);
    }
}
