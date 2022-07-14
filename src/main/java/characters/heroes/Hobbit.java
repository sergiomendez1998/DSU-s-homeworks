package characters.heroes;

import characters.Character;
import characters.Heroe;
import characters.beasts.Goblin;

public class Hobbit extends Heroe {

    public Hobbit(int life, int armour, String name) {
        super(life, armour, name);
    }

    @Override
    public int getAlterAttack(Character defense) {
        if (defense instanceof Goblin) {
            System.out.println(" Hobbit was frightened of the Goblin, defense power decreased. -5");
            return -5;
        }
        return 0;
    }

}

