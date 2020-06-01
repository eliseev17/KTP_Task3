import java.util.ArrayList;
import java.util.Collection;

public class Task23 {
    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
    }

    static boolean checkPerfect(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i * j == number)
                    arrayList.add(i);
            }
        }
        int sum = 0;
        for (Integer value : arrayList) {
            sum += value;
        }
        if (sum == number)
            return true;
        else return false;
    }
}
