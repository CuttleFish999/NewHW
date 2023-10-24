package HomeWork02;
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class hw03 {
	public static void main(String[] args) {
		int count = 1;
		int answer = 1;
		do {
			answer *= count;
		}
		while(count <= 10);
		
		System.out.print(answer);
	}
}
