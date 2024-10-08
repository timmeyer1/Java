package vehicle;

public abstract class VehiculeMotorise implements Vehicule {
    protected String marque;
    protected String modele;
    protected String typeCarburant;

    public VehiculeMotorise(String marque, String modele, String typeCarburant) {
        this.marque = marque;
        this.modele = modele;
        this.typeCarburant = typeCarburant;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Type de carburant: " + typeCarburant);
    }

    @Override
    public abstract void demarrer();

    @Override
    public abstract void arreter();
}
