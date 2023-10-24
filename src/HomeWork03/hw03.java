package HomeWork03;

import java.util.Scanner;

//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
public class hw03 {
	public static void main(String[] args) {
		int[] guess = new int[2];
		int rand;
		int count = 0;
		boolean guessq = false;
		int answer;
		int Q;
		guess[0] = 0;  // min
		guess[1] = 100; //max
		
		rand = (int)(Math.random() * guess[1]) + guess[0];
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("rand: " + rand);
		count++;
		do {
			System.out.println("請猜一個 " + guess[0] + " 到 " + guess[1] + " 之間的數字: ");
			Q = Scanner.nextInt();
			answer = rand - Q;
			guessNumIsRight(answer , count);
			count++;
		}while(answer != 0);
		
	}
	
	public static void guessNumIsRight(int answer , int count) {
		
		if (answer > 0) {
			answer = 1;
		}else if(answer < 0) {
			answer = 2;
		}else {
			answer = 0;
		}
		switch (answer) {
			case 0:
				System.out.println("共猜了 " + count + " 次。");
				System.out.println("猜對拉~~太神拉~~");
				break;
			case 1:
				System.out.println("共猜了 " + count + " 次。");
				System.out.println("猜太小拉~~");
				count++;
				break;
			case 2:
				System.out.println("共猜了 " + count + " 次。");
				System.out.println("猜太大拉~~");
				count++;
				break;
		}
	}
}
