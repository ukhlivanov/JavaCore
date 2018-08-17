package Charset;


public class App15 {
    private  int n;

    public App15() {

    }

    public App15(int n) {
        this.n = n;
    }

    public static int recursion(int n) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) * n;
    }

    public int getN() {
        return n;
    }

    public int setN(int n) {
        return n;
    }
}

//    public static void main(String[] args) {
//
//        System.out.println(recursion(5)); // вызов рекурсивной функции
//    }

