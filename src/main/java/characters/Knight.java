package characters;

public class Knight extends SwordsMan{
    public Knight(){
        super(2, 12);
    }

    @Override
    public String toString() {
        return "Knight" + super.toString();
    }
}
