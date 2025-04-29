package work3;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random() * 10); // 產生 0~9 亂數
//        int answer = (int)(Math.random() *10) + 1; // 產生 1~10 亂數
        /* Math.random() 會產生 0.0 到小於 1.0 的亂數，
         * 乘上 10 後就會變成：0.0 ~ 9.999...，
         * (int) 強制轉型成整數 → 就會變成 0 ~ 9 的整數！
         * */
        System.out.println("開始猜數字吧！（0～9）");
        int guess;
        // do-while 迴圈 的語法：先做一次裡面的內容，再判斷是否繼續執行。
        do {
            guess = sc.nextInt();
            if (guess != answer) {
                System.out.println("猜錯囉");
            }
        } while (guess != answer);

        System.out.println("答對了！答案就是 " + answer);
    }
}
