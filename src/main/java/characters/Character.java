package characters;

import lombok.Getter;
import lombok.Setter;
import util.Util;

@Getter
@Setter
public abstract class Character{
    private int life;
    private int armour;
    private String name;
    private int attack=0;
    private int defaultArmour;

    abstract public int getAlterAttack(Character attack);
    abstract public int getAlterDefense(Character defense);
    abstract public int getDiceTimes();

 public Character(int life, int armour, String name) {
        this.life = life;
        this.armour = armour;
        this.name = name;
        this.defaultArmour = armour;
    }
    public Boolean isAlive() {
        return life > 0;
    }
    public void defend(Character c1){
      this.armour = c1.getAlterAttack(c1)+this.armour;
      if(c1.getAttack()>this.armour){
        this.life = this.life - (c1.getAttack()-this.getArmour());
        if (this.life< 0){
          this.life = 0;
        }
          System.out.println("     "+c1.getName()+" attacked successful. "+this.getName()+
                  " knockout attack "+ (c1.getAttack()-this.armour)+" damage, and now has "+this.getLife()+" life.");
      }

    }
    public void restoreArmourAttack(){
        this.attack = 0;
        this.armour = this.defaultArmour;
    }
    public static void fight(Character attacker, Character defender){
        System.out.println("\n********************** fight Started **********************\n");
        printTwoFighters(attacker, defender);
        int attack = attacker.getAlterAttack(attacker);
        int defense = defender.getAlterDefense(defender);
        int damage = attack - defense;
        if(damage > 0){
            defender.setLife(defender.getLife() - damage);
        }
        attacker.restoreArmourAttack();
        defender.restoreArmourAttack();
        System.out.println("\n********************** END OF ROUND **********************\n");
    }
    public  static  void printTwoFighters(Character attacker, Character defender){
        System.out.println("\n\n*****    Initiating fight    *****\n");
        System.out.println("     " + attacker.getName() + " VS " + defender.getName());
        System.out.println("     " + attacker.getName() + " has " + attacker.getLife() + " life.");
        System.out.println("     " + defender.getName() + " has " + defender.getLife() + " life.");
    };

    public static  void printTwoTeam(Character[] b1, Character[] b2, boolean winner){
        System.out.println("\n\n*****    Team 1    *****\n");
        for(Character c : b1){
            System.out.println("     " + c.getName() + " has " + c.getLife() + " life.");
        }
        System.out.println("\n\n*****    Team 2    *****\n");
        for(Character c : b2){
            System.out.println("     " + c.getName() + " has " + c.getLife() + " life.");
        }


        if(winner){
            System.out.println("     " + b1[0].getName() + " is the winner");
        }else{
            System.out.println("     " + b2[0].getName() + " is the winner");
        }
    }
    public void prepareAttack(Character c){
        if(c instanceof Beast){
            this.attack = Util.diceHighestNumber(this.getDiceTimes(),0  ,90);
        }else
            this.attack = Util.diceHighestNumber(this.getDiceTimes(),0  ,100);
    }

    @Override
    public String toString(){
       //return the name of the character and his life and check if is alive or dead
         return this.getName() + " has " + this.getLife() + " life." + (this.isAlive() ? " is alive." : " is dead.");
    }
}
