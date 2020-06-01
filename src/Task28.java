public class Task28 {
    public static void main(String[] args) {
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
    }

    static String longestZero(String string) {
        int maxAmount = 0;
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                counter++;
            } else counter = 0;
            if (counter > maxAmount) {
                maxAmount = counter;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxAmount; i++) {
            result.append('0');
        }
        return result.toString();
    }
}
