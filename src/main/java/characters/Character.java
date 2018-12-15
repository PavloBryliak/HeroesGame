package characters;


import kickbehavior.Behavior;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class Character {
    private int power;
    public static Random random = new Random();
    private Behavior behavior;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

}
