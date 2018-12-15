/*package kickbehavior;

import config.Config;

public class RandomBehavior implements Behavior {
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));
    }
}*/
package kickbehavior;

import config.Config;
import characters.Character;

abstract class RandomBehaviour implements Behavior{
    public void kick(Character main, Character enemy){
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));
    }
}


//REFLECTION