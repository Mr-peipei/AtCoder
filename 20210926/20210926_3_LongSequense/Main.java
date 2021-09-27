import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		long N = sc.nextLong();

		//Aを取得する
		long[] A = new long[(int)N];
		long sum=0;
		for(int i=0;i<N;i++){
			A[i] = sc.nextLong();
			sum+=A[i];

		}

		//Xを取得する
		long X = sc.nextLong();

		long count = (X/sum)*N;
		long now = (X/sum)*sum;

		int pos=0;
		while(now<=X){
			now+=A[pos];
			count+=1;
			pos+=1;
		}

		System.out.println(count);
	}
}