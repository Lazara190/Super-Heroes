public class Superhero {
   public String name;
   public String ability;
   public powerLevel;

    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public void displayHero() {
        System.out.println("Name: " + name + ", Ability: " + ability + ", Power Level: " + powerLevel);
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getName() {
        return name;
    }

    public String getability(){
        return ability;
    }
}


