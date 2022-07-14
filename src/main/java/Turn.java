import characters.Beast;
import characters.Character;
import characters.Heroe;
import util.Util;

public class Turn {

    private final int BATTALION_SIZE = 5;
    public void initBattalion() {
        Character[] heroesBattalion = new Character[BATTALION_SIZE];
        Character[] beastsBattalion = new Character[BATTALION_SIZE];
        createBattalion(heroesBattalion, 100, 40, true);
        createBattalion(beastsBattalion, 100, 40, false);
        System.out.println("Battalion created");
        getPlayers(heroesBattalion, "beasts Battalion");
        getPlayers(beastsBattalion, "heroes Battalion");
        battleMatch(heroesBattalion, beastsBattalion);
        showStatistics(heroesBattalion, beastsBattalion);
    }

    public void showStatistics( Character[] heroes, Character[] beasts) {
        System.out.println("Statistics");
        getPlayers(heroes, "heroes Battalion");
        getPlayers(beasts, "beasts Battalion");
        Character.printTwoTeam(heroes, beasts,(nextPlayer(heroes, 0)>=0));
    }

    private void battleMatch(Character[] heroes, Character[] beasts) {
        System.out.println("Battle Match");
        System.out.println("----------------------------------------------------");
        System.out.println("getting the team that will attack first");
        boolean beastAttackFirst = Util.generateRandomNumber(0, 1) == 0;
        System.out.println((beastAttackFirst ? "BEASTS" : "HEROES") + " will attack first.\n");
        int armyH = 0;
        int armyB = 0;
        while (true) {
            armyH = nextPlayer(heroes, armyH);
            armyB = nextPlayer(beasts, armyB);

            if ((armyH >= 0) && (armyB >= 0)) {
                if (beastAttackFirst) {
                    turnRound(beasts[armyB], heroes[armyH]);
                } else {
                    turnRound(heroes[armyH], beasts[armyB]);
                }
                armyB++;
                armyH++;
            } else {
                System.out.println(" battle is over ended");
                break;
            }

        }
    }
    public int nextPlayer(Character[] army, int getNextPlayer) {
        int armyGroup = getNextPlayer;
        do {
            if (armyGroup >= army.length) {
                armyGroup = 0;
            }
            if (army[armyGroup].isAlive()) {
                return armyGroup;
            } else {
                armyGroup++;
            }
        } while (armyGroup != getNextPlayer);
        return -1;
    }

    private void turnRound(Character player1, Character player2) {
        System.out.println("match starting.... ");
        Character.fight(player1, player2);
        if (player2.isAlive()) {
            Character.fight(player2, player1);
        } else {
            System.out.println("          " + player2.getName() + " this player is not alive, so he can not attack. ");
        }
        System.out.println("match ended.... ");
    }

    public static void createBattalion(Character[] army, int life, int armour, boolean isHero) {
        for (int i = 0; i < army.length; i++) {
            if (isHero) {
              army[i] =(isHero) ? Heroe.createHero(life,armour)
                      : Beast.createBeast(life,armour);
            }
        }
    }
    public static void getPlayers(Character[] army, String name) {
        for(int i = 0; i < army.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + army[i].getName());
        }
    }
}
