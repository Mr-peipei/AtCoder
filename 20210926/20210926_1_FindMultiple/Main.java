import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		int N = sc.nextInt();

		//Aを取得する
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}

		//Xを取得する
		int X = sc.nextInt();

		int sum = 0;
		int count = 0;
		Boolean flag = false;

		for(int j=0;j<(int)Math.pow(10, 100);j++){
			for(int item: A){
				sum = sum + item;
				count += 1;
				if(sum>X){
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}

		System.out.println(count);
	}
}