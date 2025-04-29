package work4;

import java.util.Scanner;

public class BorrowMoney {
    public static void main(String[] args) {
    	/* data[0]：第 1 列 → 員工編號
    	 * data[1]：第 2 列 → 對應可借金額
    	 * */
        int[][] data = { 
            {25, 32, 8, 19, 27},
            {2500, 800, 500, 1000, 1200}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你要借的金額：");
        int need = sc.nextInt(); // 把使用者輸入要借的金額的這個數字存在變數 need 裡

        int count = 0; // 計算「有錢可借」的員工人數
        System.out.print("有錢可借的員工編號：");
        for (int i = 0; i < data[0].length; i++) { // 使用 for 迴圈，從第 0 筆資料跑到最後一筆資料（5 筆）
            if (data[1][i] >= need) { // 判斷這位員工的可借金額是否大於等於使用者輸入的金額（need）。data[1][i]：表示第 1 列中的第 i 個值（對應第 i 位員工的可借金額）
                System.out.print(data[0][i] + " "); // 如果符合條件，就印出這位員工的編號。data[0][i]：表示第 i 位員工的「編號」
                count++; // 並讓 count 加 1，表示這是第幾個符合條件的人
            }
        }
        System.out.println("共 " + count + " 人");
    }
}
