public class Task21 {
    public static void main(String[] args) {
        System.out.println(solutions(1,0,-1));
        System.out.println(solutions(1,0,0));
        System.out.println(solutions(1,0,1));
    }

    static int solutions(int a, int b, int c) {
        double discriminant = (b * b) - (4 * a * c); //Считает дискриминант
        //Если дискриминант = 0, будет 1 корень
        if (discriminant == 0) {
            return 1;
        }
        //Если дискриминант > 0, будет 2 корня
        else if (discriminant > 0) {
            return 2;
        }
        //Иначе (если дискриминант меньше нуля) - нет корней.
        else {
            return 0;
        }
    }
}