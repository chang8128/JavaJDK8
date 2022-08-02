package enumdemo;

public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }

    public static void play(Action action) {
        switch(action) {
            case STOP:
                System.out.println("播放停止动画");
                break;

            case RIGHT:
                System.out.println("播放向右动画");
                break;

            case LEFT:
                System.out.println("播放向左动画");
                break;

            case DOWN:
                System.out.println("播放向下动画");
                break;

            case UP:
                System.out.println("播放向上动画");
                break;
        }
    }
}
