import java.util.ArrayList;
void main() {

ArrayList<Character> characters = new ArrayList<>();

characters.add(new Jedi());
characters.add(new Sith());
characters.add(new Droid());

for (Character character : characters) {

    character.action();
    System.out.println("");
}


}
