package work2;

public class Work2 {
	public static void main (String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				System.out.println(sum += i);
			}
		}
		
		for(int count = 1; count <= 10; count++) {
			sum *= count;
			System.out.println(sum);
		}
		
		int count = 1;
		while(count <= 10) {
			sum *= count;
			count++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
