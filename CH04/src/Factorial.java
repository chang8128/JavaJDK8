/* 计算 5 的阶乘
 * result = 5 * 4 * 3 * 2 * 1
 * 递归的三个条件：边界条件、递归前进条件、递归返回段
 * 此题中的三个条件：
 * 1. 边界条件： 阶乘到最后一个数，即 1 的时候，返回1，程序执行到底
 * 2. 递归前进段：当前的数不等于 1 的时候，继续调用自身；
 * 3. 递归返回段：从最大的数开始乘，如果当前参数是 5，那么就是 5 * 4，即 n*(n-1)
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (1 == n) {
            return 1;
        } else {
            return n*(n - 1);
        }
    }
}
