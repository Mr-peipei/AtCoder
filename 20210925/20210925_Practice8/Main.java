import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Nを取得する
		int N = sc.nextInt();

		int digits = 0;
		String num = "" + N;
		digits = num.length();

		int tempnum = 0;
		int count = 0;

		//桁数分計算
		for(int j=1;j<digits;j++){
			tempnum = tempnum + (int)Math.pow(10, j-1);
			count = count + tempnum;
		}

		if(digits>=1){

			//桁数 1 10 100など
			int num2=(int)Math.pow(10,digits-1);

			//桁数加算
			if(N-num2>num2){
				tempnum = tempnum + (int)Math.pow(10, digits-1);
				count = count + tempnum;
				System.out.println(count);
			}else{
				for(int i=num2;i<=N;i++){
					String[] str = String.valueOf(i).split("");
					for (String string : str) {
						if(string.equals("1")){
							count += 1;
						}else{
							break;
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}