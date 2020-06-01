import java.util.Arrays;

public class Task30 {
    public static void main(String[] args) {
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
    }

    static boolean rightTriangle(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        int hypotenuse = array[2];
        int katet1 = array[1];
        int katet2 = array[0];
        return hypotenuse * hypotenuse == katet1 * katet1 + katet2 * katet2;
    }
}
