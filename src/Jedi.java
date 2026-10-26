class Jedi extends Character {

    @Override
    void action() {
        System.out.println("Jedi swings their lightsaber!");
    }

    @Override
    void showinfo() {

        System.out.println(name +" "+ age);
    }
}
