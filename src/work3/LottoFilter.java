package work3;

import java.util.Scanner;

public class LottoFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("阿文…請輸入你討厭哪個數字（1~9）？ ");
        int hate = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= 49; i++) {
            if (String.valueOf(i).contains(String.valueOf(hate))) { // String.valueOf(i)：把整數轉成字串，例如 14 → "14"，contains(String.valueOf(hate))：檢查字串中是否包含討厭的數字
                continue; // 如果有包含討厭的數字，就用 continue 跳過這個數字，不執行下面的印出與計數
            }
            System.out.printf("%-3d", i); // printf() 的意思是：Print Formatted：列印「格式化」的輸出。%-3d 表示寬度是 3 個字元，靠左對齊（沒有 - 就是右對齊），d代表是整數（decimal）
            count++; // count++ 記錄有幾個符合條件的數字
            if (count % 7 == 0) System.out.println(); // 每印出 7 個數字就會換一行
        }
        System.out.println("\n總共有 " + count + " 筆數可選擇");
    }
}
