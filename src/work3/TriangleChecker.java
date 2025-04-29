package work3;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 我建立了一個 Scanner 物件 sc，它會從鍵盤（System.in）讀取使用者輸入。
    	
        System.out.print("請輸入三個整數: ");
        int a = sc.nextInt(); // sc.nextInt();指Scanner自動幫我們把輸入的文字轉換成整數
        int b = sc.nextInt(); // nextInt() 是 Scanner 物件的方法，用來讀取使用者輸入的「下一個整數」。
        int c = sc.nextInt(); // 請從鍵盤讀一個整數，然後把它存進變數 c

        // 先判斷是否為三角形（任兩邊和 > 第三邊）
        if (a + b > c && a + c > b && b + c > a) {
            // 判斷是否為正三角形
            if (a == b && b == c) {
                System.out.println("正三角形");
            }
            // 判斷是否為直角三角形（使用畢氏定理 a² + b² = c²）
            else if (a * a + b * b == c * c || 
                     a * a + c * c == b * b || 
                     b * b + c * c == a * a) {
                System.out.println("直角三角形");
            }
            // 判斷是否為等腰三角形
            else if (a == b || a == c || b == c) {
                System.out.println("等腰三角形");
            }
            // 其它普通三角形
            else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
    }
}
