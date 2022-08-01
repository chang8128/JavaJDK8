public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemoefish("尼莫"));
        doSwim(new Shark("兰尼"));
        doSwim(new SwimPlayer("贾斯汀"));
        doSwim(new Submarine("黄色一号"));
        doSwim(new Seaplane("空军零号"));
        doSwim(new FlyingFish(("深平")));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}
