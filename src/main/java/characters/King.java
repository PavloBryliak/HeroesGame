package characters;


public class King extends SwordsMan {
    public King(){
        super(5, 15);
    }

    @Override
    public String toString() {
        return "King" + super.toString();
    }
}