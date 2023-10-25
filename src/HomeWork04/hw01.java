 package HomeWork04;
//• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class hw01 {
	public static void main(String[] args) {
		int[] haveAArr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		AllAVGMAXMIN(haveAArr);
	}
	
	public static int[] AllAVGMAXMIN(int[] arr) {
		int[] AnswerArr = new int[arr.length];
		int Max = arr[0];
		int Min = arr[0];
		int AVG = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			AVG += arr[i];
			if(Max < arr[i]) {
				Max = arr[i];
			}
		}
		
		AVG /= arr.length;
		
		for(int i = 0 ; i < arr.length ; i++) {
//			AVG += arr[i];
			if(Min > arr[i]) {
				Min = arr[i];
			}
		}
		int[] QQ = new int[]{Max , Min , AVG};
		for(int j = 0 ; j < QQ.length ; j++) {
			
			switch (j) {
			case 0:
				System.out.println("最大數值為: " + QQ[j]);
				break;
			case 1:
				System.out.println("最小數值為: " + QQ[j]);
				break;
			case 2:
				System.out.println("平均數值為: " + QQ[j]);
				System.out.println("2232");
				break;
		}
//			System.out.println(QQ[j]);
		}
		
		
		
		return QQ ;
		
		
		
		
	}
}
