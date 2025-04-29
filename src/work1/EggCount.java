package work1;

public class EggCount {
    public static void main(String[] args) {
//    	int num3 = 200;
//    	System.out.println(num3 / 12 + "打" + num3 % 12 + "顆");
//    	上述改寫如下
        int totalEggs = 200;
        int dozen = totalEggs / 12;
        int remaining = totalEggs % 12;
        System.out.println("總共是 " + dozen + " 打 " + remaining + " 顆");
    }
}
