public class HelloGaoPing {
    public static void main(String[] args) {
        System.out.println("Hello, Gao Ping");

        System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(-Integer.MAX_VALUE);
        System.out.println(-Integer.MAX_VALUE == Integer.MIN_VALUE);

        int a = 10;
        int number = ++a;
        number = ++a;
        System.out.printf("This is %d + %d = %d%n", a, number, a + number);

        for(int i = 1; i < 10; i++) {
            if(i ==5) {
                continue;
            }
            System.out.printf("i = %d%n", i);
        }

        for(int guess = 1; guess != 5; guess =(int)(Math.random() * 10)) {
            System.out.println(guess);
        }
    }
}
