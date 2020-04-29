package apps;

public class FibonacciExplanation {
    private static int depth = 0;

    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int k) {
        in(k);
        int result = (k < 2) ? k : fib(k - 2) + fib(k - 1);
        out(k);
        return result;
    }

    private static void in(int k) {
        spaces();
        System.out.println("(" + k + ")->");
        depth++;
    }

    private static void out(int k) {
        depth--;
    }

    private static void spaces() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }
}
