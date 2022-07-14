package characters;

import characters.beasts.Goblin;
import characters.beasts.Orc;
import util.Util;

public abstract class Beast extends Character {

    private final int DICE_TIME = 1;
    private static final String ORC = "Orc";
    private static String GOBLIN = "Goblin";

    public Beast(int life, int armour, String name) {
        super(life, armour, name);
    }

    @Override
    public int getDiceTimes() {
        return DICE_TIME;
    }

    public static Character createBeast(int life, int armour) {
            Character bB = null;

            int CreateBeasts = Util.generateRandomNumber(1, 2);
            switch (CreateBeasts) {
            case 1:
                return (Character) (new Goblin(life, armour, GOBLIN));
            case 2:
                return (Character) (new Orc(life, armour, ORC));
            default:
                System.out.println("No Beast Created");
                break;
           }
        return bB;
    }
}
