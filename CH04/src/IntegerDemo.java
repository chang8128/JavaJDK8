public class IntegerDemo {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;
        Integer wrapper1 = new Integer(data1);
        Integer wrapper2 = new Integer(data2);
        System.out.println(data1 / 3); //打包基本类型，在最初的Integer 空间中做运算
        System.out.println(data2 / 3); //打包基本类型，在最初的Integer 空间中做运算
        System.out.println(wrapper1.doubleValue() / 3); //打包器wrapper1定义为double类型，那么运算结果就以double类型返回
        System.out.println(wrapper1.compareTo(wrapper2)); //打包器wrapper1定义为double类型，那么运算结果就以double类型返回

        int i1 = 300;
        int i2 = 300;
        Integer wi1 = i1;
        Integer wi2 = i2;
        System.out.println(wi1.equals(i1));
        System.out.println(wi2.equals(i2));


        if(i1 == i2) {
            System.out.println(i1 == i2);
        }
        else {
            System.out.println("i1 != i2");
        }
    }
}
