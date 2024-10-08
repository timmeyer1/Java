public class GestionVehicule {
    public static void main(String[] args) {
        // Création des objets voiture et moto
        vehicle.Voiture voiture = new vehicle.Voiture("Toyota", "Corolla", "Essence", 4);
        vehicle.Moto moto = new vehicle.Moto("Yamaha", "MT-07", "Essence", false);

        // Tester voiture
        voiture.demarrer();
        voiture.afficherInfo();
        voiture.arreter();

        System.out.println();

        // Tester moto
        moto.demarrer();
        moto.afficherInfo();
        moto.arreter();
    }
}
