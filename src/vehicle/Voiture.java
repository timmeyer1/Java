package vehicle;

public class Voiture extends VehiculeMotorise {
    private int nombreDePortes;

    public Voiture(String marque, String modele, String typeCarburant, int nombreDePortes) {
        super(marque, modele, typeCarburant);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête.");
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}
