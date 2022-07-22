package migong;

public class MiGong {
    public static void main(String[] args) {
        // create a maze
        int[][] maze = new int[8][7];
        //1 is wall, 0 is path, 2 is walked, 3 is fail
        //set upside and downside is wall
        for (int i = 0; i < 7; i++) {
            maze[0][i] = 1;
            maze[7][i] = 1;
        }
        // set leftside and rightside is wall
        for (int i = 0; i < 8; i++) {
            maze[i][0] = 1;
            maze[i][6] = 1;
        }
        // set 障碍物obstacle
        maze[3][1] = 1;
        maze[3][2] = 1;
        maze[3][5] = 1;
        maze[5][5] = 1;

        //output maze
        System.out.println("maze map");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        //递归解题
        setWay(maze, 1, 1);

        // output find the way to out. 
        System.out.println("到达出口的地图及老鼠移动的轨迹");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean setWay(int[][] maze, int i, int j) {
        if(maze[6][5] == 2) {  //到达终点
            return true;
        } else {
            if(maze[i][j] == 0) { // continue
                //make a routine policy, right > down > left > up
                maze[i][j] = 2;
                if(setWay(maze, i, j++)) {
                    return true;
                } else if(setWay(maze, i++, j)) {
                    return true;
                } else if(setWay(maze, i, j--)) {
                    return true;
                } else if(setWay(maze, i--, j)) {
                    return true;
                } else {
                    // maze[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
