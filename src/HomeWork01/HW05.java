package HomeWork01;
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//        金加利息共有多少錢 (用複利計算,公式請自行google)
    // 複利計算公式：Answer = principal * (1 + r/n)^(nt)
public class HW05 {
    public static void main(String[] args) {
        double principal = 1500000;  // 初始本金
        double rate = 0.02;         // 利率
        int years = 10;             // 年數
        int n = 1;  //複利計算中的每年計息次數
        int Answer = (int) Math.floor(principal * Math.pow((1 + rate / n), n * years));
        System.out.println("10年後，本金加利息共有：" + Answer + " 元");
    }
}