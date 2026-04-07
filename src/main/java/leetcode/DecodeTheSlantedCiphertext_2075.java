package leetcode;

public class DecodeTheSlantedCiphertext_2075 {
    public static String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            int row = 0;
            int col = c;
            while (row < rows && col < cols) {
                sb.append(encodedText.charAt(row * cols + col));
                row++;
                col++;
            }
        }
        int lastIdx = sb.length() - 1;
        while (lastIdx >= 0 && sb.charAt(lastIdx) == ' ') {
            lastIdx--;
        }
        return sb.substring(0, lastIdx + 1);
    }

    public static void main(String[] args) {
        System.out.println("Answer : " + decodeCiphertext("ch   ie   pr", 3));
    }
}
