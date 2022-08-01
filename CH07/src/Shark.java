public class Shark implements Swimmer {
    private String name;
    public Shark(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("鲨鱼 %s 游泳%n", name);
    }
}
