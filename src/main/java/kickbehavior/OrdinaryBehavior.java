package kickbehavior;
import characters.Character;


public abstract class OrdinaryBehavior  implements Behavior{
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp() - main.getHp());
    }

//    public void kick(java.lang.Character main, java.lang.Character enemy) {
//
//    }
}
