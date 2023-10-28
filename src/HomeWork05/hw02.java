package HomeWork05;
//2.請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，
//如圖：
public class hw02 {
	public static void main(String[] args) {
		randAvg(10);
	}
	
	public static void randAvg(int c) {
		int count;
		int randCount = 0;
		int rand;
		int[] rands = new int[10];
		int MaxNum = 100;
		int MinNum = 0;
		int AVGNum = 0;
		count = c;
		
		do {
			rand =(int) ((Math.random() * MaxNum - MinNum + 1 )) + MinNum;
			rands[randCount] = rand;
			randCount++;
			AVGNum += rand;
		} while(randCount < count);
		
		
		for (int i = 0 ; i < rands.length ; i++) {
			if (i == rands.length - 1) {
				System.out.print(rands[i]);
			}else {
				System.out.print(rands[i] + " ,");
			}
			
			
		}
		System.out.println();
		AVGNum /= rands.length;
		System.out.print("平均數為: " + AVGNum + "。");
	}
}
