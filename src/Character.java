public class Character {
   protected String name;
     private int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void action() {
        System.out.println("Character is doing something");
    }

void showinfo() {

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    }

public final void goLive() {
    System.out.println(name + " has entered the game");
}
}
