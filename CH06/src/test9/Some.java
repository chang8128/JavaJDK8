package test9;

public class Some {
    Some() {
        this(10);
        System.out.println("Some()");
    }

    public Some(int i) {
        System.out.println("Some(int x)");
    }
}
