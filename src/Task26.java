import java.util.ArrayList;
import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {
        System.out.println(same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}));
        System.out.println(same(new int[]{9, 8, 7, 6}, new int[]{4, 4, 3, 1}));
        System.out.println(same(new int[]{2}, new int[]{3, 3, 3, 3, 3}));
    }

    static boolean same(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr1Copy = new ArrayList<>();
        ArrayList<Integer> arr2Copy = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1Copy.contains(arr1[i])) {
                arr1Copy.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!arr2Copy.contains(arr2[i])) {
                arr2Copy.add(arr2[i]);
            }
        }
        return arr1Copy.size() == arr2Copy.size();
    }
}
