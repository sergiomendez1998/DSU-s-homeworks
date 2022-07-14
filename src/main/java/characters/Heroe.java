package characters;

import characters.beasts.Orc;
import characters.heroes.Elves;
import characters.heroes.Hobbit;
import characters.heroes.Human;
import util.Util;

public abstract class Heroe extends Character {
    private static final String HOBBIT = "Hobbit";
    private static final String ELVES = "Elves";
    private static final String HUMAN = "Human";
    private static final int DICE_TIME = 2;

    public Heroe(int life, int armour, String name) {
        super(life, armour, name);
    }

    @Override
    public int getDiceTimes() {
        return DICE_TIME;
    }

   //override the method getDefense to the class Character
    @Override
    public int getAlterDefense(Character attack) {
        if (attack instanceof Orc) {
            System.out.println(" Heroe was frightened by the orc and lowered his armour. -10");
            return -10;
        }
        return 0;
    }


    public static Character createHero(int life, int armour) {
        Character bH = null;
            int CreateHeroes = Util.generateRandomNumber(1, 3);
            switch (CreateHeroes) {
                case 1:
                    return (Character) (new Hobbit(life, armour, HOBBIT));
                case 2:
                    return (Character) (new Elves(life, armour, ELVES));
                case 3:
                    return (Character) (new Human(life, armour, HUMAN));
                default:
                    System.out.println("No Heroe Created");
                    break;
            }
        return bH;
    }
}

