package HomeWork03;

import java.util.Scanner;

public class hw01 {
	public static void main(String[] args) {
		int[] sides = new int[3];
 		int TriangleType = 0;//判斷三角形的分數。
 		
 		sides = Triangle();
 		
 		TriangleType = checkTriangle(sides, TriangleType);
		
		findTriangle(sides , TriangleType);
	}
	
	public static int[] Triangle() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("請輸入三個整數(int)，以判斷是哪種三角形。");
		System.out.println("請輸入第一個整數: ");
		int side1 = scanner.nextInt();
		
		
		System.out.println("請輸入第二個整數: ");
		int side2 = scanner.nextInt();
		
		
		System.out.println("請輸入第三個整數: ");
		int side3 = scanner.nextInt();
		System.out.println("輸入完成，判斷三角形中... ");
		
		int[] sides= {side1 , side2 , side3};
		return sides;
		
	}
	public static int checkTriangle(int[] arr , int s) {
		
		
			for(int ii = 0 ; ii < arr.length ; ii++) {
				if(arr[ii] <= 0) {
					s = 0;
					return s;//0
				}
			}
					int ii1 = 0;
					if(arr[ii1] == arr[ii1 + 1] 
							 && arr[ii1] == arr[ii1 + 2]
							 && arr[ii1 + 1] == arr[ii1]
							 && arr[ii1 + 1] == arr[ii1 + 2]
							 && arr[ii1 + 2] == arr[ii1]
							 && arr[ii1 + 2] == arr[ii1 + 1]){
						s = 1;
						return s;
					}else if(arr[ii1] == arr[ii1 + 1] 
							||arr[ii1] == arr[ii1 + 2] 
							||arr[ii1 + 1] == arr[ii1] 
							||arr[ii1 + 1] == arr[ii1 + 2] 
							||arr[ii1 + 2] == arr[ii1] 
							||arr[ii1 + 2] == arr[ii1 + 1]) {
						s = 2;
						return s;//2
					}else if (Math.pow(arr[ii1], 2) + Math.pow(arr[ii1 + 1], 2) == Math.pow(arr[ii1 + 2], 2)
							|| Math.pow(arr[ii1], 2) + Math.pow(arr[ii1 + 2], 2) == Math.pow(arr[ii1 + 1], 2)
							|| Math.pow(arr[ii1 + 1], 2) + Math.pow(arr[ii1 + 2], 2) == Math.pow(arr[ii1], 2) ){
						s = 3;
						return s;//3
//						System.out.println("直角三角形");
					}else {
						s = 4;
						return s;
					}
				
			
			
//				System.out.println("其他三角形");
//					return s;
		}
		

	public static void findTriangle(int[]arr , int s) {
		System.out.print("s: " + s);
		switch (s) {
		case 0:
			System.out.println("您輸入的邊為" + arr[0]+ " , " + arr[1]+ " , "  + arr[2] + "。因為三邊等於零，連線都沒有，所以它不是三角形。");
			break;
		case 1:
			System.out.println("您輸入的邊為" + arr[0]+ " , " + arr[1]+ " , "  + arr[2] + "。因為三邊都相同，所以我猜它是正三角形。");
			break;
		case 2:
			System.out.println("您輸入的邊為" + arr[0]+ " , " + arr[1]+ " , "  + arr[2] + "。因為有兩邊為相同，所以我猜它是等腰三角形。");
			break;
		case 3:
			System.out.println("您輸入的邊為" + arr[0]+ " , " + arr[1]+ " , "  + arr[2] + "。因為根據chartGPT老師教我的公式計算(太長省略)，所以我猜它是直角三角形。");
			break;
		case 4:
			System.out.println("您輸入的邊為" + arr[0]+ " , " + arr[1]+ " , "  + arr[2] + "。因為我看不懂這個，所以它是其他三角形。");
			break;
		}
		
		
	}
	
} 