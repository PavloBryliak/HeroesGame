package characters;

public class Hobbit extends Character {
    public Hobbit(){
        super(0, 3);
    }

    public void kick(Character c){
        toCry();
    }

    private void toCry() {
        System.out.println("Bilbo Beggins would not fight! Gendolf, help me!");
    }

    @Override
    public String toString() {
        return "Hobbit" + super.toString();
    }
}
