package work4;

public class HighestScoreCount {
    public static void main(String[] args) {
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},
            {37, 75, 77, 89, 64, 75, 70, 95},
            {100, 70, 79, 90, 75, 70, 79, 90},
            {77, 95, 70, 89, 60, 75, 85, 89},
            {98, 70, 89, 90, 75, 90, 89, 90},
            {60, 80, 100, 75, 50, 20, 99, 75}
        };

        for (int student = 0; student < 8; student++) { // 外層迴圈：一位一位「同學」處理
            int highest = 0;
            int count = 0;
            for (int test = 0; test < 6; test++) { // 利用 for 迴圈，找出這位學生在 6 次測驗中分數最高的是多少
                if (scores[test][student] > highest) { // scores[test][student] 表示第 test 次測驗，第 student 位同學的分數
                    highest = scores[test][student]; // 每次比較：如果比現在的 highest 還高，就更新它
                }
            }
            for (int test = 0; test < 6; test++) { // 再跑一次 6 次測驗，統計這位同學「考幾次最高分」
                if (scores[test][student] == highest) { // 如果成績等於剛剛找到的最高分 → count++
                    count++;
                }
            }
            /* student + 1 是因為陣列是從 0 開始，但我們想印出「1號～8號」同學
             * 印出這位同學在 6 次測驗中有幾次考到「自己最高的那個分數」*/
            System.out.println((student + 1) + "號同學有 " + count + " 次最高分");
        }
    }
}
