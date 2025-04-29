package work2;

public class ProductFor {
    public static void main(String[] args) {
//		int count = 1;
//		for(int count = 1; count <= 10; count++) {
//			sum *= count;
//			System.out.println(sum);
//		}
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("1~10 的連乘積為: " + product);
    }
}
