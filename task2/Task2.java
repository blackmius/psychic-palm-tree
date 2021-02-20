import java.util.Arrays;

class Task2 {
    /* Создайте функцию, которая повторяет каждый символ в строке n раз. */
    
    public static String repeat(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < n; j++)
                result += str.charAt(i);
        return result;
    }
    
    
    /* Создайте функцию, которая принимает массив и возвращает разницу между
       самыми большими и самыми маленькими числами. */
       
    public static int differenceMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return max - min;
    }
    
    
    /* Создайте функцию, которая принимает массив в качестве аргумента и
       возвращает true или false в зависимости от того, является ли среднее
       значение всех элементов массива целым числом или нет. */
       
    public static boolean isAvgWhole(int[] array) {
        double sum = 0;
        for (int value : array)
            sum += value;
        return sum % array.length == 0;
    }
    
    
    /* Создайте метод, который берет массив целых чисел и возвращает массив, в
       котором каждое целое число является суммой самого себя + всех предыдущих
       чисел в массиве. */
       
    public static int[] cumulativeSum(int[] array) {
        for (int i = 1; i < array.length; i++)
            array[i] = array[i] + array[i - 1];
        return array;
    }
    
    
    /* Создайте функцию, которая возвращает число десятичных знаков, которое имеет
       число (заданное в виде строки). Любые нули после десятичной точки
       отсчитываются в сторону количества десятичных знаков. */
       
    public static int getDecimalPlaces(String number) {
        if (number.indexOf('.') != -1)
            return number.length() - number.indexOf('.') - 1;
        return 0;
    }
    
    
    /* Создайте функцию, которая при заданном числе возвращает соответствующее
       число Фибоначчи. */
       
    public static int Fibonacci(int n) {
        if (n <= 1) return 1;
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
    
    
    /* Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
       напишите функцию, чтобы определить, является ли вход действительным
       почтовым индексом. Действительный почтовый индекс выглядит следующим
       образом:
        – Должно содержать только цифры (не допускается использование
          нецифровых цифр).
        – Не должно содержать никаких пробелов.
        – Длина не должна превышать 5 цифр. */
        
    public static boolean isValid(String index) {
        if (index.length() != 5) return false;
        for (int i = 0; i < index.length(); i++)
            if (48 > index.charAt(i) || 57 < index.charAt(i))
                return false;
        return true;
    }


    /* Пара строк образует странную пару, если оба из следующих условий истинны:
        – Первая буква 1-й строки = последняя буква 2-й строки.
        – Последняя буква 1-й строки = первая буква 2-й строки.
        – Создайте функцию, которая возвращает true, если пара строк
          представляет собой странную пару, и false в противном случае. */
          
    public static boolean isStrangePair(String str1, String str2) {
        return str1.length() == 0 || str2.length() == 0 ||
               (str1.charAt(0) == str2.charAt(str2.length() - 1) &&
                str1.charAt(str1.length() - 1) == str2.charAt(0));
    }
    
    
    /* Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
        – isPrefix должен возвращать true, если он начинается с
          префиксного аргумента.
        – isSuffix должен возвращать true, если он заканчивается
          аргументом суффикса.
        – В противном случае верните false. */
        
    public static boolean isPrefix(String word, String pref) {
        pref = pref.substring(0, pref.length() - 1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf) {
        suf = suf.substring(1);
        return word.endsWith(suf);
    }
    
    
    /* Создайте функцию, которая принимает число (шаг) в качестве аргумента и
       возвращает количество полей на этом шаге последовательности.
       Шаг 0: начните с 0
       Шаг 1: Добавьте 3
       Шаг 2: Вычтите 1
       Повторите Шаги 1 И 2 ... */
       
    public static int boxSeq(int step) {
        int count = 0;
        for (int i = 0; i < step; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }

    public static void main(String[] args) {
        assert repeat("mice", 5).equals("mmmmmiiiiiccccceeeee");
        assert repeat("hello", 3).equals("hhheeellllllooo");
        assert repeat("stop", 1).equals("stop");
        
        assert differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}) == 82;
        assert differenceMaxMin(new int[] {44, 32, 86, 19}) == 67;
        
        assert isAvgWhole(new int[] {1, 3}) == true;
        assert isAvgWhole(new int[] {1, 2, 3, 4}) == false;
        assert isAvgWhole(new int[] {1, 5, 6}) == true;
        assert isAvgWhole(new int[] {1, 1, 1}) == true;
        assert isAvgWhole(new int[] {9, 2, 2, 5}) == false;
        
        assert Arrays.equals(
            cumulativeSum(new int[] {1, 2, 3}),
            new int[] {1, 3, 6});
        assert Arrays.equals(
            cumulativeSum(new int[] {1, -2, 3}),
            new int[] {1, -1, 2});
        assert Arrays.equals(
            cumulativeSum(new int[] {3, 3, -2, 408, 3, 3}),
            new int[] {3, 6, 4, 412, 415, 418});
            
        assert getDecimalPlaces("43.20") == 2;
        assert getDecimalPlaces("400") == 0;
        assert getDecimalPlaces("3.1") == 1;
        
        assert Fibonacci(3) == 3;
        assert Fibonacci(7) == 21;
        assert Fibonacci(12) == 233;
        
        assert isValid("59001") == true;
        assert isValid("853a7") == false;
        assert isValid("732 32") == false;
        assert isValid("393939") == false;
        
        assert isStrangePair("ratio", "orator") == true;
        assert isStrangePair("sparkling", "groups") == true;
        assert isStrangePair("bush", "hubris") == false;
        assert isStrangePair("", "") == true;
        
        assert isPrefix("automation", "auto-") == true;
        assert isSuffix("arachnophobia", "-phobia") == true;
        assert isPrefix("retrospect", "sub-") == false;
        assert isSuffix("vocation", "-logy") == false;
        
        assert boxSeq(0) == 0;
        assert boxSeq(1) == 3;
        assert boxSeq(2) == 2;
    }
}
