package work2;

public class Work2 {
	public static void main (String[] args) {
		
//		int y, x;
//		for(y = 1; y <= 9; y++) {
//			for(x = 1; x <= 9; x++) {
//				System.out.print(y + "*" + x + "=" + y * x + "\t");
//			}
//			System.out.println();
//		}
		
		
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
			sum += i;
			}
		}
		System.out.println(sum);
		
//		// 3628800->1乘到9
//		int count = 1;
//		for(int count = 1; count <= 10; count++) {
//			sum *= count;
//			System.out.println(sum);
//		}
//		
//		while(count <= 10) {
//			sum *= count;
//			count++;
//			System.out.println(sum);
//		}
	}
}
