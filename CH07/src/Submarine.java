public class Submarine extends Boat implements Dive {
    public Submarine(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("潜水艇 %s 潜行%n", name);
    }

    @Override
    public void dive() {
        System.out.printf("潜水艇 %s 潜行%n", name);
    }
}
