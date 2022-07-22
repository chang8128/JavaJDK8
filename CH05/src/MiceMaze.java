public class MiceMaze {
    public static void main(String[] args) {
        char[][] maze = {
          //█ 是墙壁， space 是道路， + 是老鼠
          //y 0   1   2   3   4   5   6   7   8   9  10  11  12 
            {'█','█','█','█','█','█','█','█','█','█','█','█','█'}, //axis x: 0
            {'+',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','█'}, //axis x: 1
            {'█',' ',' ','█','█','█','█','█','█','█','█',' ','█'}, //axis x: 2
            {'█',' ','█','█','█',' ',' ',' ','█',' ',' ',' ','█'}, //axis x: 3
            {'█',' ',' ','█',' ',' ','█',' ','█',' ','█',' ','█'}, //axis x: 4
            {'█',' ',' ','█',' ','█','█',' ',' ',' ','█',' ','█'}, //axis x: 5
            {'█',' ',' ',' ',' ','█',' ','█','█',' ',' ',' ','█'}, //axis x: 6
            {'█','█','█','█','█','█','█','█','█','█','█',' ','█'}, //axis x: 7
        };
      
        // print the maze;
        System.out.println("迷宫的样子");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

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
    public static boolean setWay(char[][] maze, int i, int j) {
        //recursion condition end at the (7, 11)
        if (maze[7][11] == '+') {  //to the end
            return true;
        } else { 
            return false;
        }
    }
}
