import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		int N = sc.nextInt();
		//Aを取得する
		int A = sc.nextInt();
		//Bを取得する
		int B = sc.nextInt();

		//出力する合計値を代入
		int sum = 0;
		//一時保存の数を代入
		int tempnum = 0;
		//配列用のカウントを作成
		int arraycount = 0;
		int[] array = new int[N];

		for(int i=0;i<=N;i++){
			String[] array2 = new String[4];
			array2 = String.valueOf(i).split("");

			//各桁の和を算出する
			for (String item : array2) {
				tempnum = tempnum + Integer.parseInt(item);
			}
			//各桁の和を比較
			if(tempnum>=A && tempnum<=B){
				//対象の
				array[arraycount] = i;
				arraycount += 1;
			}
			//各桁の和をリセットする
			tempnum = 0;
		}

		for (int i : array) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}