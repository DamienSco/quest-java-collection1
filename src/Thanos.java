import java.util.*;

public class Thanos {

  public static void main(String[] args) {

    // TODO 1 : Create an empty heroes list
    ArrayList<Hero> heroes = new ArrayList<>();

    // TODO 2 : Add those heroes to the list
    heroes.add(new Hero("Black Widow", 34));
    heroes.add(new Hero("Captain America",100));
    heroes.add(new Hero("Vision",3));
    heroes.add(new Hero("Iron Man",48));
    heroes.add(new Hero("Scarlet Witch",29));
    heroes.add(new Hero("Thor",1500));
    heroes.add(new Hero("Hulk",49));
    heroes.add(new Hero("Doctor Strange",42));

    System.out.println("Voici la liste de nos héros dans l'ordre :");
    for (Hero heroesList : heroes) {
      System.out.println(heroesList.getName());
    };

    // TODO 3 : It's Thor birthday, now he's 1501
    Hero thor = new Hero("Thor",1500);
    thor.setAge(1501);  // set Thor âge à 1501 ans
    System.out.println(thor.getName()+" célèbre ses " + thor.getAge() + " ans.");

    // TODO 4 : Shuffle the heroes list
    System.out.println("Voici la liste de nos héros dans le désordre :");
    Collections.shuffle(heroes);
    for (Hero shuffleList : heroes) {
      System.out.println(shuffleList.getName());
    }

    // TODO 5 : Keep only the half of the list
    for (int i = 0 ; i< heroes.size() ; i++) {
      heroes.remove(i);

    }    // TODO 6 : Loop throught the list and display the name of the remaining heroes
    for (Hero aliveHero : heroes) {
      System.out.println(aliveHero.getName() + " fait partie des survivants du pouvoir destructeur Thanos .");
    }
  }
}
