public class MazeAlgorithm {
    static int[][] matrix;
    public static void main(String[] args) {
        // 1 is wall, 2 is pass, -1 is not way and avoid try again.
        matrix = new int[][] {
            {1,1,1,1,1,1,1,1,1,1,1,1,1}, //i 0
            {1,0,0,1,0,0,0,0,0,1,0,0,1}, //i 1
            {1,0,1,1,1,1,1,1,1,1,1,1,1}, //i 2
            {1,0,1,1,1,1,1,1,1,1,1,1,1}, //i 3
            {1,0,1,1,1,1,1,1,1,1,1,1,1}, //i 4
            {1,0,0,0,0,0,0,0,0,0,0,0,1}, //i 5
            {1,0,1,1,1,1,1,1,1,1,1,0,1}, //i 6
            {1,1,1,1,1,1,1,1,1,1,1,1,1}, //i 7
        };
        //begin at [1][1], end at [6][11]
        recursion(1, 1);
        printResult();
    }

    // 递归方法
    public static boolean recursion(int i, int j) {
        //递归结束条件，代表已经走到终点[6][11]
        if (matrix[6][11] == 2) {
            return true;
        }

        //判断四个方向是否可行，一个方向可行就往深度递归，否则：回溯
        if (matrix[i][j] == 0) {  //如果该点未访问过，则从该点开始探索
            matrix[i][j] = 2;
            if (recursion(i--, j)) {  //先往上走
                return true;
            } else if (recursion(i, j++)) {  //往右走
                return true;
            } else if (recursion(i++, j)) {  //向下走
                return true;
            } else if (recursion(i, j--)) {  //向左走
                return true;
            } else {  //四个方向都走不通，说明该递归分支不行，回溯
                matrix[i][j] = -1;
                return false;
            } 
        } else {
            return false;
        }
    } 

    public static void printResult() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
