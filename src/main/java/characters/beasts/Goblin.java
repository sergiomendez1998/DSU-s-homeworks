package characters.beasts;

import characters.Beast;
import characters.Character;

public class Goblin extends Beast {

    public Goblin(int life, int armour, String name) {
        super(life, armour, name);
    }

    @Override
    public int getAlterAttack(Character attack) {
        return 0;
    }

    @Override
    public int getAlterDefense(Character defense) {
        return 0;
    }
}
