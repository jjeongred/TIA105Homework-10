package work1;

public class PrintResults {
    public static void main(String[] args) {
//    	System.out.println(5 + 5);   // 兩個數字5相加得出的結果
//    	System.out.println(5 + '5'); // 數字5與字元5代表的數字53作相加
//    	System.out.println(5 + "5"); // 數字5與字串5的串接
//    	上述改寫如下
        System.out.println(5 + 5);       // 數字相加 = 10
        System.out.println(5 + '5');     // '5' 是字元，轉為 ASCII 值 53，所以 5 + 53 = 58
        System.out.println(5 + "5");     // 字串加數字 = 字串串接，結果是 "55"
    }
}
