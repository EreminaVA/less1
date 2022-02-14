package lesson_2.homework;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }

    /**
     * Раскомментируй и исправь оба условия так, чтобы они возвращали true
     * Нельзя изменять типы и значения переменных, а так же оператор и метод сравнения.
     */
    public static void task_1() {
        int a = 1;
        String b = "1";
        if (a == Integer.parseInt(b)) {
            System.out.println("true");
        }

        if (b.equals(Integer.toString(a))) {
            System.out.println("true");
        }
    }

    /**
     * Доработай блоки switch так, чтобы в консоль было выведено значение: 12210355
     */
    public static void task_2() {
        String[] strs = new String[]{"one", "two", "three", "four"};
        for (String str : strs) {
            switch (str) {
                case "one":
                    System.out.print(1);
                case "two":
                    System.out.print(2);
                    break;
                case "three":
                    System.out.print(3);
                default:
                    System.out.print(5);
            }

            switch (str.indexOf("o")) {
 //               case 0:
//                case 1:
                case 2:
                    System.out.print(10);

            }
        }
    }

    /**
     * Раскомментируй код, и укажи числа для сравнения с переменной i,
     * а так же расставь логические операторы &, &&, | и || таким образом,
     * чтобы в консоли было выведено значение: 102428338.
     * Запрещается что-либо изменять или менять местами.
     */
    public static void task_3() {
        for (int i = 0; i < 4; i++) {
            if (compare(i, 1) && decreaseAndCompare(i, 0) && incrementAndCompare(i, 2)) {
                System.out.print("4");
            } else if (decreaseAndCompare(3, i) || incrementAndCompare(2, i) && compare(3, i)) {
                System.out.print("8");
            }
        }

    }

    private static boolean compare(int a, int b) {
        boolean result = a == b;
        if (result) System.out.print(a);
        return result;
    }

    private static boolean decreaseAndCompare(int a, int b) {
        boolean result = --a == b;
        if (result) System.out.print(b);
        return result;
    }

    private static boolean incrementAndCompare(int a, int b) {
        boolean result = ++a == b;
        if (result) System.out.print(a);
        return result;
    }
}