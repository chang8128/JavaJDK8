import java.util.*;

public class TwoDimensionMaze {
    public static void main(String[] args) {
        char[][] array = {
        // y: 0    1    2    3    4    5    6    7    8    9
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, // 0 --- Axis x
            {'#', '0', ' ', ' ', ' ', ' ', '#', '#', ' ', ' '}, // 1 --- Axis x
            {'#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#'}, // 2 
            {'#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#'}, // 3
            {'#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#'}, // 4
            {'#', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'}, // 5
            {'#', '#', '#', ' ', ' ', ' ', '#', '#', ' ', '#'}, // 6
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, // 7
        };
        // print map
        printMap(array);

        //声明起始变量
        int x = 1;
        int y = 1;

        //声明结束的变量
        int ex = 1;
        int ey = 9;
        Scanner input = new Scanner(System.in);

        //提示输入 w a s d
        while (array[ex][ey] != '0') {
            System.out.println("请输入 w a s d");
            //接收输入的值
            String string = input.nextLine();
            //判断往哪里移动
            switch (string) {
                case "w":
                    if (array[x - 1][y] != '#') {
                        // 把原来的改为空格
                        array[x][y] = ' ';
                        // 向上移动
                        x = x - 1;
                        array[x][y] = '0';
                    }
                    break;
                case "a":
                    if (array[x][y-1] != '#') {
                        // 把原来的改空格
                        array[x][y] = ' ';
                        // 向左移动
                        y = y - 1;
                        array[x][y] = '0';
                    }
                    break;
                case "s":
                    if (array[x + 1][y] != '#') {
                        array[x][y] = ' ';
                        // 向下移动
                        x = x + 1;
                        array[x][y] = '0';
                    }
                    break;
                case "d":
                    if (array[x][y + 1] != '#') {
                        array[x][y] = ' ';
                        // 向右移动
                        y = y + 1;
                        array[x][y] = '0';
                    }
                    break;
                default:
                    break;
            }
            printMap(array);
        }
        System.out.println("恭喜通关！");
        input.close();
    }
    
    public static void printMap(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

