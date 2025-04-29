package work2;

public class ProductWhile {
    public static void main(String[] args) {
//		while(count <= 10) {
//		sum *= count;
//		count++;
//		System.out.println(sum);
//	}
        int product = 1;
        int i = 1;
        while (i <= 10) {
            product *= i;
            i++;
        }
        System.out.println("1~10 的連乘積為: " + product);
    }
}
