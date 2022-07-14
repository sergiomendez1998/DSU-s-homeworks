package characters.heroes;

import characters.Character;
import characters.Heroe;
import characters.beasts.Orc;

public class Elves extends Heroe {


    public Elves(int life, int armour, String name) {
        super(life, armour, name);
    }
        @Override
    public int getAlterAttack(Character defense) {
        if(defense instanceof Orc){
            System.out.println(" Elves hate orcs, attack power increased. +10");
            return 10;
        }
        return 0;
    }

    @Override
    public int getAlterDefense(Character defense) {
        return 0;
    }

}
