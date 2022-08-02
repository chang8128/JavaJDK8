public class Game {
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
        play(Action.DOWN);
        play(Action.LEFT);
    }

    public static void play(int action) {
        switch(action) {
            case Action.STOP:
                System.out.println("停止播放动画");
                break;

            case Action.RIGHT:
                System.out.println("播放向右动画");
                break;

            case Action.LEFT:
                System.out.println("播放向左动画");
                break;

            case Action.UP:
                System.out.println("播放向上动画");
                break;

            case Action.DOWN:
                System.out.println("播放向下动画");
                break;

            default:
                System.out.println("不支持此动作");
        }
    }
}
