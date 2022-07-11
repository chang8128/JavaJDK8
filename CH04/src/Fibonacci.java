import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("输入你想要的Fibonacci 数列的个数：\n");
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
      
        for(int fib = 0; fib < counter; fib++) {
            System.out.printf("Fibonacci of %d is %d\n", fib, fibonacci(fib));
        }
        input.close(); //申请了一个输入流system.in 在你用完这个后要将其关闭。
    }

    public static long fibonacci(long serial) {
        if(serial == 0 || serial == 1)
            return serial;
        else 
            return fibonacci(serial -1 ) + fibonacci(serial -2);
    }
    
}
