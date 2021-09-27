import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Kを取得する
		int K = sc.nextInt();
		//Aを取得する
		int A = sc.nextInt();
		//Bを取得する
		int B = sc.nextInt();

		String[] array1 = String.valueOf(A).split("");
		long array1size = array1.length-1;
		String[] array2 = String.valueOf(B).split("");
		long array2size = array2.length-1;

		long num1 = 0;
		long num2 = 0;

		for(String item: array1){
			num1 = num1 + Integer.parseInt(item)*(int)Math.pow(K, array1size);
			array1size -= 1;
		}

		for(String item: array2){
			num2 = num2 + Integer.parseInt(item)*(int)Math.pow(K, array2size);
			array2size -= 1;
		}

		System.out.println(num1*num2);

	}
}