package work2;

public class AlphabetTriangle {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'F'; ch++) {
            for (int i = 1; i <= (ch - 'A' + 1); i++) { // ch - 'A' 是計算目前這個字母離 'A' 有幾個字元的距離
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
