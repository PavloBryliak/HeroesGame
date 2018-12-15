package characters;

public class SwordsMan extends Character {
    public SwordsMan(int min, int max) {
        super(random.nextInt(max - min + 1) + min, random.nextInt(max - min + 1));
    }
    public void kick(Character c){
        c.setHp(c.getHp() - random.nextInt(this.getPower() + 1));
    }
}
