import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Aを取得する
		int A = sc.nextInt();
		//Bを取得する
		int B = sc.nextInt();
		//Cを取得する
		int C = sc.nextInt();
		//Xを取得する
		int X = sc.nextInt();

		int count = 0;
		int num = 0;
		int num_A = 0;
		int num_B = 0;
		int num_C = 0;

		//numをリセット
		num = X;

		for(int a = A;a>=0;a--){
			num_A = num - 500*a;
			if(num_A<0){
				continue;
			}else if(num_A==0){
				count += 1; 
				continue;
			}
			for(int b = B;b>=0;b--){
				num_B = num_A - 100*b;
				if(num_B<0){
					continue;
				}else if(num_A==0){
					count += 1;
					continue;
				}
				for(int c = C;c>=0;c--){
					num_C = num_B - 50*c;
					if(num_B<0){
						continue;
					}else if(num_C==0){
						count += 1;
						break;
					}
				}
			}
		}
		

		System.out.println(count);
	}
}