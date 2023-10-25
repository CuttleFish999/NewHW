package HomeWork04;

import java.util.Scanner;
//
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//
//(提示:Scanner,二維陣列)
public class hw04 {
	public static void main(String[] args) {
		int[][] peopleMonkey = { { 25, 32, 8, 19, 27 }, 
				   { 2500, 800, 500, 1000, 1200 } 
				 };
		System.out.print("請輸入想借多少? ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
//		System.out.println(howManyPeopleHaveMoney(peopleMonkey,input) + " 人");
		howManyPeopleHaveMoney(peopleMonkey,input);
		
	}
	public static int howManyPeopleHaveMoney(int[][] arr , int input) {
		int count = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(i == 1 && input >= arr[1][j]) {
					System.out.println(arr[0][j] + " 號");
					count++;
				}
			}
		}
		System.out.println("共 " + count + " 個人。");
		return count;
	}
	
}
