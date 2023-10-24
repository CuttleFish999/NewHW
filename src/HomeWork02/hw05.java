package HomeWork02;
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class hw05 {
	public static void main(String[] args) {
		int[] canSelectNum = new int[49];
		putCanSelectNum(canSelectNum);
		
		
	}
	public static int[] putCanSelectNum(int[]arr) {
		int count = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			int find40 = i / 10;
			int find4 = i % 10;
//			if(i % 4 == 0) {
				
//			}else if(i % 10 == 0) {
				
			if(find40 == 4 || find4 == 4) {
					
			}else{
				arr[i] = i;
				count++;
				System.out.print(i + " ");
				
			}
		
//			System.out.print(i);
//			System.out.print(arr[i]);
			
		}
		System.out.println();

		System.out.print("共可以選擇:" + count + "個數字");
		return arr;
	}
}
