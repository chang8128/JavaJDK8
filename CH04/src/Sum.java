import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("输入数字： ");
            number = Long.parseLong(scanner.nextLine());
            sum += number;
        } while(number != 0);
        System.out.println("总和：" +sum);
        scanner.close(); //申请了一个输入流system.in 在你用完这个后要将其关闭。
    }

}
