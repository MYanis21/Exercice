package pays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String nville;
        int nhabitant;
        String pays;


        // SAISI DES DONNEES
        Scanner saisi = new Scanner(System.in);

        System.out.println("Veuillez saisir le nom de la Ville : ");
        nville = saisi.nextLine();

        System.out.println("Veuillez Saisir le nombre d'habitants " + "\n" + "sinon taper 0 : ");
        nhabitant = saisi.nextInt();

        System.out.println("Veuillez Saisir le pays si cette ville est une capital" + "\n" + "sinon taper N : ");
        pays = saisi.next();


        Capital test = new Capital(nville,nhabitant,pays);
        test.afficher();








       /*// ON CREER UN OBJET a DE TYPE VILLE AVEC LE CONSTRUCTEUR 1
        Ville a = new Ville("Lyon",1500000);
        // ON APELLE UNE METHODE DE L'OBJET a AFFICHER()
        a.afficher();

        // ON CREER UN OBJET b DE TYPE VILLE AVEC LE CONSTRUCTEUR 2
        Ville b = new Ville("Nice");
        // ON APELLE UNE METHODE DE L'OBJET b AFFICHER()
        b.afficher();

        // ON CREER UN OBJET c DE TYPE CAPITAL AVEC LE CONSTRUCTEUR 3
        Capital c = new Capital("Paris",10000000,"France");
        // ON APELLE UNE METHODE DE L'OBJET c AFFICHE()
        c.afficher();

        // ON CREER UN OBJET d DE TYPE CAPITAL AVEC LE CONSTRUCTEUR 4
        Capital d = new Capital("Berlinn","Allemagne");
        // ON APELLE UNE METHODE DE L'OBJET d AFFICHE()
        d.afficher();

*/












    }
}
