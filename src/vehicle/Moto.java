package vehicle;

public class Moto extends VehiculeMotorise {
    private boolean estAvecSidecar;

    public Moto(String marque, String modele, String typeCarburant, boolean estAvecSidecar) {
        super(marque, modele, typeCarburant);
        this.estAvecSidecar = estAvecSidecar;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'arrête.");
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Avec sidecar: " + (estAvecSidecar ? "Oui" : "Non"));
    }
}
