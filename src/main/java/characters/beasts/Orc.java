package characters.beasts;

import characters.Beast;
import characters.Character;

public class Orc extends Beast{
    public Orc(int life, int armour, String name) {
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
