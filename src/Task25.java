public class Task25 {
    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));
    }

    static boolean isValidHexCode(String code) {
        // если первый символ это # то мы убираем его из строки и продолжаем
        if (code.charAt(0) == '#') {
            // записываем в строку эту же строку но не с 0-го индекса а 1-го, чтобы удалить '#'
            code = code.substring(1);
        } else return false; // иначе возвращаем false и зваершаем работу метода
        // если в строке не 6 символом, завершаем работу метода и возвращаем false
        if (code.length() != 6)
            return false;
        // определяем переменную, которая показывает правильный ли символ
        boolean result = false;
        // перебираем все символы строки
        for (int i = 0; i < code.length(); i++) {
            // если символ это цифра, то присваиваем переменной result true
            if (code.charAt(i) >= '0' && code.charAt(i) <= '9') {
                result = true;
            }
            // если символ это буква по условию, то присваиваем переменной result true
            else if (code.charAt(i) >= 'A' && code.charAt(i) <= 'F' || code.charAt(i) >= 'a' && code.charAt(i) <= 'f') {
                result = true;
            } else result = false; // если ни одно условие не соблюдено присваиваем false
        }
        // возвращаем значение переменной
        return result;
    }
}
