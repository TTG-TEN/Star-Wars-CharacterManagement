class Sith extends Character implements ForceUser {
    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    void action() {
        super.showinfo();

        System.out.println(name + " throws his lightsaber");

    }
 @Override
    public void useForce() {
        System.out.println(name + " force chokes!");
    }
}


