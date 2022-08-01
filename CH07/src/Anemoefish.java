public class Anemoefish implements Swimmer {
    private String name;
    public Anemoefish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("小丑鱼 %s 游泳%n", name);
    }
}
