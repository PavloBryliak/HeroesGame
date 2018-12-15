package characters;

public class preElf extends Character{
    public preElf(int min, int max) {
        super(min, max);
    }
    public void kick(Character c){
        if (c.getPower() < this.getPower()){
            c.setHp(0);
        }
        else {
            c.setPower(c.getPower() - 1);
        }
    }
}
