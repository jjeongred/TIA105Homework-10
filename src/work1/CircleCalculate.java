package work1;

public class CircleCalculate {
    public static void main(String[] args) {
//    	double d1 = 3.1415;
//    	int radius = 5;
//    	System.out.println(Math.pow(radius, 2) * d1);
//    	System.out.println((radius * 2) * d1);
//    	上述改寫如下
    	double pi = 3.1415;
        double radius = 5;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        System.out.println("圓面積: " + area);
        System.out.println("圓周長: " + circumference);
    }
}
