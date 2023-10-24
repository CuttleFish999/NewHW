package HomeWork01;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class HW03 {
    public static void main(String[] args){
        int QQ = 256559;

        int Seconds = 1;
        int minute = 60 * Seconds;
        int hour = 60 * minute;
        int Day = 24 * hour;

        int QSeconds;
        int Qminute;
        int Qhour;
        int QDay;

        QSeconds = QQ % minute;
        Qminute = QQ % minute;
        Qhour = Qminute % hour;
        QDay = Qhour % Day;

        System.out.println("256559秒是:" + QDay + "天" + Qhour +"時" + Qminute + "分" + QSeconds +"秒");

    }
}
