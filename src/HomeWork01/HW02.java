package HomeWork01;
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class HW02 {
    public static void main(String[] args){
        int a = 12;
        int answer = 200;

        System.out.print("200顆蛋共是" + answer / 12 + "打，"+ answer % 12 +"顆" );
    }
}
