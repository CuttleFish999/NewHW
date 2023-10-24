package HomeWork04;
//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)
public class hw02 {
	public static void main(String[] args) {
		String s = "Hello World";
		changeStringPosition(s);
	}
	
	public static void changeStringPosition(String S) {
		char[] AnswerArr = new char[S.length()];
 		for(int i = S.length() - 1 ; i >= 0 ; i--) {
 			AnswerArr[i] = S.charAt(i);
 			System.out.print(AnswerArr[i]);
 		}
		
		
	}
}
