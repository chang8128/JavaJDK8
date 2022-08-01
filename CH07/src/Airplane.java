public class Airplane implements Flyer {
    protected String name;
    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.printf("飞机 %s 在飞%n", name);
    }
}
