package apps;

public class Fibonacci {
    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int k) {
        System.out.print(" " + k);
        if (k == 0) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return fib(k - 2) + fib(k - 1);
        }
    }
}
