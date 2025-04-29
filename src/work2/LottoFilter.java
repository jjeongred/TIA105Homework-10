package work2;

public class LottoFilter {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 49; i++) {
        	/* String.valueOf(i)：把整數 i 轉成字串，例如數字 14 → 變成字串 "14"
        	.contains("4")：檢查這個字串有沒有包含字元 '4' */
            if (String.valueOf(i).contains("4")) { 
                continue; // continue 會跳過下面那兩行，直接進入下一個 i
            }
            System.out.print(i + " "); // 如果沒有包含 4，就印出來並累加 count
            count++;
        }
//        上述寫法同下，改寫成這樣理解會更直覺
//        int count = 0;
//        for (int i = 1; i <= 49; i++) {
//	        String num = Integer.toString(i); // Integer.toString(i) 也能把整數轉成字串。
//	        if (num.contains("4")) {
//	            continue; // continue 會跳過下面那兩行，直接進入下一個 i
//	        }
//	        System.out.print(i + " "); // 如果沒有包含 4，就印出來並累加 count
//	        count++;
//        }
        System.out.println("\n總共有 " + count + " 個數字可以選擇");
    }
}
