/* 
 * study by myself, but always have some problem
 * Now the problem is I do not know how to avoid the wall should not be replaced.
 * 好像墙壁被替换的原因在于 j++, 应该用 j+1, 不知道用 j++ 为啥墙壁会被替换掉 
 */
public class MiceMaze {
    static char[][] maze;
    public static void main(String[] args) {
        maze = new char[][] {
          //█ 是墙壁， space 是道路， + 是老鼠
          //y 0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15
            {'█','█','█','█','█','█','█','█','█','█','█','█','█','█','█','█'}, //x: 0
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█','█','█','█'}, //x: 1
            {'█',' ',' ','█','█','█','█','█','█','█','█','█','█',' ',' ','█'}, //x: 2
            {'█',' ','█','█','█',' ',' ',' ','█',' ','█',' ',' ',' ',' ','█'}, //x: 3
            {'█',' ',' ','█',' ',' ','█',' ','█',' ','█',' ','█','█',' ','█'}, //x: 4
            {'█',' ',' ','█',' ','█',' ',' ',' ',' ','█',' ',' ','█',' ','█'}, //x: 5
            {'█',' ',' ',' ',' ','█',' ','█','█',' ',' ',' ','█','█',' ','█'}, //x: 6
            {'█','█','█','█','█','█',' ','█','█','█','█','█','█','█',' ','█'}, //x: 7
        };
      
        // print the maze;
        System.out.println("迷宫的样子");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

        // set the begin point
        setWay(1, 0);

        //输出新地图
        System.out.println("输出到达终点的地图");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    //设置走迷宫的策略
    public static boolean setWay(int i, int j) {
        //recursion condition end at the (6, 14)
        if (maze[7][14] == '+') {  //to the end
            return true;
        } else {
            // 判断四个方向是否可行，否则，回溯
            if (maze[i][j] == ' ') {
                maze[i][j] = '+';
                if (setWay(i, j+1)) {
                    return true;
                } else if (setWay(i+1, j)) {
                    return true;
                } else if (setWay(i-1, j)) {
                    return true;
                } else if (setWay(i+1, j)) {
                    return true;
                } else {
                    maze[i][j] = '◇';
                    return false;
                }
            } else {
                return false;
            }
        } 
    } 
}
