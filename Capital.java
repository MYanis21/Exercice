package pays;

public class Capital extends Ville {


    // DECLARATION DES ATTRIBUTS
    private String pays;



    // CONSTRUCTEUR  VILLE + NOMBREHABITANT + PAYS ( 3 )
    Capital(String n,int nb,String pays){

        super(n,nb);

        this.pays =pays;

    }


    // CONSTRUCTEUR  VILLE + PAYS   NOMBREHABITANT : INCONNU ( 4 )
    Capital(String n,String pays){

        // SUPER APELLE LE CONSTRUCEUR  2  DE LA CLASSE VILLE
        super(n);
        this.pays= pays;

    }

    // ACCESSEUR GETTER
    public String getPays() {
        return pays;
    }

    // MUTATEUR SETTER
    public void setPays(String pays) {
        this.pays = pays;
    }

    // METHODE AFFICHER DE LA CLASSE MERE ( CLASSE VILLE ) REDEFINI
    public void afficher() {

        // APELLE LA METHODE AFFICHER DE LA CLASSE MERE QU'ON REDEFINIT POUR AJOUTER LE PAYS
        super.afficher();

        if( pays.equals("N")){


            System.out.println("Capital : ");

        }else {
            System.out.println("Capital de : " + pays);

        }

    }
}
