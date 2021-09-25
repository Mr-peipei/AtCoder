import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] array = s.split("");
		int count = 0;
		for (String string : array) {
			if(string.equals("1")){
				count += 1;
			}
		}
		System.out.println(count);
	}
}