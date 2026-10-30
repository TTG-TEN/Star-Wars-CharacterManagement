public class BountyHunter extends Character {
    public BountyHunter(String name, int age) {
        super(name, age);
    }

    @Override
public void action() {
        super.showinfo();
        System.out.println(name + " takes a bounty");
}

public void hunt() {
    System.out.println("The Bounty Hunter " +name + " hunts his bounty" );

}
}
