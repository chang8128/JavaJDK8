import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class ShuffleDemo {
    // java.util.Collections 类下有一个静态的shuffle()方法
    // static void shuffle(List<?>list, Random rand)使用指定的随机源对指定列表进行置换
    public static void main(String[] args) {
        Random rand = new Random();
        String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 第一种方法
        List<String> list = new ArrayList<String>(Arrays.asList(ranks));
        System.out.println("前 shuffling: " + list);
        Collections.shuffle(list,rand);
        System.out.println("后 shuffling: " + list);
                     
        //第二种方法
        System.out.println("第二种方法：数组化");
        List<String> list1 = Arrays.asList(ranks);
        System.out.println("前 shuffling: " + list1);
        Collections.shuffle(list1,rand);
        System.out.println("后 shuffling: " + Arrays.toString(ranks));
    }
}
