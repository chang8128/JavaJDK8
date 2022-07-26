import java.util.Arrays;

public class ArrayList {
    private Object[] list;   //使用 Object 数组收集
    private int next;        //下一个可储存对象的索引
    
    public ArrayList(int capacity) {  //指定初始容量
        list = new Object[capacity];
    }

    public ArrayList() {
        this(16);  //初始容量默认为16
    }

    public void add(Object o) {  //收集对象方法
        if(next == list.length) {  //自动增长 Object 数组的长度
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }

    public Object get(int index) {
        return list[index];
    }

    public int size() {  //已收集的对象个数
        return next;
    }
}
