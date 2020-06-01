public class Task22 {
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed") );
    }

    static int findZip(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.startsWith("zip", i))
                counter++;
            if (counter == 2)
                return i;
        }
        return -1;
    }
}
