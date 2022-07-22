package migong;

public class MiGong2 {
    public static void main(String[] args) {
        // create a maze
        int[][] maze = new int[7][7];
        //2 is wall, 0 is path
        // set top wall, rightside wall and rightside wall
        for (int i = 0; i < 7; i++) {
            maze[0][i] = 2;
            maze[6][i] = 2;
            maze[i][6] = 2;
        }
        // set leftside wall
        for (int i = 2; i < 7; i++) {
            maze[i][0] = 2;
        }
        // set 障碍物obstacle
        maze[2][2] = 2;
        maze[2][4] = 2;
        maze[3][3] = 2;
        maze[3][5] = 2;
        maze[4][1] = 2;
        maze[4][3] = 2;
        maze[4][5] = 2;
        
        // create exit
        maze[6][5]= 0;

        //output maze
        System.out.println("maze map");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        // 递归解题
        setWay(maze, 1, 0);

        // output find the way to out. 
        System.out.println("到达出口的地图及老鼠移动的轨迹");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setWay(int[][] maze, int i, int j) {
        if(maze[6][5] == ' ') {  //到达终点
            System.out.println("老鼠到达出口!");
        } else {
            if(maze[i][j] == 0) { // continue
                //make a routine policy, right > down > left > up
                maze[i][j] = ' ';
                setWay(maze, i++, j);
            }
            else {
                setWay(maze, i-1, j++);
            }

        }
    }
}

