import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		int N = sc.nextInt();
		//引数を格納する。
		Integer[] array = new Integer[N];
		for(int i=0;i<array.length;i++){
			int x = sc.nextInt();
			array[i] = x;
		}
		Arrays.sort(array, Collections.reverseOrder());

		//配列数を算出する
		int alinum = 0;
		int bobnum = 0;
		if(N%2==1){
			alinum = N/2+1;
			bobnum = N/2;
		}else{
			alinum = N/2;
			bobnum = N/2;
		}
		//アリスの配列を用意する。
		int[] AliceNum = new int[alinum];
		//ボブの配列を用意する。
		int[] BobNum = new int[bobnum];

		alinum = 0;
		bobnum = 0;
		for(int i=0;i<N;i++){
			if(i%2==0){
				AliceNum[alinum] = array[i];
				alinum += 1;
			}else{
				BobNum[bobnum] = array[i];
				bobnum += 1;
			}
		}
		// System.out.println(Arrays.toString(AliceNum));
		// System.out.println(Arrays.toString(BobNum));

		//AliceNumのSumを算出する
		int alisum = 0;
		for (int i : AliceNum) {
			alisum += i;
		}

		//BobNumからSumを算出する
		int bobsum = 0;
		for (int j : BobNum) {
			bobsum += j;
		}

		System.out.println(alisum - bobsum);
	}
}