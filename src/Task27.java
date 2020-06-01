public class Task27 {
    public static void main(String[] args) {
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));
    }

    static boolean isKaprekar(int number) {
        if (number == 0 || number == 1)
            return true;
        int square = number * number;
        String sNumber = String.valueOf(square);
        int left;
        int right;
        if (sNumber.length() % 2 != 0) {
            if (sNumber.length() == 1) {
                left = 0;
                right = square;
            } else {
                left = Integer.parseInt(sNumber.substring(0, (sNumber.length() - 1) / 2));
                right = Integer.parseInt(sNumber.substring((sNumber.length() - 1) / 2));
            }
        } else {
            left = Integer.parseInt(sNumber.substring(0, sNumber.length() / 2));
            right = Integer.parseInt(sNumber.substring(sNumber.length() / 2));
        }
        return left + right == number;
    }
}
