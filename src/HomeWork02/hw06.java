package HomeWork02;
//請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class hw06 {
	public static void main(String[] args) {
		for(int j = 10 ; j > 0 ; j--) {	
			for(int i = 1 ; i <= j ; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
