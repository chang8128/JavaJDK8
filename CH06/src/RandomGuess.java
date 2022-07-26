import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.print("输入数字: ");
            guess = scanner.nextInt();
        } while (guess != number);
        System.out.println("猜中了！");
        scanner.close();
    }
}
