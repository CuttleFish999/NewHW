package HomeWork01;
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class HW04 {
    public static void main(String[] args){
        final double PI = 3.1315;
        int radius = 5;
        double 面積 = Math.pow(PI * radius,2);
        double 圓周長 = (radius * radius) * PI;

        System.out.println("面積是: " + 面積);
        System.out.println("圓周長是: " + 圓周長);
    }
}
