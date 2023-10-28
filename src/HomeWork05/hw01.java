package HomeWork05;

import java.util.Scanner;

public class hw01 {
	// 1.請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，
	// 即會印出對應的*長方形，如圖：

	public static void main(String[] args) {

		int[] picLongAndpicWeight = new int[2];

		Scanner SC = new Scanner(System.in);

		System.out.println("請輸入圖形的長: ");
		picLongAndpicWeight[0] = SC.nextInt();

		System.out.println("請輸入圖形的長: ");
		picLongAndpicWeight[1] = SC.nextInt();

		for (int i = 0; i < picLongAndpicWeight[0]; i++) {
			System.out.print(i + 1 + ". |");
			for (int j = 0; j < picLongAndpicWeight[1]; j++) {
				System.out.print("*|");
			}
			System.out.println();
		}
	}

}
