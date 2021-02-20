class Task1 {
    /* В Java есть единственный оператор, способный обеспечить остаток от
       операции деления. Два числа передаются в качестве параметров.
       Первый параметр, разделенный на второй параметр, будет иметь остаток,
       возможно, ноль. Верните это значение. */
       
    public static int remainder(int a, int b) {
        return a % b ;
    }
    
    
    /* Напишите функцию, которая принимает основание и высоту треугольника и
       возвращает его площадь. */
       
    public static double triArea(int a, int h) {
        return a * h / 2 ;
    }
    
    
    /* В этой задаче фермер просит вас сказать ему, сколько ног можно сосчитать
       среди всех его животных. Фермер разводит три вида:
           chickens = 2 legs
           cows = 4 legs
           pigs = 4 legs
       Фермер подсчитал своих животных, и он дает вам промежуточный итог для
       каждого вида. Вы должны реализовать функцию, которая возвращает общее
       количество ног всех животных. */
       
    public static int animals(int chickens, int cows, int pigs) {
        return chickens*2 + cows*4 + pigs*4;
    }
    
    
    /* Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
       возвращает true, если prob * prize > pay; в противном случае
       возвращает false.

       Чтобы проиллюстрировать это: profitableGamble (0.2, 50, 9) должен выдать
       значение true, поскольку 1 (0.2 * 50 - 9), а 1 > 0. */
       
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }
    
    
    /* Напишите функцию, которая принимает 3 числа и возвращает, что нужно
       сделать с a и b: они должны быть сложены, вычитаны, умножены или
       разделены, чтобы получить N. Если ни одна из операций не может дать N,
       верните "none". 3 числа – это N, a и b. */
       
    public static String operation(int N, int a, int b) {
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a * b == N) return "multiplied";
        if (a / b == N) return "divided";
        return "none";
    }
    
    
    /* Создайте функцию, которая возвращает значение ASCII
       переданного символа. */

    public static int ctoa(char a) {
        return (int) a;
    }
    
    
    /* Напишите функцию, которая берет последнее число из последовательного
       списка чисел и возвращает сумму всех чисел до него и включая его. */
       
    public static int addUpTo(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
    
    
    /* Создайте функцию, которая находит максимальное значение третьего ребра
       треугольника, где длины сторон являются целыми числами */
       
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
    
    
    /* Создайте функцию, которая принимает массив чисел и возвращает сумму его
       кубов */
       
    public static int sumOfCubes(int [] array) {
        int sum = 0;
        for (int value : array)
            sum += Math.pow(value, 3);
        return sum;
    }
    
    
    /* Создайте функцию, которая будет для данного a, b, c выполнять следующие
       действия:
           – Добавьте A к себе B раз.
           – Проверьте, делится ли результат на C */
           
    public static boolean abcmath(int a, int b, int c) {
        return (a << b) % c == 0;
    }
    
    
    /* ТЕСТЫ ТЕСТЫ ТЕСТЫ */
    
    public static void main(String[] args) {
        assert remainder(1, 3) == 1;
        assert remainder(3, 4) == 3;
        assert remainder(-9, 45) == -9;
        assert remainder(5, 5) == 0;
        
        assert triArea(3, 2) == 3;
        assert triArea(7, 4) == 14;
        assert triArea(10, 10) == 50;
        
        assert animals(2, 3, 5) == 36;
        assert animals(1, 2, 3) == 22;
        assert animals(5, 2, 8) == 50;
        
        assert profitableGamble(0.2, 50, 9) == true;
        assert profitableGamble(0.9, 1, 2) == false;
        assert profitableGamble(0.9, 3, 2) == true;
        
        assert operation(24, 15, 9) == "added";
        assert operation(24, 26, 2) == "subtracted";
        assert operation(15, 11, 11) == "none";

        assert ctoa('A') == 65;
        assert ctoa('m') == 109;
        assert ctoa('[') == 91;
        assert ctoa('\\') == 92;

        assert addUpTo(3) == 6;
        assert addUpTo(10) == 55;
        assert addUpTo(7) == 28;

        assert nextEdge(8, 10) == 17;
        assert nextEdge(5, 7) == 11;
        assert nextEdge(9, 2) == 10;

        assert sumOfCubes(new int[] {1, 5, 9}) == 855;
        assert sumOfCubes(new int[] {3, 4, 5}) == 216;
        assert sumOfCubes(new int[] {2}) == 8;
        assert sumOfCubes(new int[] {}) == 0;

        assert abcmath(42, 5, 10) == false;
        assert abcmath(5, 2, 1) == true;
        assert abcmath(1, 2, 3) == false;
    }
}
