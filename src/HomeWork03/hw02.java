package HomeWork03;

import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
//guess0To9();
public class hw02 {
	public static void main(String[] args) {
		
		int[] range = new int[2];
		
		int count = 0;
		
		range[0] = 0; // MIN
		range[1] = 10; // MAX Need than the MaxNumber plus 1。
		
		Scanner Scanner = new Scanner(System.in);
		
		
		
		int rand = (int)(Math.random() * range[1]) + range[0];
//		System.out.println("隨機數字為: " + rand);
		
		
		boolean Answer;
		do {			
			System.out.println("目前猜了第 " + count + "次");
			System.out.println("請輸入一個數字: ");
			int ScannerQ = Scanner.nextInt();
			Answer = guessNum(ScannerQ , rand , count);
			count++;
		}while(!Answer);
		
		
	}
		public static boolean guessNum(int Q , int rand , int count) {
			if (Q > rand) {
				System.out.println("你猜太大了，在小一點^^");
				return false;
				
			}else if(Q < rand) {
				System.out.println("你猜太小了，在大一點^^");
				return false;
			}
			System.out.println("你猜對了，太神拉^^!!您猜了 " + count + " 次");
			return true;
		
		}
}
