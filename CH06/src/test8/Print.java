package test8;

public class Print {
    public static void main (String[] args){
        System.out.println(print(8));
    }
    static Exception print(int i){
        if (i > 0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}
