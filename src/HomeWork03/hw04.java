package HomeWork03;

import java.util.Arrays;
import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數
public class hw04 {
	public static void main(String[] args) {
		
		int[] canSelectNum = new int[50];
		addCanSelectNumToArr(canSelectNum);
		
		
	}
	public static int[] addCanSelectNumToArr(int[] arr) {
		for(int i = 1 ; i < arr.length ; i++ ) {
			arr[i] = i;
		}
		return arr;
	}
}
