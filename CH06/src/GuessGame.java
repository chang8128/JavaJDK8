public abstract class GuessGame {
    public void go() {
        int number = (int) (Math.random() * 10);
        int guess;
        do {
            print("输入数字： ");
            guess = nextInt();
        } while (guess != number);
        println("猜中了 ！");
    }

    public void println(String text) {
        print(text + "\n");  //抽象方法
    }

    public abstract void print(String text);  //抽象方法
    public abstract int nextInt();  //抽象方法
}
