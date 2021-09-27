import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n=sc.nextLong();
		long A[]=new long[(int)n];

		long sum=0;
		for(int i=0;i<n;i++){
			A[i]=sc.nextLong();
			sum+=A[i];
		}

		long x=sc.nextLong();

		sc.close();

		long ans=(x/sum)*n;
		long now=(x/sum)*sum;

		int pos=0;
		while(now<=x){
			now+=A[pos];
			ans+=1;
			pos+=1;
		}

		System.out.println(ans);
		
	}
}