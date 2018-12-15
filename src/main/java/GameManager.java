import characters.Character;
import factory.CharacterFactory;

public class GameManager {
    public static void startGame(){
        CharacterFactory factory = new CharacterFactory();
        Character first = factory.createCharacter();
        Character second = factory.createCharacter();
        fight(first, second);

    }


    public static void fight(Character character1, Character character2) {
        System.out.println(character1 + " against " + character2);

        if (character1.getPower() == 0 && character2.getPower() == 0){
            System.out.println("Peacefully went for a cup of something...");
            return;
        }

        else if (character1.getPower() == 0){
            System.out.println(character2 + " won!");
            return;
        }

        else if (character2.getPower() == 0){
            System.out.println(character1 + "won!");
            return;
        }
        if (character1.getClass().equals(character2.getClass())){
            System.out.println("Two Elfs will newer fight!");
            return;
        }

        while (character1.isAlive() && character2.isAlive()) {
            System.out.println(character1 + " kicks " + character2);
            character1.kick(character2);
            System.out.println("Conditions of first character:" + "\n" + character2);

            System.out.println(character2 + " kicks " + character1);
            character2.kick(character1);
            System.out.println("Conditions of second character:" +"\n"+ character1);

        }
        if (character1.isAlive()){
            System.out.println(character1 + "won!");
        }

        else {System.out.println(character2 + "won!"); }

    }

}
