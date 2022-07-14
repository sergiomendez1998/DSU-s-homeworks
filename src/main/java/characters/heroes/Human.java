package characters.heroes;

import characters.Character;
import characters.Heroe;

public class Human extends Heroe {

    public Human(int life, int armour, String name) {
        super(life, armour, name);
    }

    @Override
    public int getAlterAttack(Character attack) {
        return 0;
    }
}
