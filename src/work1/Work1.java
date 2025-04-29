 package work1;

public class Work1 {
    public static void main (String[] args) {
    	// 計算12，6這兩個數值的和與積
    	int num1 = 12, num2 = 6;
    	System.out.println(num1 + num2);
    	System.out.println(num1 * num2);
    	
    	// 計算200顆蛋共是幾打幾顆?
    	int num3 = 200;
    	System.out.println(num3 / 12 + "打" + num3 % 12 + "顆");
    	
    	// 算出256559秒為多少天、多少小時、多少分與多少秒
    	int num4 = 256559;
    	System.out.print(num4 / (60 * 60 * 24) + " 天 ");
    	System.out.print((num4 / (60 * 60)) % 24  + " 小時 ");
    	System.out.print((num4 / (60 * 60)) % 60  + " 分 ");
    	System.out.println((num4 / (60 * 60)) % 120  + " 秒 ");
    	
    	/* 請定義一個常數為3.1415(圓周率)，
    	 * 並計算半徑為5的圓面積與圓周長
    	 */
    	double d1 = 3.1415;
    	int radius = 5;
    	System.out.println(Math.pow(radius, 2) * d1);
    	System.out.println((radius * 2) * d1);
    	
    	/* 某人在銀行存入150萬，銀行利率為2%，
    	 * 計算10年後，本金加利息共有多少錢(用複利公式計算)
    	 */
    	int i1 = 1500000; double d2 = 0.02;
    	System.out.println(i1 * Math.pow((1 + d2),10));
    	
    	/* 利用System.out.println()印出以下三個運算式結果
    	 * 註解各別說明答案的產生原因
    	 */    	
    	System.out.println(5 + 5); // 兩個數字5相加得出的結果
    	System.out.println(5 + '5'); // 數字5與字元5代表的數字53作相加
    	System.out.println(5 + "5"); // 數字5與字串5的串接
    }
}
