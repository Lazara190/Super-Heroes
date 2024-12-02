public class SarchHeros {
    public static void main(String[] args) {
        Superhero[] heroes = {
            new Superhero("Superman", "Flight", 100),
            new Superhero("Batman", "Martial Arts", 85),
            new Superhero("Wonder Woman", "Super Strength", 90)
        };

        // Loop to display each hero's details
        for (Superhero hero : heroes) {
            hero.displayHero();
        }

        // Example of searching for a hero
        searchHero(heroes, "Batman");

        // Calculate and display average power level
        double averagePower = calculateAveragePower(heroes);
        System.out.println("Average Power Level: " + averagePower);

        // Optional: Sorting heroes by power level
        sortHeroesByPowerLevel(heroes);
    }

    public static void searchHero(Superhero[] heroes, String target) {
        for (Superhero hero : heroes) {
            if (hero.getName().equalsIgnoreCase(target)) {
                hero.displayHero();
                return;
            }
        }
        System.out.println("Hero not found");
    }

    public static double calculateAveragePower(Superhero[] heroes) {
        int sum = 0;
        for (Superhero hero : heroes) {
            sum += hero.getPowerLevel();
        }
        return (double) sum / heroes.length;
    }

    public static void sortHeroesByPowerLevel(Superhero[] heroes) {
        Arrays.sort(heroes, (a, b) -> b.getPowerLevel() - a.getPowerLevel());
        System.out.println("Heroes sorted by power level:");
        for (Superhero hero : heroes) {
            hero.displayHero();
        }
    }
}
