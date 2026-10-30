public class CloneTrooper extends Character{
    public CloneTrooper(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println(name + " Shoots better than a StormTrooper!");
    }

}
