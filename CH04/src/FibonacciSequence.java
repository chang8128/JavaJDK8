public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(FS(40));
    }

    public static int FS(int n) {
        if (1 == n || 2 == n) {
            return 1;
        } else {
            return FS(n - 1) + FS(n - 2);
        }
    }
}
