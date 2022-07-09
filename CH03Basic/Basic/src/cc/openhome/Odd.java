package cc.openhome;

public class Odd {
    public static void main(String[] args) {
        int input = 10;
        int remain = input % 2; 
        if(remain == 1) {
            System.out.printf("%d 为奇数%n", input);

        }
        else {
            System.out.printf("%d 为偶数%n", input);
        }
    }
}