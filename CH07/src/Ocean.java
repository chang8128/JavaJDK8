public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemoefish("尼莫"));
        doSwim(new Shark("兰尼"));
        doSwim(new Human("贾斯汀"));
        doSwim(new Submarine("黄色一号"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}
