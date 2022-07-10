package cc.openhome;

public class Range {
    public static void main(String[] args) {
        // byte、short、int、long 范围
        System.out.printf("Byte Range: %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short: %d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer: %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long: %d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        
        // float、double 精度范围
        System.out.println("%n----- This if the range of Float and Double------,%n");
        System.out.printf("Float Range: %d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("Double Range: %d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        
        // char 可表示的 Unicode 範圍
        System.out.printf("%h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
        
        // boolean 的兩個值
        System.out.printf("%b ~ %b%n", Boolean.TRUE, Boolean.FALSE);
    }    
}