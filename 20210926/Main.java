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

		int answer = 0;
		for(int i=A;i<=B;i++){
			if(i%C==0){
				answer = i;
				break;
			}
		}
		if(answer==0){
			System.out.println(-1);
		}else{
			System.out.println(answer);
		}

	}
}