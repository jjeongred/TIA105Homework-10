package work2;

public class EvenSum {
    public static void main(String[] args) {
//    	int sum = 0;
//		for(int i = 1; i <= 1000; i++) {
//			if(i % 2 == 0) {
//			sum += i;
//			}
//		}
//		System.out.println(sum);  
//    	上述改寫如下
    	int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println("偶數總和為: " + sum);
    }
}
