package work1;

public class TimeTransform {
    public static void main(String[] args) {
//    	int num4 = 256559;
//    	System.out.print(num4 / (60 * 60 * 24) + " 天 ");
//    	System.out.print((num4 / (60 * 60)) % 24  + " 小時 ");
//    	System.out.print((num4 / (60 * 60)) % 60  + " 分 ");
//    	System.out.println((num4 / (60 * 60)) % 120  + " 秒 ");
        int totalSeconds = 256559;
        int days = totalSeconds / (24 * 3600);
        int hours = (totalSeconds % (24 * 3600)) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(days + " 天 " + hours + " 小時 " + minutes + " 分鐘 " + seconds + " 秒");
    }
}
