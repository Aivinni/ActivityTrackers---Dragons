public class Dragon {
    private int HP;
    private int strength;
    private int level;
    private boolean dragonDead;
    private int levelProgess = 0;

    public Dragon() {
        HP = 100;
        strength = 1;
        level = 1;
        dragonDead = false;
    }
    public Dragon(int HP, int strength, int level) {
        this.HP = HP;
        this.strength = strength;
        this.level = level;
    }

    public int getHealth() {
        return HP;
    }
    public int getStrength() {
        return strength;
    }
    public int getLevel() {
        return level;
    }
    public boolean isDead() {
        return dragonDead;
    }

    public String state() {
        return "Dragon: \n" +
        "Strength: " + strength + "\n" +
        "Health: " + HP + "\n" +
        "Level: " + level + "\n" +
        "Dead: " + dragonDead + "\n" +
        "Attack Damage: " + levelProgess;
    }
    public void takeDamage(int damage) {
        if (dragonDead) {
            System.out.println("The dragon is already dead!");
        } else {
            HP -= damage;
            System.out.println("The dragon takes " + damage + " damage and now has " + HP + " health.");
            if (HP <= 0) {
                HP = 0;
                dragonDead = true;
                System.out.println("The dragon has been slayed!");
            }
        }
    }
    public int attack() {
        int attack = strength * level;
        levelProgess += attack; 
        System.out.println("The dragon attacks for " + attack + " health points!");
        if (levelProgess >= 50) {
            level++;
            System.out.println("The dragon has reached level " + level + "!");
            levelProgess = 0;
        }
        return attack;
    }
    public void powerUp(int num) {
        if (num == 1) {
            HP *= 2;
            System.out.println("The dragon’s health has increased to " + HP + "!");
        } else if (num == 2) {
            strength *= 2;
            System.out.println("The dragon’s strength has increased to " + strength + "!");
        } else {
            System.out.println("Please enter 1 or 2.");
        }
    }
}
