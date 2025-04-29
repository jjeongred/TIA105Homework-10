package work4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一段文字: ");
        String input = sc.nextLine(); // 等使用者輸入一整行文字（包含空白），然後按 Enter。輸入的結果會被儲存在變數 input 中。
        /* 這是一個「反向的 for 迴圈」
         * i = input.length() - 1 從字串的最後一個字開始。input.length()用來取得字串長度的寫法。
         * i >= 0 一直跑到字串的第 0 個字（第一個字）為止
         * i-- 每次倒退一個字
         */
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i)); // .charAt(i) 是取出字串 input 的第 i 個字元。
        }
    }
}
