package exercise5;

public class Main {
    public static void main(String[] args) {
        Some s = new SomeOtherImp1();
        s.doSome();
        Other o = (Other) s;
        o.doOther();
    }
}
