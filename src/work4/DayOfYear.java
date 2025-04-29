package work4;

import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入年份 月 日（用空格分隔）：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; // 這是存放每個月「有幾天」的陣列：days[0] 是 1 月（31 天）、days[1] 是 2 月（28 天）……索引值是 月 - 1
        /* 閏年的規則
         * 條件:
         * 年份能被 4 整除 → 是潤年
         * 但如果能被 100 整除 → 不是潤年
         * 除非又能被 400 整除 → 是潤年*/
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 「是 4 的倍數且不是 100 的倍數」或是「是 400 的倍數」，那就是閏年
            days[1] = 29; // 如果 year 是閏年，就把 2 月（days[1]）的天數從 28 改成 29
        }

        if (month < 1 || month > 12 || day < 1 || day > days[month - 1]) {
            System.out.println("日期格式錯誤！");
            return; // 「結束目前的方法」的執行，立刻跳出，不再往下執行」
        }
        // 加總前面所有月份的天數 + 當月天數
        int total = 0;
        for (int i = 0; i < month - 1; i++) { // 把「從 1 月到前一個月」的天數全部加起來。month - 1 是為了配合陣列索引從 0 開始
            total += days[i]; // 每次迴圈把第 i 個月的天數加到總天數 total 裡
        }
        total += day; // 最後，再加上「當月的第幾天」

        System.out.println("輸入的日期為該年的第 " + total + " 天");
    }
}
