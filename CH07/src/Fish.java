public abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public abstract void swim();  //由于 Fish 类并不知道每条鱼怎么游，所以还是定义抽象的行为。
}
