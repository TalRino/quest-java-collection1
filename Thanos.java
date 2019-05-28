import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero blackwidow = new Hero("Black Widow", 34);
        Hero captainamerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironman = new Hero("Iron Man", 48);
        Hero scarletwitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderman = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorstrange = new Hero("Doctor Strange", 42);

        heroes.add(blackwidow);
        heroes.add(captainamerica);
        heroes.add(vision);
        heroes.add(ironman);
        heroes.add(scarletwitch);
        heroes.add(thor);
        heroes.add(spiderman);
        heroes.add(hulk);
        heroes.add(doctorstrange);

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        ArrayList<Hero> halfList = new ArrayList<>(heroes.subList(0, (heroes.size()/2)));

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero remaining : halfList){
            System.out.println(remaining.getName());
        }
    }
}