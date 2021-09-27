import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int i = rot((int)N);
        int j = Main2.rot2((int)N);
        System.out.println(i);
        System.out.println(j);
    }

    public static int rot(int S){
        return S+90;
    }
}

public class Main2{
    public static int rot2(int S){
        return S+110;
    }
}

