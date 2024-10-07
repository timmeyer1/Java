// on importe java.util.List pour notre test et java.util.ArrayList
// ou sinon import java.util.*
import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // declarer un tableau d'entier int
        int[] ages = { 5, 15, 18, 22, 55 };

        // collections
        List<String> eleves = new ArrayList<String>();
        eleves.add("Nicolas");
        eleves.add("Alexandre");
        eleves.add("Mathieu");

        Set<String> villes = new HashSet<>();
        villes.add("Perpignan");
        villes.add("Bordeaux");
        villes.add("Lyon");

        Map<String, String> chiens = new HashMap<>();
        chiens.put("chien1", "Doberman");
        chiens.put("chien2", "Husky");
        chiens.put("chien3", "Golden Retriever");
        chiens.put("chien4", "Dalmatien");

        // print tableau
        System.out.println("Les ages sont : " + ages);

        // print simple
        System.out.println("Age à l'index 2 : " + ages[2]);

        // get permet de récupérer une valeur
        System.out.println("Eleve à l'index 3 : " + eleves.get(2));

        Iterator iterator = villes.iterator();
        while (iterator.hasNext()) {
            System.out.println("Voici la ville : " + iterator.next());
        }

        for(Map.Entry toutou : chiens.entrySet()) {
            System.out.println("Les chiens sont : " + toutou.getValue() + " " + toutou.getKey());
        }
    }
}