public class Jedi extends Character implements ForceUser {
    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    void action() {

        super.showinfo();
        System.out.println( name + " swings their lightsaber!");
    }

    public void meditate() {
        System.out.println( name + " meditates ");


    }
@Override
    public void useForce() {
    System.out.println( name + " uses Force Push");
}

}
