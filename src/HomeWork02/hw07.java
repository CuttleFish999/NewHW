package HomeWork02;
//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class hw07 {
	public static void main(String[] args) {
//		char charQ = 'A';
//		int unicode = (int) charQ;
//		System.out.println(unicode);
		int charQ = 65;
		for(int j = 1 ; j < 7 ; j++) {
			for(int i = 1;  i <= j ; i++) {
				System.out.print(changeNumToChar(charQ));	
			}
			charQ++;
			System.out.println();
		}
		
	}
	public static char changeNumToChar(int num) {
       		char charQ = (char)num;
		return charQ;
	}
}
