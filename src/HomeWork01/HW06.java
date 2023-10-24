package HomeWork01;
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//        5 + 5
//        5 + ‘5’
//        5 + “5”
//        並請用註解各別說明答案的產生原因
public class HW06 {
    public static void main(String[] args){
        System.out.print("題目一: ");
        System.out.print(5 + 5);
//        5 和 5 都是 int 所以可以相加。而在()中會先計算，所以 5 + 5 = 10，計算完成後將結果Print。
//        System.out.println("題目二:" + 5 + '5');

        System.out.print("\n題目二: ");
        System.out.print(5 + '5');
//      字符 '5' 有一個相應的 ASCII 值，而這個值是 53 。所以 5 + 53 = 58。
        System.out.print("\n題目三: ");
        System.out.print(5 + "5");
//      (int)5 + (String) 5 。因為型別不同無法相加，而print碰到String與int連接符(+)後，會將int強制轉型成String。
//      所以變成"5" + "5" = "55"。
    }
}
