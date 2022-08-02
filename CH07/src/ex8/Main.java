package ex8;

public class Main {
    public static void main(String[] args) {
        Some s = new Some() {
            public void doSome() {
                System.out.println("做一些事情");
            }
            public void doService() {
                System.out.println("做一些服务");
            }
        };
        s.doService();
    }
}
