package HomeWork05;

public class genAuthCode {
	public static void main(String[] args) {
		genAuthCode();
	}
	
	
	public static char[] genAuthCode() {
		char[] arr = new char[8];
		char BigWriteWord;
		char SmallWriteWord;
		
		int StartWord = 65;
 		int EndWord = 90;
		
		
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = (char) ((char) (Math.random() * (EndWord - StartWord + 1)) + StartWord);
				System.out.print(arr[i] + " ");
			}
			
		int StartWord2 = 97;
 		int EndWord2 = 122;	
	 		
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = (char) ((char) (Math.random() * (EndWord2 - StartWord2 + 1)) + StartWord2);
				System.out.print(arr[i] + " ");
			}
		return arr;
	}
	
}
