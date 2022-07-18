public class HanoiGame {
    public static void main(String[] args) {
        // 看一下油管李永乐老师的讲解，能轻松理解本算法 https://www.youtube.com/watch?v=1QgJEcnsqsQ
        int n = 10;                         //一共需要移动的盘子
        char a = 'A', b = 'B', c = 'C';    //柱子A（起始柱）、B（中间柱）、C（目标柱）
        hanio(n, a, b, c);
    }

    public static void hanio(int n, char a, char b, char c) {
        // 只有一个盘子的时候，就直接从A移动到C
        if(n == 1) {
            move(n, a, c);
        } else {
            // 1. 把 n-1 个盘子从 A 挪到 B（借助 C）
            hanio(n-1, a, c, b);
            
            // 2. 把第 n 个盘子从 A 挪到 C
            move(n, a, c);

            // 3. 再把 n-1 个盘子从 B 挪到 C （借助 A）
            hanio(n-1, b, a, c);
        }
    }

    public static void move(int n, char a, char b) {
        System.out.println("把第"+ n +"个盘子从"+ a +"移到"+ b);
    }
}
