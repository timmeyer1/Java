public class Main {

    public static void main(String[] args) {

        int age;
        age = 18;
        long caEntreprise = 25600000L;
        boolean isExiste = true;
        char leS = 's';
        char initiale = '\uf224';

        Integer codePorte = 4586;
        String uneChaine= "le soleil brille aujourd'hui";
        Boolean unTest = false;
        Integer moiDansLAvenir = age + 15;


        System.out.println("Bienvenue " + args[0] + " dans le CFA Java !");
        System.out.println("Voici une autre ligne");
        System.out.println("Vous avez " + moiDansLAvenir + " ans");
        System.out.println("Vous avez " + age + " ans");
        System.out.println("Le code de la porte est: " + codePorte.equals(5862));
        System.out.println("unicode: " + initiale);
        System.out.println("Les variables existent: " + isExiste);
        System.out.println(uneChaine);
    }
}