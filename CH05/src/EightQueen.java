/* https://blog.51cto.com/victorfengming/3651333
 * copy from the site above.
 */

public class EightQueen {
    /* 八皇后问题，理论上应该创建一个二维数组来表示棋盘，但是实际上可以通过算法，用一个一位数组解决问题。
     * arr[8]={0,4,7,5,2,6,1,3}， 对应的arr 下标表示第几行，即第几个皇后
     * arr[i] = val, val 表示第 i+1 个皇后，放在第 i+1 行的第 val+1 列
     */ 
    //定义有多少个皇后，此时定义为 8 皇后，在 8x8 棋盘
     int max = 8;

     //该数组保存结果，第一个皇后摆放在 arr[0] 列，第二个摆放在 arr[1] 列
     int[] array = new int[max];
     static int count = 0;

     public static void main(String[] args) {
        EightQueen queen8 = new EightQueen();
        queen8.check(0);
        System.out.println("一共有" + count + "种解法");
     }

     /*
      * n 代表当前是第几个皇后，[n 是从 0 开始计算的，即 0 表示第一个皇后，同时 n 也表示第几行]
      * 即第 1 行是第一个皇后 (n=0), 第8行是第 8 个皇后 (n=7)，如果遍历到第9行(n=8), 说明皇后全部放好了.
      * 就相应的得到了一种解法，然后回溯，又将第一个皇后，放在了第一行的第 2 列...
      */

      private void check(int n) {
        // 终止条件是最后一行已经摆完，由于每摆放一步都会校验是否有冲突，
        // 所以只要最后一行摆完，说明已经得到了一个正确解。
        if (n == max) {
            print();
            return;
        }

        //将第 n 个皇后从第一列开始放置，然后判断是否和本行本列本斜线有冲突，如果OK，就进入下一行的逻辑
        for (int i = 0; i < max; i++) {
            array[n] = i; // 先将第一个皇后放置在第一行的第一列， array[0] = 0
            if (judge(n)) {  //如果该皇后和其他皇后冲突
                check(n + 1); // 放第二个皇后，因为是递归，因此可以思考，第二个皇后是从第二行的第一列开始放
            }
        }
      }

      /*
       * 查看 n 皇后是否满足约束条件（即：检查皇后 n 是否会发生冲突）
       * 如果冲突，返回 false, 如果不冲突则返回 true
       * 0 4 7 5 2 6 1 3
       */
      private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            /* 说明
             * 1. array[i] == array[n] 判断是不是在同一列
             * 2. Math.abs(n - 1) == Math.abs(array[n] - array[i]) 判断是不是在同一条斜线
             * 3. 不用判断是不是在同一行，因为我们每放一个皇后，行是递增的。
             */
            
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
      }

      // 打印这个满足条件的八皇后的位置
      private void  print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
      }
}
