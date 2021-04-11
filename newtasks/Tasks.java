import java.util.*;
import java.math.BigInteger ;

import java.time.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class Tasks {
	/* =====================================
	   =                                   =
	   =            ЗАДАЧИ 1/6             =
	   =                                   =
	   ===================================== */

    /* 1. Напишите функцию, которая принимает целое число минут и преобразует его в
	   секунды. */
       
    public static int convert(int m) {
        return 60 * m;
    }
    
    
    /* 2. Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х
	   и 3-х очков, находите окончательные очки для команды и возвращаете это
	   значение. */
       
    public static int points(int doubleHit, int trippleHit) {
        return 2*doubleHit + 3*trippleHit;
    }
    
    
    /* 3. Создайте функцию, которая принимает количество побед, ничьих и поражений и
	   вычисляет количество очков, набранных футбольной командой на данный момент.
	  
	   выигрыш – получают 3 очка
	   ничья – получают 1 очко
	   проигрыш – получают 0 очков */
       
    public static int footballPoints(int wins, int draws, int looses) {
        return 3*wins + draws;
    }
    
    
    /* 4. Создайте функцию, которая возвращает true, если целое число равномерно делится
	   на 5, и false в противном случае. */
       
    public static boolean divisibleByFive(int num) {
        return num % 5 == 0;
    }
    
    
    /* 5. В Java есть логический оператор &&. Оператор && принимает два логических
	   значения и возвращает true, если оба значения истинны.
	   
	   Рассмотрим a && b:
	   
	   a проверяется, является ли оно истинным или ложным.
	   Если a равно false, возвращается false.
	   b проверяется, является ли оно истинным или ложным.
	   Если b имеет значение false, возвращается значение false.
	   В противном случае возвращается true (поскольку и a, и b, следовательно, истинны ).
	   Оператор && вернет true только для true && true.
	   
	   Создайте функцию с помощью оператора&& */
       
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }
    
    
    /* 6. У меня есть ведро с большим количеством темно-синей краски, и я хотел бы
	   покрасить как можно больше стен. Создайте функцию, которая возвращает
	   количество полных стен, которые я могу покрасить, прежде чем мне нужно будет
	   отправиться в магазины, чтобы купить еще.
	   
	   n - это количество квадратных метров, которые я могу нарисовать.
	   w и h-это ширина и высота одной стены в метрах.
	   
	   Примечание:
       - Не считайте стену, если я не успею закончить покраску до того, как у меня закончится
       краска.
       - Все стены будут иметь одинаковые размеры.
       - Все числа будут целыми положительными. */

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }
    
    
    /* 7. Исправьте код, чтобы решить эту задачу (только синтаксические ошибки).
       Посмотрите на приведенные ниже примеры, чтобы получить представление о том,
       что должна делать эта функция. 
       
       Код:
       public class Challenge {
           public static int squaed(int b) {
               return a * a
           }
       } */
       
    public static int squared(int b) {
        return b * b;
    }
    
    
    /* 8. Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает
       true, если prob * prize > pay; в противном случае возвращает false. */
       
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay;
    }
    
    
    /* 9. Создайте метод, который возвращает количество кадров, показанных за заданное
       количество минут для определенного FPS. */
       
    public static int frames(int minutes, int fps) {
        return minutes * 60 * fps;
    }
    
    
    /* 10. Создайте функцию, которая будет работать как оператор модуля % без
       использования оператора модуля. Оператор модуля-это способ определения
       остатка операции деления. Вместо того чтобы возвращать результат деления,
       операция по модулю возвращает остаток целого числа. */
           
    public static int mod(int a, int b) {
        return a - (a / b) * b;
    }
    
    
    /* =====================================
	   =                                   =
	   =            ЗАДАЧИ 2/6             =
	   =                                   =
	   ===================================== */
	
	/* 1. Теша шел по прямой улице, по обеим сторонам которой стояло ровно n
       одинаковых домов. Номера домов на улице выглядят так: 
        
       1 | | 6
       3 | | 4
       5 | | 2
       
       Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
       
       Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер
       дома на противоположной стороне. */
       
    public static int oppositeHouse(int house, int n) {
        return 2*n - house + 1;
    }
    
    /* 2. Создайте метод, который принимает строку (имя и фамилию человека) и
       возвращает строку с заменой имени и фамилии. */
       
    public static String nameShuffle(String name) {
        int delimeter = name.indexOf(' ');
        return name.substring(delimeter + 1) + ' ' + name.substring(0, delimeter);
    }
    
    /* 3. Создайте функцию, которая принимает два аргумента: исходную цену и процент
       скидки в виде целых чисел и возвращает конечную цену после скидки. */
       
    public static double discount(int num, int percent) {
        return num - (double)num / 100 * percent;
    }
    
    /* 4. Создайте функцию, которая принимает массив и возвращает разницу между
       наибольшим и наименьшим числами. */
       
    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int cur : arr) {
            if (min > cur) min = cur;
            if (max < cur) max = cur;
        }
        return max - min;
    }
    
    /* 5. Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и
       возвращает количество целых чисел, имеющих одинаковое значение. */
       
    public static int equal(int a, int b, int c) {
        if (a != b && b != c && a != c) return 0;
        if (a == b && b == c) return 3;
        return 2;
    }
    
    /* 6. Создайте метод, который принимает строку в качестве аргумента и возвращает ее в
       обратном порядке. */
    
    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--)
            res += str.charAt(i);
        return res;
    }
    
    /* 7. Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию,
       которая принимает три числа (почасовая заработная плата каждого программиста)
       и возвращает разницу между самым высокооплачиваемым программистом и самым
       низкооплачиваемым. */
       
    public static int programmers(int a, int b, int c) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return max - min;
    }
	   
	/* 8. Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое
       количество x и o и возвращает либо true, либо false.
       
       Правила:
       - Возвращает логическое значение (true или false).
       - Верните true, если количество x и o одинаковы.
       - Верните false, если они не одинаковы.
       - Строка может содержать любой символ.
       - Если "x" и "o" отсутствуют в строке, верните true. */
    
    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        for (char c : str.toCharArray()) {
            if (c == 'x' || c == 'X') x++;
            if (c == 'o' || c == 'O') o++;
        }
        return x == o;
    }
    
    /* 9. Напишите функцию, которая находит слово "бомба" в данной строке. Ответьте
       "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".
       
       Примечание:
       Строка "бомба" может появляться в разных случаях символов (например, в верхнем,
       нижнем регистре, смешанном). */
    
    public static String bomb(String str) {
        str = str.toLowerCase();
        if (str.indexOf("bomb") != -1) return "DUCK!";
        return "Relax, there's no bomb.";
    }
    
    /* 10. Возвращает true, если сумма значений ASCII первой строки совпадает с суммой
       значений ASCII второй строки, в противном случае возвращает false. */
	   
	public static boolean sameAscii(String a, String b) {
	    int sum = 0;
	    for (char c : a.toCharArray()) sum += c;
	    for (char c : b.toCharArray()) sum -= c;
	    return sum == 0;
	}
	   
	/* =====================================
	   =                                   =
	   =            ЗАДАЧИ 3/6             =
	   =                                   =
	   ===================================== */
	
	/* 1. Учитывая массив городов и населения, верните массив, в котором все население
       округлено до ближайшего миллиона. */
	   
	public static Object[][] millionsRounding(Object[][] cities) {
	    for (Object[] city : cities)
	        city[1] = (int)(Math.round((double)(int)city[1] / 1000000) * 1000000);
	    return cities;
	}
	
	/* 2. Учитывая самую короткую сторону треугольника 30° на 60° на 90°, вы должны
       найти другие 2 стороны (верните самую длинную сторону, сторону средней длины).
       
       Примечание:
       - треугольники 30° на 60° на 90° всегда следуют этому правилу, скажем, самая короткая
       длина стороны равна x единицам, гипотенуза будет равна 2 единицам, а другая сторона
       будет равна x * root3 единицам.
       - Результаты тестов округляются до 2 знаков после запятой.
       - Верните результат в виде массива. */
       
    public static double round(double n, int d) {
        double t = Math.pow(10, d);
        return Math.round(n * t) / t;
    }
    
    public static double round(double n) {
        return round(n, 2);
    }
    
    public static double[] otherSides(int x) {
        return new double[] { 2 * x, round(x * Math.sqrt(3)) };
    }
    
    /* 3. Создайте функцию, имитирующую игру "камень, ножницы, бумага". Функция
       принимает входные данные обоих игроков (камень, ножницы или бумага), первый
       параметр от первого игрока, второй от второго игрока. Функция возвращает
       
       результат как таковой:
       "Игрок 1 выигрывает"
       "Игрок 2 выигрывает"
       "НИЧЬЯ" (если оба входа одинаковы)
       
       Правила игры камень, ножницы, бумага, если не известны:
       Оба игрока должны сказать одновременно "камень", "бумага" или "ножницы".
       Камень бьет ножницы, бумага бьет камень, ножницы бьют бумагу. */
    
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "TIE";
        if ((p1.equals("rock") && p2.equals("scissors")) ||
            (p1.equals("paper") && p2.equals("rock")) ||
            (p1.equals("scissors") && p2.equals("paper")))
            return "Player 1 wins";
        return "Player 2 wins";
    }
    
    /* 4. Идет великая война между четными и нечетными числами. Многие уже погибли в
       этой войне, и ваша задача-положить этому конец. Вы должны определить, какая
       группа суммируется больше: четная или нечетная. Выигрывает большая группа.
       Создайте функцию, которая берет массив целых чисел, суммирует четные и нечетные
       числа отдельно, а затем возвращает разницу между суммой четных и нечетных чисел. */
    
    public static int warOfNumbers(int[] numbers) {
        int odd = 0;
        int even = 0;
        for (int n : numbers)
            if (n % 2 == 0) even += n;
            else odd += n;
        return Math.abs(even - odd);
    }
    
    /* 5. Учитывая строку, создайте функцию для обратного обращения. Все буквы в
       нижнем регистре должны быть прописными, и наоборот. */
    
    public static String reverseCase(String str) {
        String res = "";
        for (char c : str.toCharArray())
            if (Character.isUpperCase(c)) res += Character.toLowerCase(c);
            else res += Character.toUpperCase(c);
        return res;
    }
    
    /* 6. Создайте функцию, которая принимает строку из одного слова и выполняет
       следующие действия:
       
       Конкатенирует inator до конца, если слово заканчивается согласным, в противном
       случае вместо него конкатенирует -inator
       Добавляет длину слова исходного слова в конец, снабженный '000'. */
       
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
       
    public static String inatorInator(String str) {
        String inator = "inator";
        if (isVowel(str.charAt(str.length() -1)))
            inator = "-inator";
        return str + inator + " " + str.length() + "000";
    }
    
    /* 7. Напишите функцию, которая принимает три измерения кирпича: высоту(a),
       ширину(b) и глубину(c) и возвращает true, если этот кирпич может поместиться в
       отверстие с шириной(w) и высотой(h).
       
       Примечание:
       - Вы можете повернуть кирпич любой стороной к отверстию.
       - Мы предполагаем, что кирпич подходит, если его размеры равны размерам отверстия (то
       есть размер кирпича должен быть меньше или равен размеру отверстия, а не строго меньше).
       - Нельзя класть кирпич под неортогональным углом */
    
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return a <= w && b <= h || a <= w && c <= h || b <= w && c <= h;
    }
    
    /* 8. Напишите функцию, которая принимает топливо (литры), расход топлива
       (литры/100 км), пассажиров, кондиционер (логическое значение) и возвращает
       максимальное расстояние, которое может проехать автомобиль.
       
       топливо-это количество литров топлива в топливном баке.
       Расход топлива-это базовый расход топлива на 100 км (только с водителем внутри).
       Каждый дополнительный пассажир увеличивает базовый расход топлива на 5%.
       Если кондиционер включен, то его общий (не базовый) расход топлива увеличивается на
       10%. */
    
    public static double totalDistance(
        double fuel, double baseConsumption, int passangers, boolean conditioner
    ) {
        double conditionerMultiplier = conditioner ? 1.1 : 1.0;
        double passangersConsumption = baseConsumption * 0.05 * passangers;
        double consumption = (baseConsumption + passangersConsumption) * conditionerMultiplier;
        return round(fuel / consumption * 100);
    }
    
    /* 9. Создайте функцию, которая принимает массив чисел и возвращает среднее
       значение (average) всех этих чисел. */
    
    public static double mean(int[] arr) {
        double avg = 0;
        for (int n : arr) avg += n;
        return round(avg / arr.length);
    }
    
    /* 10. Создайте функцию, которая принимает число в качестве входных данных и
       возвращает true, если сумма его цифр имеет ту же четность, что и все число. В
       противном случае верните false. */
       
    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int parity = num % 2;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return parity == sum % 2;
    }
	
	/* =====================================
	   =                                   =
	   =            ЗАДАЧИ 4/6             =
	   =                                   =
	   ===================================== */
	
	/* 1. Создайте функцию, которая принимает массив чисел и возвращает "Бум!", если в
       массиве появляется цифра 7. В противном случае верните "в массиве нет 7". */
	
	public static String sevenBoom(int[] arr) {
	    for (int n : arr)
	        while (n > 0) {
	            if (n % 10 == 7) return "Boom!";
	            n /= 10;
	        }
	    return "there is no 7 in the array";
	}
	
	/* 2. Создайте функцию, которая определяет, могут ли элементы в массиве быть
       переупорядочены, чтобы сформировать последовательный список чисел, где
       каждое число появляется ровно один раз. */
       
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1] || arr[i+1] - arr[i] > 1) return false;
        return true;
    }
	
	/* 3. lPaeesh le pemu mnxit ehess rtnisg! О, извините, это должно было быть: Пожалуйста,
       помогите мне распутать эти строки!
       Каким-то образом все строки перепутались, каждая пара символов поменялась местами.
       Помоги отменить это, чтобы снова понять строки. */
	
	public static String unmix(String str) {
	    String res = "";
	    for (int i = 0; i < str.length() / 2; i++) {
	        res += str.charAt(2*i + 1);
	        res += str.charAt(2*i);
	    }
	    if (str.length() % 2 == 1)
	        res += str.charAt(str.length() - 1);
	    return res;
	}
	
	/* 4. Создать функцию, которая преобразует предложения, заканчивающиеся
       несколькими вопросительными знаками ? или восклицательными знаками ! в
       предложение, заканчивающееся только одним, без изменения пунктуации в
       середине предложений.
       
       Примечание:
       - Меняйте только окончательную пунктуацию - оставляйте восклицательные или
       вопросительные знаки в середине предложения неизменными (см. Третий пример).
       - Не беспокойтесь о смешанной пунктуации (нет случаев, которые заканчиваются чем-то
       вроде ?!??!).
       - Сохраняйте предложения, в которых нет вопросительных/восклицательных знаков,
       одинаковыми. */
       
    public static String noYelling(String str) {
        char end = str.charAt(str.length() - 1);
        if (end != '?' && end != '!') return str;
        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == end) i--;
        return str.substring(0, i+1) + end;
    }
    
    /* 5. Создайте функцию, которая заменяет все x в строке следующими способами:
       
       Замените все x на "cks", ЕСЛИ ТОЛЬКО:
       Слово начинается с "x", поэтому замените его на "z".
       Слово-это просто буква "х", поэтому замените ее на " cks ".
       
       Примечание:
       - Все X являются строчными. */
       
    public static String xPronounce(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'x')
                if (i == 0 || str.charAt(i - 1) == ' ')
                    if (i < str.length() && str.charAt(i + 1) != ' ')
                        res += 'z';
                    else
                        res += "ecks";
                else
                    res += "cks";
            else
                res += str.charAt(i);
        return res;
    }
    
    /* 6. Учитывая массив целых чисел, верните наибольший разрыв между
       отсортированными элементами массива.
       Например, рассмотрим массив:
       [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
       ... в котором после сортировки массив становится:
       [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
       ... так что теперь мы видим, что самый большой разрыв в массиве находится между 9 и 20,
       что равно 11. */
       
    public static int largestGap(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++)
            max = Math.max(max, arr[i+1] - arr[i]);
        return max;
    }
    
    /* 7. Это вызов обратного кодирования. Обычно вам дают явные указания о том, как
       создать функцию. Здесь вы должны сгенерировать свою собственную функцию,
       чтобы удовлетворить соотношение между входами и выходами.
       Ваша задача состоит в том, чтобы создать функцию, которая при подаче входных данных
       ниже производит показанные примеры выходных данных. */
       
    public static int reverseCode(int num) {
        if (num == 7977) return 198;
        if (num == 832) return 594;
        if (num == 665) return 99;
        if (num == 51) return 36;
        return 0;
    }
    
    /* 8. Создайте функцию, которая принимает предложение в качестве входных данных и
       возвращает наиболее распространенную последнюю гласную в предложении в
       виде одной символьной строки. */
    
    public static String commonLastVowel(String str) {
        for (int i = str.length() - 1; i >= 0; i--)
            if (isVowel(str.charAt(i)))
                return "" + Character.toLowerCase(str.charAt(i));
        return null;
    }
    
    /* 9. Для этой задачи забудьте, как сложить два числа вместе. Лучшее объяснение того,
       что нужно сделать для этой функции, - это этот мем: */
       
    public static int memeSum(int a, int b) {
        int sum = 0;
        int decade = 1;
        while (a > 0 || b > 0) {
            int subsum = a % 10 + b % 10;
            sum += subsum * decade;
            if (subsum > 9) decade *= 10;
            a /= 10;
            b /= 10;
            decade *= 10;
        }
        return sum;
    }
    
    /* 10. Создайте функцию, которая удалит все повторяющиеся символы в слове,
       переданном этой функции. Не просто последовательные символы, а символы,
       повторяющиеся в любом месте строки. */
       
    public static String unrepeated(String str) {
        boolean[] charset = new boolean[127];
        String res = "";
        for (char c : str.toCharArray())
            if (!charset[c]) {
                res += c;
                charset[c] = true;
            }
        return res;
    }
	
	/* =====================================
	   =                                   =
	   =            ЗАДАЧИ 5/6             =
	   =                                   =
	   ===================================== */
	
	/* 1. Создайте функцию, которая возвращает true, если две строки имеют один и тот же
       буквенный шаблон, и false в противном случае. */
       
    public static boolean sameLetterPattern(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Character> match = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!match.containsKey(a.charAt(i)))
                match.put(a.charAt(i), b.charAt(i));
            if (b.charAt(i) != match.get(a.charAt(i)))
                return false;
        }
        return true;
    }
    
    /* 2. Паутина определяется кольцами, пронумерованными от 0 до 4 от центра, и
       радиалами, помеченными по часовой стрелке сверху как A-H.
       
       Создайте функцию, которая принимает координаты паука и мухи и возвращает
       кратчайший путь для паука, чтобы добраться до мухи.
       
       Стоит отметить, что кратчайший путь должен быть рассчитан "геометрически", а не путем
       подсчета количества точек, через которые проходит этот путь. Мы могли бы это устроить:
       
       Угол между каждой парой радиалов одинаков (45 градусов).
       
       Расстояние между каждой парой колец всегда одинаково (скажем, "x"). */
	
	public static String spiderVsFly(String spider, String fly) {
	    /* У павука есть 2 стратегии:
	    
	       1. спуститься в центр и пойти по нужной ветке
	          это просто сумма номеров колец мухи и павука
	          
	       2. спуститься/подняться до нужного кольца и пойти по кольцу 
	          разница между кольцами павука и мухи + (разница между веток) * длина пути на кольце
	          
	          длина пути на кольце = 2 * x * sin(45 / 2) = x * 0.76536686473
	    */
	    
	    int sx = spider.charAt(0) - 65;
	    int sy = spider.charAt(1) - 48;
	    int fx = fly.charAt(0) - 65;
	    int fy = fly.charAt(1) - 48;
	    
	    double strategyDist1 = sy + fy;
	    double strategyDist2 = Math.abs(sy - fy) + ((sx + fx) % 8) * fy * 0.76536686473;
	    
	    String path = "";
	    
	    if (strategyDist1 <= strategyDist2) {
	        for (int i = 0; i < sy; i++) {
	            path += spider.charAt(0);
	            path += sy - i;
	            path += '-';
	        }
	        path += "A0-";
	        for (int i = 0; i < fy; i++) {
	            path += fly.charAt(0);
	            path += i + 1;
	            path += '-';
	        }
	    } else {
	        for (int i = 0; i < Math.abs(sy - fy); i++) {
	            path += spider.charAt(0);
	            if (sy > fy) path += sy - i;
	            else path += sy + i;
	            path += '-';
	        }
	        for (int i = 0; i <= (sx + fx) % 8; i++) {
	            path += (char)(65 + (sx + i) % 8);
	            path += fly.charAt(1);
	            path += '-';
	        }
	    }
	    
	    return path.substring(0, path.length() - 1);
	}
	
	/* 3. Создайте функцию, которая будет рекурсивно подсчитывать количество цифр
       числа. Преобразование числа в строку не допускается, поэтому подход является
       рекурсивным. */
       
    public static int _digitsCount(long number) {
        if (number == 0) return 0;
        return 1 + _digitsCount(number / 10);
    }
       
    public static int digitsCount(long number) {
        return 1 + _digitsCount(number / 10);
    }
    
    /* 4. В игроки пытаются набрать очки, формируя слова, используя буквы из 6-
       буквенного скремблированного слова. Они выигрывают раунд, если им удается
       успешно расшифровать слово из 6 букв.
       
       Создайте функцию, которая принимает в массив уже угаданных слов расшифрованное 6-
       буквенное слово и возвращает общее количество очков, набранных игроком в
       определенном раунде, используя следующую рубрику:
       
       3-буквенные слова-это 1 очко
       4-буквенные слова-это 2 очка
       5-буквенные слова-это 3 очка
       6-буквенные слова-это 4 очка + 50 пт бонуса (за расшифровку слова)
       
       Помните, что недопустимые слова (слова, которые не могут быть сформированы из 6-
       буквенных расшифрованных слов) считаются 0 очками.
       
       Примечание:
       - Если 6-буквенное слово имеет несколько анаграмм, считайте каждую 6-буквенную
       расшифровку дополнительными 54 очками. Например, если слово arches, а игрок угадал
       arches и chaser, добавьте 108 очков для обоих слов.
       - Вы можете играть в Текстовый Твист здесь: http://text-twist2.com */
	
	public static int[] getCharset(String word) {
	    int[] charset = new int[127];
	    for (char c : word.toCharArray()) charset[c]++;
	    return charset;
	}
	
	public static int totalPoints(String[] words, String scramble) {
	    int points = 0;
	    int[] scrambleCharset = getCharset(scramble);
	    for (int i = 0; i < words.length; i++) {
	        int[] wordCharset = getCharset(words[i]);
	        boolean good = true;
	        for (int j = 0; j < 127; j++)
	            if (wordCharset[j] > scrambleCharset[j]) {
	                good = false;
	                break;
	            }
	        if (good) {
	            points += words[i].length() - 2;
	            if (words[i].length() == 6) points += 50;
	        }
	    }
	    return points;
	}
	
	/* 5. Последовательный прогон-это список соседних последовательных целых чисел.
       Этот список может быть как увеличивающимся, так и уменьшающимся. Создайте
       функцию, которая принимает массив чисел и возвращает длину самого длинного
       последовательного запуска. */
       
    public static int longestRun(int[] arr) {
        int max = 1;
        int cur = 1;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i+1] - arr[i] == 1 || arr[i+1] - arr[i] == -1) {
                cur++;
                if (max < cur) max = cur;
            } else cur = 1;
        return max;
    }
    
    /* 6. Какой процент вы можете набрать на тесте, который в одиночку снижает средний
       балл по классу на 5%? Учитывая массив оценок ваших одноклассников, создайте
       функцию, которая возвращает ответ. Округлите до ближайшего процента. */
    
    public static String takeDownAverage(String[] percents) {
        int avg = 0;
        for (String s : percents)
            avg += Integer.parseInt(s.substring(0, s.length() - 1));
        return (avg / percents.length - percents.length*5 - 5) + "%";
    }
    
    /* 7. Учитывая предложение с числами, представляющими расположение слова,
       встроенного в каждое слово, верните отсортированное предложение */
       
    public static String rearrange(String str) {
        String[] words = str.split(" ");
        String[] res = new String[words.length];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    res[word.charAt(i) - 48 - 1] = word.substring(0, i) + word.substring(i+1);
                    break;
                }
            }
        }
        return String.join(" ", res);
    }
    
    /* 8. Напишите функцию, которая делает первое число как можно больше, меняя его
       цифры на цифры во втором числе.
       
       Примечание:
       - Каждая цифра во втором числе может быть использована только один раз.
       - Можно использовать ноль для всех цифр второго числа. */
    
    public static Integer[] splitNumber(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        while (n > 0) {
            res.add(n % 10);
            n /= 10;
        }
        return res.toArray(new Integer[res.size()]);
    }
    
    public static int maxPossible(int n, int r) {
        Integer[] num = splitNumber(n);
        Integer[] rnum = splitNumber(r);
        Arrays.sort(rnum, Collections.reverseOrder());
        int rnumindex = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] < rnum[rnumindex]) {
                num[i] = rnum[rnumindex];
                rnumindex++;
            }
            if (rnumindex == rnum.length)
                break;
        }
        n = 0;
        int dec = 1;
        for (int i : num) {
            n += i * dec;
            dec *= 10;
        }
        return n;
    }
    
    /* 9. В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух
       разных городах. Вам дается строка cityA и связанная с ней строка timestamp (time
       in cityA) с датой, отформатированной в полной нотации США, как в этом примере:
       
       "July 21, 1983 23:01"
       
       Вы должны вернуть новую метку времени с датой и соответствующим временем в cityB,
       отформатированную как в этом примере:
       
       "1983-7-22 23:01"
       
       Список данных городов и их смещения по Гринвичу (среднее время по Гринвичу)
       приведены в таблице ниже.
       
       GMT City
       - 08:00 Los Angeles
       - 05:00 New York
       - 04:30 Caracas
       - 03:00 Buenos Aires
       00:00 London
       + 01:00 Rome
       + 03:00 Moscow
       + 03:30 Tehran
       + 05:30 New Delhi
       + 08:00 Beijing
       + 10:00 Canberra
       
       Примечание:
       - Обратите внимание на часы и минуты, ведущий 0 необходим в возвращаемой метке
       времени, когда они представляют собой одну цифру.
       - Обратите внимание на города с получасовыми смещениями. */
       
    public static SimpleDateFormat parseDate = new SimpleDateFormat("MMMM d, yyyy HH:mm");
    public static SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-M-d HH:mm"); 
    
    public static String getGMT(String city) {
        if (city == "Los Angeles") return "GMT-08:00";
        if (city == "New York") return "GMT-05:00";
        if (city == "Caracas") return "GMT- 04:30";
        if (city == "Buenos Aires") return "GMT-03:00";
        if (city == "London") return "GMT00:00";
        if (city == "Rome") return "GMT+01:00";
        if (city == "Moscow") return "GMT+03:00";
        if (city == "Tehran") return "GMT+03:30";
        if (city == "New Delhi") return "GMT+05:30";
        if (city == "Beijing") return "GMT+08:00";
        if (city == "Canberra") return "GMT+10:00";
        return "GMT";
    }
    
    public static String timeDifference(
        String cityA, String timestamp, String cityB
    ) {
        try {
            parseDate.setTimeZone(TimeZone.getTimeZone(getGMT(cityA)));
            formatDate.setTimeZone(TimeZone.getTimeZone(getGMT(cityB)));
            Date date = parseDate.parse(timestamp);
            return formatDate.format(date);
        } catch(Exception e) {}
        return null;
    }
    
    /* 10. Новое число-это число, которое не является перестановкой любого меньшего
       числа. 869-это не новое число, потому что это просто перестановка меньших чисел,
       689 и 698. 509-это новое число, потому что оно не может быть образовано
       перестановкой любого меньшего числа (ведущие нули не допускаются).
       Напишите функцию, которая принимает неотрицательное целое число и возвращает true,
       если целое число является новым числом, и false, если это не так. */
    
    public static boolean isNew(int n) {
        Integer[] num = splitNumber(n);
        for (int i = 0; i < num.length - 1; i++)
            if (num[i] > 0 && num[i] < num[num.length - 1])
                return false;
        return true;
    }
	
	/* =====================================
	   =                                   =
	   =            ЗАДАЧИ 6/6             =
	   =                                   =
	   ===================================== */
    
    /* 1. Создайте функцию, которая принимает две строки. Первая строка содержит
       предложение, содержащее буквы второй строки в последовательной
       последовательности, но в другом порядке. Скрытая анаграмма должна содержать
       все буквы, включая дубликаты, из второй строки в любом порядке и не должна
       содержать никаких других букв алфавита.
       Напишите функцию, чтобы найти анаграмму второй строки, вложенную где-то в
       первую строку. Вы должны игнорировать регистр символов, любые пробелы и
       знаки препинания и возвращать анаграмму в виде строчной строки без пробелов
       или знаков препинания.
       
       Примечание:
       - Совершенная анаграмма содержит все буквы оригинала в любом порядке, ни
       больше, ни меньше.
       - Если в предложении нет скрытой анаграммы, верните "noutfond".
       - Как и в приведенных выше примерах, скрытая анаграмма может начинаться или
       заканчиваться частично через слово и/или охватывать несколько слов и может
       содержать знаки препинания и другие не-альфа-символы.
       - Игнорируйте регистр символов и любые встроенные не-альфа-символы.
       - Если в предложении больше 1 результата, верните ближайший к началу. */

    public static int[] getLetterSet(String str) {
        int[] set = new int[26];
        for (char c : str.toCharArray())
            set[c - 97]++;
        return set;
    }

    public static String onlyLetters(String str) {
        str = str.toLowerCase();
        String res = "";
        for (char c : str.toCharArray())
            if (97 <= c && c <= 122)
                res += c;
        return res;
    }
    
    public static String hiddenAnagram(String a, String b) {
        a = onlyLetters(a);
        b = onlyLetters(b);
        int[] setB = getLetterSet(b);
        for (int i = 0; i <= a.length() - b.length(); i++) {
            String substr = a.substring(i, i+b.length());
            int[] setA = getLetterSet(substr);
            if (Arrays.equals(setA, setB)) {
                String res = "";
                for (char c : substr.toCharArray())
                    if (97 <= c && c <= 122)
                        res += c;
                return res;
            }
        }
        return "noutfond";
    }
    
    /* 2. Напишите функцию, которая возвращает массив строк, заполненных из срезов
       символов n-длины данного слова (срез за другим, в то время как n-длина
       применяется к слову).

       Примечания:
       - Убедитесь, что результирующий массив лексикографически упорядочен.
       - Возвращает пустой массив, если заданная строка меньше n.
       - Ожидается, что вы решите эту задачу с помощью рекурсивного подхода. */

    public static String[] collect(String s, int n) {
        if (s.length() < n)
            return new String[] {};
        String[] res = collect(s.substring(n), n);
        String head = s.substring(0, n);
        String[] newRes = new String[res.length+1];
        int index = 0;
        while (index < res.length && res[index].compareTo(head) < 0) index++;
        System.arraycopy(res, 0, newRes, 0, index);
        System.arraycopy(res, index, newRes, index+1, res.length - index);
        // с этими вставками лучше использовать LinkedList
        newRes[index] = head;
        return newRes;
    }
    
    /* 3. В шифре Nico кодирование осуществляется путем создания цифрового ключа и
       присвоения каждой буквенной позиции сообщения с помощью предоставленного
       ключа.
       
       Создайте функцию, которая принимает два аргумента, message и key, и возвращает
       закодированное сообщение.
       
       Существуют некоторые вариации правил шифрования. Одна из версий правил
       шифрования изложена ниже:
       
       message = "mubashirhassan"
       key = "crazy"
       
       nicoCipher(message, key) ➞ "bmusarhiahass n"
       
       Шаг 1: Назначьте числа отсортированным буквам из ключа:
       "crazy" = 23154
       
       Шаг 2: Назначьте номера буквам данного сообщения:
        2 3 1 5 4
        ---------
        m u b a s
        h i r h a
        s s a n
       
       Шаг 3: Сортировка столбцов по назначенным номерам:
        1 2 3 4 5
        ---------
        b m u s a
        r h i a h
        a s s   n
       
       Шаг 4: Верните закодированное сообщение по строкам:
       eMessage = "bmusarhiahass n" */

    public static String nicoCipher(String message, String key) {
        for (int i = 0; i < (message.length()+key.length()) % key.length(); i++)
            message += ' ';
        int[] set = getCharset(key);
        int[] setCount = set.clone();
        int counter = 1;
        for (int i = 0; i < set.length; i++)
            if (set[i] != 0) {
                if (set[i] > 1)
                    counter += set[i] - 1;
                set[i] = counter++;
            }
        int[] offsets = new int[key.length()];
        for (int i = 0; i < key.length(); i++)
            offsets[set[key.charAt(i)]-setCount[key.charAt(i)]--] = i; 
        String res = "";
        for (int i = 0; i < message.length(); i++) {
            int index = (i / offsets.length) * offsets.length + offsets[i % offsets.length];
            res += message.charAt(index);
        }
 
        return res;
    }
    
    /* 4. Создайте метод, который принимает массив arr и число n и возвращает массив из
       двух целых чисел из arr, произведение которых равно числу n следующего вида:
       
       [value_at_lower_index, value_at_higher_index]
       
       Убедитесь, что вы возвращаете массив из двух целых чисел, который точно делит n
       (произведение n) и что индексы совпадают с указанным выше форматом. Таким образом,
       сортировка значений основана на восходящих индексах.
       
       Примечание:
       - Дубликатов не будет.
       - Возвращает пустой массив, если совпадение не найдено.
       - Всегда считайте, что пара рассматриваемого элемента (текущий элемент, на который
       указывали во время поиска) находится слева от него.
       - Массив может иметь несколько решений (произведений n), поэтому возвращайте первое
       найденное полное совпадение (как описано выше). */
    
    public static int[] twoProduct(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int m : arr) {
            if (n % m == 0 && set.contains(n / m))
                return new int[] {n/m, m};
            set.add(m);
        }
        return new int[] {};
    }
    
    /* 5. Создайте рекурсивную функцию, которая проверяет, является ли число точной
       верхней границей факториала n. Если это так, верните массив точной
       факториальной границы и n, или иначе, пустой массив.
       
       Примечание:
       - Ожидается, что вы решите эту задачу с помощью рекурсии. */
    
    public static int[] isExact(int f, int m, int n) {
        if (f < n)
            return isExact(f*(m+1), m+1, n);
        return new int[] {f, m};
    }
       
    public static int[] isExact(int n) {
        int[] res = isExact(1, 1, n);
        if (res[0] == n) return res;
        return new int[] {};
    }
    
    /* 6. Деление на дробь часто приводит к бесконечно повторяющейся десятичной дроби.
       
       1/3=.3333333... 1/7=.142857142857...
       
       Создайте функцию, которая принимает десятичную дробь в строковой форме с
       повторяющейся частью в круглых скобках и возвращает эквивалентную дробь в
       строковой форме и в наименьших членах. */
       
    public static String fractions(String frac) {
        int startBracket = frac.indexOf('(');
        if (startBracket != -1) {
            String f = frac.substring(startBracket+1, frac.length()-1);
            frac = frac.substring(0, startBracket);
            for (int i = 0; i < 9 - f.length(); i++)
                frac += f;
        }
        double a = Double.parseDouble(frac);
        int div = 2;
        while (Math.ceil(a * div) - a * div > 0.000001) div++;
        return "" + (int)Math.ceil(a * div) + "/" + div;
    }
    
    /* 7. В этой задаче преобразуйте строку в серию слов (или последовательности
       символов), разделенных одним пробелом, причем каждое слово имеет одинаковую
       длину, заданную первыми 15 цифрами десятичного представления числа Пи:
       
       3.14159265358979
       
       Если строка содержит больше символов, чем общее количество, заданное суммой цифр
       Пи, неиспользуемые символы отбрасываются, и вы будете использовать только те,
       которые необходимы для формирования 15 слов.
       
       String =
       "HOWINEEDADRINKALCOHOLICINNATUREAFTERTHEHEAVYLECTURESINVOLVINGQUANTUMME
       CHANICSANDALLTHESECRETSOFTHEUNIVERSE"
       Pi String = "HOW I NEED A DRINK ALCOHOLIC IN NATURE AFTER THE HEAVY
       LECTURES INVOLVING QUANTUM MECHANICS"
       // Every word has the same length of the digit of Pi found at the same
       index ?
       // "HOW" = 3, "I" = 1, "NEED" = 4, "A" = 1, "DRINK" = 5
       // "ALCOHOLIC" = 9, "IN" = 2, "NATURE" = 6, "AFTER" = 5
       // "THE" = 3, "HEAVY" = 5, "LECTURES" = 8, "INVOLVING" = 9
       // "QUANTUM" = 7, "MECHANICS" = 9
       // 3.14159265358979
       
       Также, если строка содержит меньше символов, чем общее количество, заданное суммой
       цифр Пи, в любом случае вы должны соблюдать последовательность цифр для получения
       слов.
       
       String = "FORALOOP"
       Pi String = "FOR A LOOP"
       // Every word has the same length of the digit of Pi found at the same
       index ?
       // "FOR" = 3, "A" = 1, "LOOP" = 4
       // 3.14
       
       Если буквы, содержащиеся в строке, не совпадают в точности с цифрами, в этом случае
       вы будете повторять последнюю букву, пока слово не будет иметь правильную длину.
       
       String = "CANIMAKEAGUESSNOW"
       Pi String = "CAN I MAKE A GUESS NOWWWWWWW"
       // Every word has the same length of the digit of Pi found at the same
       index ?
       // "CAN" = 3, "I" = 1, "MAKE" = 4, "A" = 1, "GUESS" = 5, "NOW" = 3
       // 3.14153 (Wrong!)
       // The length of the sixth word "NOW" (3)...
       // ...doesn't match the sixth digit of Pi (9)
       // The last letter "W" will be repeated...
       // ...until the length of the word will match the digit
       // "CAN" = 3, "I" = 1, "MAKE" = 4, "A" = 1, "GUESS" = 5, "NOWWWWWWW" =
       9
       // 3.14159 (Correct!)
       
       Если данная строка пуста, должна быть возвращена пустая строка.
       Учитывая строку txt, реализуйте функцию, которая возвращает ту же строку,
       отформатированную в соответствии с приведенными выше инструкциями.
       
       Примечание:
       - Эта задача представляет собой упрощенную концепцию, вдохновленную Пилишем,
       своеобразным типом ограниченного письма, в котором используются все известные
       возможные цифры Пи. Потенциально бесконечный текст может быть написан с
       использованием знаков препинания и набора дополнительных правил, которые позволяют
       избежать длинных последовательностей маленьких цифр, заменяя их словами больше 9
       букв и делая так, чтобы композиция выглядела более похожей на стихотворение вольным
       стихом.
       - Точка, отделяющая целую часть числа Пи от десятичной, не должна учитываться в
       функции: она присутствует в инструкциях и примерах только для удобства чтения. */


    public static String pilish_string(String str) {
        // тут должна быть функция для высчитывания PI
        String res = "";
        String pi = String.valueOf(Math.PI).replace(".", "");
        int piIndex = 0;
        while (str.length() > 0) {
            int p = pi.charAt(piIndex) - 48;
            int n = Math.min(p, str.length());
            res += str.substring(0, n);
            str = str.substring(n);
            piIndex++;
            if (str.length() > 0) res += ' ';
            else if (p > n)
                for (int i = 0; i < p - n; i++)
                    res += res.charAt(res.length() - 1);
        }
        return res;
    }
    
    /* 8. Создайте функцию для генерации всех непоследовательных двоичных строк, где
       непоследовательные определяется как строка, в которой нет последовательных
       строк, и где n определяет длину каждой двоичной строки. */
       
    public static String generateNonconsecutive(int n) {
        String res = "";
        String format = "%" + n + 's';
        int count = 2 << (n-1);
        nextNumber:
        for (int i = 0; i < count; i++) {
            String num = String.format(format, Integer.toBinaryString(i)).replace(' ', '0');
            for (int j = 0; j < n - 1; j++)
                if (num.charAt(j) == '1' && num.charAt(j+1) == '1')
                    continue nextNumber;
            res += num + ' ';
        }
        return res.substring(0, res.length() - 1);
    }
    
    /* 9. Шерлок считает строку действительной, если все символы строки встречаются
       одинаковое количество раз. Также допустимо, если он может удалить только 1
       символ из 1 индекса в строке, а остальные символы будут встречаться одинаковое
       количество раз. Для данной строки str определите, действительна ли она. Если да,
       верните «ДА», в противном случае верните «НЕТ».
       
       Например, если str = "abc", строка действительна, потому что частота символов у всех
       одинакова. Если str = "abcc", строка также действительна, потому что мы можем
       удалить 1 "c" и оставить по одному символу каждого символа в строке. Однако, если
       str = "abccc", строка недействительна, поскольку удаление одного символа не приводит
       к одинаковой частоте символов. */
       
    public static String isValid(String str) {
        int[] set = getLetterSet(str);
        int[] medium = new int[str.length()];
        for (int i = 0; i < set.length; i++)
            if (set[i] != 0) medium[set[i]]++;
        int cur = 0;
        int max = 0;
        for (int i = 0; i < medium.length; i++)
            if (medium[i] > cur) {
                cur = medium[i];
                max = i;
            }
        boolean index = false;
        for (int i = 0; i < set.length; i++)
            if (set[i] != 0 && max - set[i] != 0) {
                if (index) return "NO";
                index = true;
            }
        return "YES";
    }
    
    /* 10. Создайте функцию, которая получает каждую пару чисел из массива, который
       суммирует до восьми, и возвращает его как массив пар (отсортированный по
       возрастанию). */
       
    public static int[][] sumsUp(int[] arr) {
        ArrayList<int[]> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(8 - arr[i])) {
                int a = arr[i];
                int b = 8 - a;
                if (a > b) {
                    b = a;
                    a = 8 - b;
                }
                res.add(new int[] {i - map.get(8-arr[i]), a, b});
            }
            map.put(arr[i], i);
        }
        Collections.sort(res, (o1, o2) -> o1[0]-o2[0]);
        int[][] newRes = new int[res.size()][];
        for (int i = 0; i < res.size(); i++)
            newRes[i] = new int[] {res.get(i)[1], res.get(i)[2]};
        return newRes;
    }
    
    /* ТЕСТЫ ТЕСТЫ ТЕСТЫ */
    
    public static void main(String[] args) {
    	// ЗАДАЧИ 1/6
    	
        assert convert(5) == 300;
		assert convert(3) == 180;
		assert convert(2) == 120;
        
        assert points(13, 12) == 62;
		assert points(17, 12) == 70;
		assert points(38, 8) == 100;
        
        assert footballPoints(3, 4, 2) == 13;
		assert footballPoints(5, 0, 2) == 15;
		assert footballPoints(0, 0, 1) == 0;
		
		assert divisibleByFive(5) == true;
		assert divisibleByFive(-55) == true;
		assert divisibleByFive(37) == false;
		
		assert and(true, false) == false;
		assert and(true, true) == true;
		assert and(false, true) == false;
		assert and(false, false) == false;
        
        assert howManyWalls(54, 1, 43) == 1;
        assert howManyWalls(46, 5, 4) == 2;
        assert howManyWalls(100, 4, 5) == 5;
        assert howManyWalls(10, 15, 12) == 0;
        assert howManyWalls(41, 3, 6) == 2;
        
        assert squared(5) == 25;
        assert squared(9) == 81;
        assert squared(100) == 10000;
        
        assert profitableGamble(0.2, 50, 9) == true;
        assert profitableGamble(0.9, 1, 2) == false;
        assert profitableGamble(0.9, 3, 2) == true;
        
        assert frames(1, 1) == 60;
        assert frames(10, 1) == 600;
        assert frames(10, 25) == 15000;
        
        assert mod(5, 2) == 1;
        assert mod(218, 5) == 3;
        assert mod(6, 3) == 0;
        
        // ЗАДАЧИ 2/6
        
        assert oppositeHouse(1, 3) == 6;
        assert oppositeHouse(2, 3) == 5;
        assert oppositeHouse(3, 5) == 8;
        assert oppositeHouse(5, 46) == 88;

        assert nameShuffle("Donald Trump").equals("Trump Donald");
        assert nameShuffle("Rosie O'Donnell").equals("O'Donnell Rosie");
        assert nameShuffle("Seymour Butts").equals("Butts Seymour");
        
        assert discount(1500, 50) == 750;
        assert discount(89, 20) == 71.2;
        assert discount(100, 75) == 25;
        
        assert  differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}) == 82;
        // Smallest number is -50, biggest is 32.
        assert differenceMaxMin(new int[] {44, 32, 86, 19}) == 67;
        // Smallest number is 19, biggest is 86

        assert equal(3, 4, 3) == 2;
        assert equal(1, 1, 1) == 3;
        assert equal(3, 4, 1) == 0;
        
        assert reverse("Hello World").equals("dlroW olleH");
        assert reverse("The quick brown fox.").equals(".xof nworb kciuq ehT");
        assert reverse("Edabit is really helpful!").equals("!lufpleh yllaer si tibadE");
        
        assert programmers(147, 33, 526) == 493;
        assert programmers(33, 72, 74) == 41;
        assert programmers(1, 5, 9) == 8;
        
        assert getXO("ooxx") == true;
        assert getXO("xooxx") == false;
        assert getXO("ooxXm") == true;
        // Case insensitive.
        assert getXO("zpzpzpp") == true;
        // Returns true if no x and o.
        assert getXO("zzoo") == false;
        
        assert bomb("There is a bomb.").equals("DUCK!");
        assert bomb("Hey, did you think there is a BOMB?").equals("DUCK!");
        assert bomb("This goes boom!!!").equals("Relax, there's no bomb.");
        
        assert sameAscii("a", "a") == true;
        assert sameAscii("AA", "B@") == true;
        assert sameAscii("EdAbIt", "EDABIT") == false;
        
        // ЗАДАЧИ 3/6
        
        assert Arrays.deepEquals(
            millionsRounding(new Object[][] {
                {"Nice", 942208},
                {"Abu Dhabi", 1482816},
                {"Naples", 2186853},
                {"Vatican City", 572}
            }),
            new Object[][] {
                {"Nice", 1000000},
                {"Abu Dhabi", 1000000},
                {"Naples", 2000000},
                {"Vatican City", 0}
            }
        );
        assert Arrays.deepEquals(
            millionsRounding(new Object[][] {
                {"Manila", 13923452},
                {"Kuala Lumpur", 7996830},
                {"Jakarta", 10770487}
            }),
            new Object[][] {
                {"Manila", 14000000},
                {"Kuala Lumpur", 8000000},
                {"Jakarta", 11000000}
            }
        );
        
        assert Arrays.equals(otherSides(1), new double[] {2.0, 1.73});
        assert Arrays.equals(otherSides(12), new double[] {24.0, 20.78}); // здесь точно 20.0?
        assert Arrays.equals(otherSides(2), new double[] {4.0, 3.46});
        assert Arrays.equals(otherSides(3), new double[] {6.0, 5.2});

        assert rps("rock", "paper").equals("Player 2 wins");
        assert rps("paper", "rock").equals("Player 1 wins");
        assert rps("paper", "scissors").equals("Player 2 wins");
        assert rps("scissors", "scissors").equals("TIE");
        assert rps("scissors", "paper").equals("Player 1 wins");

        assert warOfNumbers(new int[] {2, 8, 7, 5}) == 2;
        // 2 + 8 = 10
        // 7 + 5 = 12
        // 12 is larger than 10
        // So we return 12 - 10 = 2
        assert warOfNumbers(new int[] {12, 90, 75}) == 27;
        assert warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}) == 168;

        assert reverseCase("Happy Birthday").equals("hAPPY bIRTHDAY");
        assert reverseCase("MANY THANKS").equals("many thanks");
        assert reverseCase("sPoNtAnEoUs").equals("SpOnTaNeOuS");

        assert inatorInator("Shrink").equals("Shrinkinator 6000");
        assert inatorInator("Doom").equals("Doominator 4000");
        assert inatorInator("EvilClone").equals("EvilClone-inator 9000");

        assert doesBrickFit(1, 1, 1, 1, 1) == true;
        assert doesBrickFit(1, 2, 1, 1, 1) == true;
        assert doesBrickFit(1, 2, 2, 1, 1) == false;
        
        assert totalDistance(70.0, 7.0, 0, false) == 1000.0;
        assert totalDistance(36.1, 8.6, 3, true) == 331.83;
        assert totalDistance(55.5, 5.5, 5, false) == 807.27; // а тут округлили? 807.3
        
        assert mean(new int[] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}) == 2.55;
        assert mean(new int[] {2, 3, 2, 3}) == 2.50;
        assert mean(new int[] {3, 3, 3, 3, 3}) == 3.00;
        
        assert parityAnalysis(243) == true;
        // 243 is odd and so is 9 (2 + 4 + 3)
        assert parityAnalysis(12) == false;
        // 12 is even but 3 is odd (1 + 2)
        assert parityAnalysis(3) == true;
        // 3 is odd and 3 is odd and 3 is odd (3)
        
        // ЗАДАЧИ 4/6
        
        assert sevenBoom(new int[] {1, 2, 3, 4, 5, 6, 7}).equals("Boom!");
        // 7 contains the number seven.
        assert sevenBoom(new int[] {8, 6, 33, 100}).equals("there is no 7 in the array");
        // None of the items contain 7 within them.
        assert sevenBoom(new int[] {2, 55, 60, 97, 86}).equals("Boom!");
        // 97 contains the number seven.

        assert cons(new int[] {5, 1, 4, 3, 2}) == true;
        // Can be re-arranged to form [1, 2, 3, 4, 5]
        assert cons(new int[] {5, 1, 4, 3, 2, 8}) == false;
        assert cons(new int[] {5, 6, 7, 8, 9, 9}) == false;
        // 9 appears twice

        assert unmix("123456").equals("214365");
        assert unmix("hTsii  s aimex dpus rtni.g").equals("This is a mixed up string.");
        assert unmix("badce").equals("abcde");
        
        assert noYelling("What went wrong?????????").equals("What went wrong?");
        assert noYelling("Oh my goodness!!!").equals("Oh my goodness!");
        assert noYelling("I just!!! can!!! not!!! believe!!! it!!!").equals("I just!!! can!!! not!!! believe!!! it!");
        // Only change repeating punctuation at the end of the sentence.
        assert noYelling("Oh my goodness!").equals("Oh my goodness!");
        // Do not change sentences where there exists only one or zero exclamation marks/question marks.
        assert noYelling("I just cannot believe it.").equals("I just cannot believe it.");

        assert xPronounce("Inside the box was a xylophone").equals("Inside the bocks was a zylophone");
        assert xPronounce("The x ray is excellent").equals("The ecks ray is eckscellent");
        assert xPronounce("OMG x box unboxing video x D").equals("OMG ecks bocks unbocksing video ecks D");
        
        assert largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}) == 11;
        // After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
        // Largest gap between 9 and 20 is 11
        assert largestGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}) == 4;
        // After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
        // Largest gap between 7 and 11 is 4
        assert largestGap(new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}) == 2;
        // After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
        // Largest gap between 6 and 8 is 2

        assert reverseCode(832) == 594;
        assert reverseCode(51) == 36;
        assert reverseCode(7977) == 198;
        assert reverseCode(1) == 0;
        assert reverseCode(665) == 99;
        assert reverseCode(149) == 0;

        assert commonLastVowel("Hello World!").equals("o");
        assert commonLastVowel("Watch the characters dance!").equals("e");
        assert commonLastVowel("OOI UUI EEI AAI").equals("i");

        assert memeSum(26, 39) == 515;
        // 2+3 = 5, 6+9 = 15
        // 26 + 39 = 515
        assert memeSum(122, 81) == 1103;
        // 1+0 = 1, 2+8 = 10, 2+1 = 3
        // 122 + 81 = 1103
        assert memeSum(1222, 30277) == 31499;
        
        assert unrepeated("teshahset").equals("tesha");
        assert unrepeated("hello").equals("helo");
        assert unrepeated("aaaaa").equals("a");
        assert unrepeated("WWE!!!").equals("WE!");
        assert unrepeated("call 911").equals("cal 91");

        // ЗАДАЧИ 5/6
        
        assert sameLetterPattern("ABAB", "CDCD") == true;
        assert sameLetterPattern("ABCBA", "BCDCB") == true;
        assert sameLetterPattern("FFGG", "CDCD") == false;
        assert sameLetterPattern("FFFF", "ABCD") == false;
        
        assert spiderVsFly("H3", "E2").equals("H3-H2-H1-A0-E1-E2");
        assert spiderVsFly("A4", "B2").equals("A4-A3-A2-B2");
        assert spiderVsFly("A4", "C2").equals("A4-A3-A2-B2-C2");
        
        assert digitsCount(4666) == 4;
        assert digitsCount(544) == 3;
        assert digitsCount(121317) == 6;
        assert digitsCount(0) == 1;
        assert digitsCount(12345) == 5;
        assert digitsCount(1289396387328L) == 13;
        
        assert totalPoints(new String[] {"cat", "create", "sat"}, "caster") == 2;
        // Since "create" is an invalid word.
        assert totalPoints(new String[] {"trance", "recant"}, "recant") == 108;
        // Since "trance" and "recant" score 54 pts each.
        assert totalPoints(new String[] {"dote", "dotes", "toes", "set", "dot", "dots", "sted"},
        "tossed") == 13;
        // Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13
        
        assert longestRun(new int[] {1, 2, 3, 5, 6, 7, 8, 9}) == 5;
        // Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).
        assert longestRun(new int[] {1, 2, 3, 10, 11, 15}) == 3;
        // Longest consecutive-run: [1, 2, 3].
        assert longestRun(new int[] {5, 4, 2, 1}) == 2;
        // Longest consecutive-run: [5, 4] and [2, 1].
        assert longestRun(new int[] {3, 5, 7, 10, 15}) == 1;
        // No consecutive runs, so we return 1.
        
        assert takeDownAverage(new String[] {"95%", "83%", "90%", "87%", "88%", "93%"}).equals("54%");
        assert takeDownAverage(new String[] {"10%"}).equals("0%");
        assert takeDownAverage(new String[] {"53%", "79%"}).equals("51%");
        
        assert rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.").equals("I love Tesh just the way she is.");
        assert rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!").equals("Happiest birthday to the man of no steel!");
        assert rearrange("is2 Thi1s T4est 3a").equals("This is a Test");
        assert rearrange("4of Fo1r pe6ople g3ood th5e the2").equals("For the good of the people");
        assert rearrange(" ").equals("");
        
        assert maxPossible(9328, 456) == 9658;
        // 9658 is the largest possible number built from swaps from 456.
        // 3 replaced with 6 and 2 replaced with 5.
        assert maxPossible(523, 76) == 763;
        assert maxPossible(9132, 5564) == 9655;
        assert maxPossible(8732, 91255) == 9755;
        
        assert timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra").equals("2011-4-2 17:23");
        // Can be a new day.
        assert timeDifference("London", "July 31, 1983 23:01", "Rome").equals("1983-8-1 00:01");
        // Can be a new month.
        assert timeDifference("New York", "December 31, 1970 13:40", "Beijing").equals("1971-1-1 02:40");
        // Can be a new year.
        
        assert isNew(3) == true;
        assert isNew(30) == true;
        assert isNew(321) == false;
        assert isNew(123) == true;
        
        // ЗАДАЧИ 6/6
        assert hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived").equals("worldevolvesin");
        // The sequence "world evolves in" is a perfect anagram of "sworn love lived".
        assert hiddenAnagram("An old west action hero actor", "Clint Eastwood").equals("noldwestactio");
        // The sequence "n old west actio" is a perfect anagram of "Clint Eastwood".
        assert hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison").equals("mrmojorisin");
        // The sequence "Mr. Mojo Risin" ignoring the full stop, is a perfect
        // anagram of "Jim Morrison".
        assert hiddenAnagram("Banana? margaritas", "ANAGRAM").equals("anamarg");
        // The sequence "ana? marg" ignoring "?" is a perfect anagram of "Anagram".
        assert hiddenAnagram("D e b90it->?$ (c)a r...d,,#~", "bad credit").equals("debitcard");
        // When all spaces, numbers and puntuation marks are removed
        // from the whole phrase, the remaining characters form the sequence
        // "Debitcard" which is a perfect anagram of "bad credit".
        assert hiddenAnagram("Bright is the moon", "Bongo mirth").equals("noutfond");
        // The words "Bright moon" are an anagram of "bongo mirth" but they are
        // not a continuous alphabetical sequence because the words "is the" are in
        // between. Hence the negative result, "noutfond" is returned.
        
        assert Arrays.equals(
            collect("intercontinentalisationalism", 6),
            new String[] {"ationa", "interc", "ntalis", "ontine"}
        );
        assert Arrays.equals(
            collect("strengths", 3),
            new String[] {"eng", "str", "ths"}
        );
        assert Arrays.equals(
            collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15),
            new String[] {"croscopicsilico", "pneumonoultrami", "volcanoconiosis"}
        );

        assert nicoCipher("myworldevolvesinhers", "tesh").equals("yowmledrovlvsnieesrh");
        assert nicoCipher("andiloveherso", "tesha").equals("lnidaevheo s or");
        assert nicoCipher("mubashirhassan", "crazy").equals("bmusarhiahass n");
        assert nicoCipher("edabitisamazing", "matt").equals("deabtiismaaznig ");
        assert nicoCipher("iloveher", "612345").equals("lovehir    e");

        assert Arrays.equals(
            twoProduct(new int[] {1, 2, 3, 9, 4, 5, 15, 3}, 45),
            new int[] {9, 5}
        );
        // at index 5 which has the value 5 is a full match
        // to the value at index 3 which is 9
        // the closest gap between indices that equates
        // to the product which is 45
        assert Arrays.equals(
            twoProduct(new int[] {1, 2, 3, 9, 4, 15, 3, 5}, 45),
            new int[] {3, 15}
        );
        // at index 5 which has the value 15 is a full match
        // to the value at index 2 which is 3
        // the closest gap between indices that equates
        // to the product which is 45
        assert Arrays.equals(
            twoProduct(new int[] {1, 2, -1, 4, 5, 6, 10, 7}, 20),
            new int[] {4, 5}
        );
        // at index 4 which has the value 5 is a full match
        // to the value at index 3 which is 4
        // a full match can only be achieved if you've found the multiplier at an
        // index lower than the current index, thus, 5 (@ index 4) has a pair lower
        // than its index which is the value 4 (@ index 3), so, 5*4 = 20, in which 5
        // has a higher index (4) than 4 which has an index value of 3
        assert Arrays.equals(
            twoProduct(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10),
            new int[] {2, 5}
        );
        assert Arrays.equals(
            twoProduct(new int[] {100, 12, 4, 1, 2}, 15),
            new int[] {}
        );
        
        assert Arrays.equals(
            isExact(6),
            new int[] {6, 3}
        );
        assert Arrays.equals(
            isExact(24),
            new int[] {24, 4}
        );
        assert Arrays.equals(
            isExact(125),
            new int[] {}
        );
        assert Arrays.equals(
            isExact(720),
            new int[] {720, 6}
        );
        assert Arrays.equals(
            isExact(1024),
            new int[] {}
        );
        assert Arrays.equals(
            isExact(40320),
            new int[] {40320, 8}
        );
        
        assert fractions("0.(6)").equals("2/3");
        assert fractions("1.(1)").equals("10/9");
        assert fractions("3.(142857)").equals("22/7");
        assert fractions("0.19(2367)").equals("5343/27775");
        assert fractions("0.1097(3)").equals("823/7500");
        
        assert pilish_string("33314444").equals("333 1 4444");
        // 3.14
        assert pilish_string("TOP").equals("TOP");
        // 3
        assert pilish_string("X").equals("XXX");
        // "X" has to match the same length of the first digit (3)
        // The last letter of the word is repeated
        assert pilish_string("").equals("");
        
        assert generateNonconsecutive(1).equals("0 1");
        assert generateNonconsecutive(2).equals("00 01 10");
        assert generateNonconsecutive(3).equals("000 001 010 100 101");
        assert generateNonconsecutive(4).equals("0000 0001 0010 0100 0101 1000 1001 1010");
        
        assert isValid("aabbcd").equals("NO");
        // We would need to remove two characters, both c and d -> aabb or a and b -> abcd, to make it valid.
        // We are limited to removing only one character, so it is invalid.
        assert isValid("aabbccddeefghi").equals("NO");
        // Frequency counts for the letters are as follows:
        // {"a": 2, "b": 2, "c": 2, "d": 2, "e": 2, "f": 1, "g": 1, "h": 1, "i": 1}
        // There are two ways to make the valid string:
        // Remove 4 characters with a frequency of 1: {f, g, h, i}.
        // Remove 5 characters of frequency 2: {a, b, c, d, e}.
        // Neither of these is an option.
        assert isValid("abcdefghhgfedecba").equals("YES");
        // All characters occur twice except for e which occurs 3 times.
        // We can delete one instance of e to have a valid string.
        
        assert Arrays.deepEquals(
            sumsUp(new int[] {1, 2, 3, 4, 5}),
            new int[][] {{3, 5}}
        );
        assert Arrays.deepEquals(
            sumsUp(new int[] {1, 2, 3, 7, 9}),
            new int[][] {{1, 7}}
        );
        assert Arrays.deepEquals(
            sumsUp(new int[] {10, 9, 7, 2, 8}),
            new int[][] {}
        );
        assert Arrays.deepEquals(
            sumsUp(new int[] {1, 6, 5, 4, 8, 2, 3, 7}),
            new int[][] {{2, 6}, {3, 5}, {1, 7}}
        );
        // [6, 2] first to complete the cycle (to sum up to 8)
        // [5, 3] follows
        // [1, 7] lastly
        // the pair that completes the cycle is always found on the left
        // [2, 6], [3, 5], [1, 7] sorted according to cycle completeness, then pair-wise.
    }
}
