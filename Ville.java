package pays;

public class Ville {

    // DECLARATION DES ATTRIBUTS
    protected String name;
    protected int nbHab;


    // CONSTRUCTEUR VILLE + NOMBREHABITANT ( 1 )
    public Ville(String name,int nbHab){

        this.name = name;
        this.nbHab = nbHab;
    }


    // CONSTRUCTEUR VILLE  ( 2 )
    public Ville (String name){

        this.name = name;
    }


    // METHODE AFFICHER VILLE + NOMBREHABITANT
    public void afficher(){

        if ( nbHab != 0 && nbHab > 0){

        System.out.println("Ville : " + name + " Nombre d'habitants : " + nbHab);

        }else {

            System.out.println("Ville : " + name + " Nombre d'habitants :" + " Inconnu ");
        }




    }



}
