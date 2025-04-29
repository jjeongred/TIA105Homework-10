package work4;

public class VowelCount {
    public static void main(String[] args) {
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}; // 這是陣列 planets，裡面放了 8 個字串
        int count = 0; // 建立一個變數 count，用來統計所有母音的數量，初始值設為 0。
        /* 使用 foreach 迴圈，逐一抓出每個行星名稱字串。
         * 每次迴圈，planet 就會是一個像 "venus" 或 "mars" 的字串。
         * */
        for (String planet : planets) {
            for (int i = 0; i < planet.length(); i++) { // 對當前的 planet 字串跑一圈，逐字讀出每個字元（字母）。
                char ch = planet.charAt(i); // charAt(i) 表示取得第 i 個字元（例如 m、e、r...）
                if ("aeiou".indexOf(ch) != -1) { // .indexOf(ch) 會去查 ch 在這個字串中的位置：如果找得到，會回傳位置（像 0、1、2），如果找不到，會回傳 -1。
                    count++; // 計數器加一，累積母音出現次數。
                }
            }
        }
        System.out.println("總共有 " + count + " 個母音");
    }
}
