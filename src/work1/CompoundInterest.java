package work1;

public class CompoundInterest {
    public static void main(String[] args) {
//    	int i1 = 1500000; double d2 = 0.02;
//    	System.out.println(i1 * Math.pow((1 + d2),10));
//    	上述改寫如下
        double principal = 1500000;
        double rate = 0.02;
        int years = 10;
        double amount = principal * Math.pow((1 + rate), years);
        System.out.println("10 年後本金加利息共: " + amount + " 元");
    }
}
