package work2;

public class DescendingTriangle {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {    // 外層的 for 迴圈，用來控制「總共有幾行」
            for (int j = 1; j <= i; j++) { // 內層的 for 迴圈，控制「每一行印幾個數字」
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
