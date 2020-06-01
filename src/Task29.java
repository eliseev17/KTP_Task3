public class Task29 {
    public static void main(String[] args) {
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
    }

    static int nextPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return nextPrime(number + 1);
        }
        return number;
    }
}