import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		int a = sc.nextInt();
		int[] array = new int[a];

		for(int i=0;i<array.length;i++){
		    int box = sc.nextInt();
			array[i] = box;
		}
		//回数を取得する
		int count = 0;
		Boolean flag = false;

		for (int i=0;i<100;i++) {
			for(int j=0;j<array.length;j++){
				//奇数になった場合ループを抜ける
				if(array[j]%2!=0){
					flag = true;
					break;
				}
				array[j]=array[j]/2;
			}
			//arrayの中に奇数があればループを抜ける
			if(flag){
				break;
			}else{
				count += 1;
			}
        }

		System.out.println(count);
	}
}