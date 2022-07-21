
public class Fibonacci {
    public static int nr_fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return nr_fibonacci(n - 1) + nr_fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print(nr_fibonacci(i) + " ");
        }
    }
}


