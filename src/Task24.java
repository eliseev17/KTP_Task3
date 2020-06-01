public class Task24 {
    public static void main(String[] args) {
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));
    }

    static String flipEndChars(String string) {
        // если длина строки меньше 2, выводим сообщение
        if (string.length() < 2)
            return "Incompatible";
        // ели первый и последний символы равны, выводим сообщение
        if (string.charAt(0) == string.charAt(string.length() - 1))
            return "Two's a pair";
        char start = string.charAt(0); // первый символ
        char end = string.charAt(string.length() - 1); // последний символ
        // возвращаем итоговую строку:
        // в начале будет последний символ (end), в конце первый (start)
        // по середине будет кусок строки (подстрока substring)
        // начинающаяся от 2-го символа (индекс равен 1) до последнего не включительно (индекс равен string.length() - 1)
        return end + string.substring(1, string.length() - 1) + start;
    }
}
