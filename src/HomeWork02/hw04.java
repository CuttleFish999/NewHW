package HomeWork02;
//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
public class hw04 {
	static int[] answer = new int[10];
	
	public static void main(String[] args) {
		
		int[] value = {1 ,4 ,9 ,16 ,25 ,36 ,49 ,64 ,81 ,100};
		
		addArrayAnswer(value); 
	}
	public static void addArrayAnswer(int[]value) {
	    for (int i = 0; i < value.length; i++) {
            answer[i] = (value[i]);
            System.out.print(answer[i]);
            System.out.print(" ");
        }       
    }

	
	
}
