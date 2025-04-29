package work4;

public class ArrayAboveAverage {
    public static void main(String[] args) {
        int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}; // 宣告一個整數陣列 arr，裡面有 10 個元素。[] 表示這是一維陣列，大括號裡面就是要分析的資料。
        int sum = 0; // 用來儲存總和，初始值設為 0。
        // foreach 迴圈用來跑陣列裡的每一個值，每次跑，n 會等於陣列中的一個值
        for (int n : arr) {
            sum += n; // 每個值都加進去，累加起來
        }
//        // 上述也可以用下面的傳統 for 迴圈寫法
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }

        double avg = (double)sum / arr.length; // (double)sum：強制把整數轉成小數，避免整數除法（會捨去小數）。arr.length：表示陣列的長度（這裡是 10）。
        System.out.println("平均值: " + avg);
        System.out.print("大於平均的元素有: ");
        for (int n : arr) {
            if (n > avg) {
                System.out.print(n + " ");
            }
        }
    }
}
