import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderMan = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(blackWidow);         // index 0
        heroes.add(captainAmerica);     // index 1
        heroes.add(vision);             // index 2
        heroes.add(ironMan);            // index 3
        heroes.add(scarletWitch);       // index 4
        heroes.add(thor);               // index 5
        heroes.add(spiderMan);          // index 6
        heroes.add(hulk);               // index 7
        heroes.add(doctorStrange);      // index 8


        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> newHeroes = heroes.subList(4, 8);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero heroIndex : newHeroes) {
            System.out.println(heroIndex.getName());
        }
    }
}