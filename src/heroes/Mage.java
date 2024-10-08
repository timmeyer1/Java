package heroes;

public class Mage extends Personnage implements Mouvement, PouvoirMagique {

    @Override
    public void combat() {

    }

    @Override
    public void criDeGuerre() {
        System.out.println("Shazamm!!");
    }

    /*On implémente "Mouvement"*/
    @Override
    public void marcher() {

    }

    @Override
    public void courir() {

    }

    @Override
    public void ramper() {

    }

    @Override
    public void voler() {

    }

    /*On implémente "PouvoirMagique"*/
    @Override
    public void magieFeu() {

    }

    @Override
    public void magieGlace() {

    }
}
