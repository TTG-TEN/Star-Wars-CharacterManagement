import java.util.ArrayList;
import java.util.List;
void main() {

    List<Character> characters = new ArrayList<>();

    characters.add(new Jedi("Obi-Wan", 42));
    characters.add(new Sith("Darth Maul", 20));
    characters.add(new Droid("B00b5", 1));
    characters.add(new CloneTrooper("Dice", 4));
    characters.add(new BountyHunter("Dota", 25));

    for (Character character : characters) {
        character.goLive();
        System.out.println("============");
        character.action();
        if (character instanceof ForceUser) {
            ((ForceUser) character).useForce();
        }
        if (character instanceof BountyHunter) {
            ((BountyHunter) character).hunt();
        }
        if (character instanceof Jedi) {
            ((Jedi) character).meditate();
            System.out.println("=============");
        } else {
            System.out.println(character.name + " is not a Jedi");
            System.out.println("=============");

        }


    }



}
