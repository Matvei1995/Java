import java.util.Scanner;
import com.exemple.classe.Habitation;
import com.exemple.classe.Vehicule;

public class Main {
    public static void main(String[] args) {
        // Création d'objets Vehicule
        Vehicule vehicule1 = new Vehicule("Voiture", 4, 80);
        Vehicule vehicule2 = new Vehicule("Moto", 2, 100);

//        // Appel de la méthode plusRapide
//        System.out.println("Le véhicule le plus rapide est : " + vehicule1.plusRapide(vehicule2));
//
//
//        // Création d'objets Vehicule
//        Vehicule vehiculen1 = new Vehicule("Voiture", 4, 80);
//        Vehicule vehiculen2 = new Vehicule("Moto", 2, 100);
//        Vehicule vehiculen3 = new Vehicule("Camion", 6, 60);
//
//        // Détection du type de véhicule
//        System.out.println(vehiculen1.getNom() + " est de type " + vehiculen1.detect());
//        System.out.println( vehiculen2.getNom() + " est de type " + vehiculen2.detect());
//        System.out.println( vehiculen3.getNom() + " est de type " + vehiculen3.detect());
//
//        // Application de la méthode boost
//        vehiculen1.boost();
//        vehiculen2.boost();
//        vehiculen3.boost();

//        // Affichage de la nouvelle vitesse
//        System.out.println("La nouvelle vitesse de " + vehiculen1.getNom() + " est de " + vehiculen1.getVitesse() + " km/h");
//        System.out.println("La nouvelle vitesse de " + vehiculen2.getNom() + " est de " + vehiculen2.getVitesse() + " km/h");
//        System.out.println("La nouvelle vitesse de " + vehiculen3.getNom() + " est de " + vehiculen3.getVitesse() + " km/h");
//    }


//        Habitation habitation1 = new Habitation("La Maison de Marc", 10.5, 8.2,2);
//        Habitation habitation2 = new Habitation("L'Appartement de Benoit", 6.3, 4.8,2);
//
//        // Affichage de la surface de chaque habitation
//        System.out.println(habitation1.getNom() + " a une surface de : " + habitation1.surface() + " m²");
//        System.out.println(habitation2.getNom() + " a une surface de : " + habitation2.surface() + " m²");
//        System.out.println("le résultat est égal" +addition(10,25));
//
//        System.out.println("le résultat de la soustraction est égal" +soustraction(50,25, 10));
//
//        System.out.println("la moyenne est égal" +moyenne(50,25,10,8));
//        System.out.println("les nombre sont intervertie" + intevertir(10,54) );
//        lecture();
//        carrez();
//          System.out.println(somme());
//          System.out.println(sommeV2());
//          System.out.println(somme3nmbr());
//        System.out.println(lireTTC());
//        System.out.println(posOrNot());
//        System.out.println(posOrNotV2());
//        System.out.println(displayCategory());
        //System.out.println("Le nombre choisi est : " + demanderNombre());
       // System.out.println("Le nombre choisi est : " + demanderNombreEntre10Et20());
//       // afficherDixNombresSuivants();
//        System.out.println("La valeur minimale est : " + trouverValeurMinimale());
//        System.out.println("La valeur maximale est : " + trouverValeurMaximale());
        //System.out.println(trouverValeurMoyenne());
    }

    public static int addition(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }

    public static int soustraction(int i, int j, int k) {
        return i - j - k;
    }

    public static int moyenne(int i, int j, int k, int l) {
        // Calculer la somme des nombres
        int somme = i + j + k + l;

        // Diviser la somme par le nombre de nombres (4)
        int moyenne = somme / 4;

        // Retourner la moyenne
        return moyenne;
    }

    public static String intevertir(int i, int j) {
        int tmp = i;
        i = j;
        j = tmp;
        return "La nouvelle valeur de i est : " + i + " et la nouvelle valeur de j est :  " + j;
    }

    public static void lecture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        //Récupérer le nombre saisie
        int nbr = scanner.nextInt();
        System.out.println("Vous avez saisie : " + nbr);
    }

    public static int carrez() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre : ");

        // Assignation de la valeur saisie dans une variable nombre
        int nombre = scanner.nextInt();
        int carre = nombre * nombre;
        // Consommation du retour à la ligne
        scanner.nextLine();
        // Afficher le résultat
        System.out.println("Le carré de " + nombre + " est " + carre);
        // Renvoi en sortie le nombre saisi précédemment
        return nombre;
    }

    //méthode qui demande 2 nombres et retourne la somme de ceux-ci
    public static int somme() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr2 = scanner.nextInt();
        return nbr + nbr2;
    }

    //méthode pour additionner 2 nombres (version en utilisant la méthode lecture)
    public static int sommeV2() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        nbr += scanner.nextInt();
        return nbr;
    }

    public static int somme3nmbr() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr2 = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        int nbr3 = scanner.nextInt();
        return nbr + nbr2 + nbr3;
    }

    public static float lireTTC() {
        Scanner scanner = new Scanner(System.in);
        double prixHT, quantite, tauxTVA, prixTTC;

        // Lecture du prix HT
        System.out.print("Veuillez entrer le prix HT : ");
        prixHT = scanner.nextDouble();

        // Lecture de la quantité
        System.out.print("Veuillez entrer la quantité : ");
        quantite = scanner.nextDouble();

        // Lecture du taux de TVA
        System.out.print("Veuillez entrer le taux de TVA (en %) : ");
        tauxTVA = scanner.nextDouble();

        // Calcul du prix TTC
        prixTTC = prixHT * (1 + tauxTVA / 100) * quantite;

        // Affichage du résultat
        System.out.println("Le prix TTC est de : " + prixTTC + " €");
        return lireTTC();
    }
//    public static String posOrNot() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nombre ");
//        int nbr1 = scanner.nextInt();
//        System.out.println("Veuillez saisir le second nombre");
//        int nbr2 = scanner.nextInt();
//
//        //test si les 2 sont positif ou les 2 sont négatif => produit positif
//        if((nbr1 <0 && nbr2 < 0) || (nbr1 > 0 && nbr2 > 0)) {
//            return "Le produit de nbr 1  : " + nbr1 + " et nbr 2 : " + nbr2 + " est positif";
//        }
//        //cas ou un des 2 est négatif => produit négatif
//        return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est négatif";
//    }
//    public static String posOrNotV2() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nombre ");
//        int nbr1 = scanner.nextInt();
//        System.out.println("Veuillez saisir le second nombre");
//        int nbr2 = scanner.nextInt();
//
//        //test si les 2 sont positif ou les 2 sont négatif => produit positif
//        if ((nbr1 <0 && nbr2 < 0) || (nbr1 > 0 && nbr2 > 0)) {
//            return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est positif";
//        }
//        if ((nbr1 <0 && nbr2 > 0) || (nbr1 > 0  && nbr2 < 0)) {
//            return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est négatif";
//        }
//        //cas ou un des 2 est vaut zero => produit vaut 0
//        return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est null";
//    }

    //EX 10
    public static String displayCategory() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre âge");
        int age = scanner.nextInt();;

        switch(age) {
            case 6:
            case 7:
                System.out.println("Votre catégorie est Poussin");
                break;
            case 8:
            case 9:
                System.out.println("Votre catégorie est Pupille");
                break;
            case 10:
            case 11:
                System.out.println(" Votre catégorie est Minime");
                break;
            default:
                if (age >= 12) {
                    System.out.println("Votre catégorie est Cadet");
                } if(age <6){
                System.out.println("Vous êtes trop jeune");
            }else {
                    System.out.println("Âge non valide");
                }

        }
        return displayCategory();
    }
//EXO 11
    public static String minutes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minute = scanner.nextInt();
        minute++;
        if(minute>59){
            minute = 0;
            heure++;
        }
        if(heure>23){
            minute = 0;
            heure = 0;
        }
        return "Dans 1 minute il sera : " + heure + "h" + minute;
    }
    //EXO 12
    public static String secondes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minute = scanner.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int seconde = scanner.nextInt();
        seconde++;
        if(seconde>59){
            seconde = 0;
            minute++;
        }
        if(minute>59){
            minute = 0;
            heure++;
        }
        if(heure>23){
            minute = 0;
            heure = 0;
        }
        return "Dans 1 seconde il sera : " + heure + "h" + minute + ":" + seconde;

    }

    //EXO 13
    public static String photocopier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de photocopie à facturer");
        float total = 0;
        int nbr = scanner.nextInt();
        if(nbr <=10) {
            total = (float) (nbr*0.1);
        }
        if(nbr <= 20){
            total = (float) ((nbr-10)*0.09 + 1);
        }
        if(nbr > 20) {
            total = (float) ((nbr-20)*0.08 +1.90);
        }
        return "Le prix total à payer est de : " + total + "€";
    }
    //EXO 14
    public static int demanderNombre() {
        // Déclaration du scanner
        Scanner scanner = new Scanner(System.in);

        // Boucle pour demander le nombre jusqu'à ce qu'il soit valide
        int nombre;
        do {
            System.out.print("Veuillez entrer un nombre entre 1 et 3 : ");
            nombre = scanner.nextInt();
        } while (nombre < 1 || nombre > 3);

        // Retour du nombre
        return nombre;
    }



    //Exo 15
    public static int demanderNombreEntre10Et20() {

        Scanner scanner = new Scanner(System.in);

        // Boucle pour demander le nombre jusqu'à ce qu'il soit valide
        int nombre;
        do {
            System.out.print("Veuillez entrer un nombre entre 10 et 20 : ");
            nombre = scanner.nextInt();

            // Affichage d'un message d'erreur si le nombre est invalide
            if (nombre < 10) {
                System.out.println("Plus grand !");
            } else if (nombre > 20) {
                System.out.println("Plus petit !");
            }
        } while (nombre < 10 || nombre > 20);

        // Retour du nombre
        return nombre;
    }

    //EXO 16
    public static void afficherDixNombresSuivants() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre: ");
        int nombreDepart = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombreDepart + i);
        }
    }
    //Corection de Exo 16 et 17
    public static void dixSuivant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(nbr + i + 1);
        }
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        System.out.println("Table de multiplication de  : "  + nbr);
        for (int i = 1; i < 11 ; i++) {
            System.out.println(nbr + " x " + (i) + " = " + (nbr * i));
        }
    }
    //Correction Exo 18
//    public static void somme() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nombre");
//        int nbr = scanner.nextInt();
//        int total = 0;
//        for (int i = 1; i < nbr + 1 ; i++) {
//            total += i;
//        }
//        System.out.println("La somme est égal à " + total);
//    }

//    public static int trouverValeurMinimale() {
//        int[] tab = {10, 33, 56, 89, 7, 11, 2, 16};
//
//        int min = tab[0];
//
//        for (int i = 1; i < tab.length; i++) {
//            if (tab[i] < min) {
//                min = tab[i];
//            }
//        }
//        return min;
//    }
//
//    public static int trouverValeurMaximale() {
//        int[] tab = {10, 33, 56, 89, 7, 11, 2, 16};
//
//        int max = tab[0];
//
//        for (int i = 1; i < tab.length; i++) {
//            if (tab[i] > max) {
//                max = tab[i];
//            }
//        }
//        return max;
//    }
//
//    //ex 21
//    public static String tabMoyenne(int [] tab) {
//        int somme = 0;
//        for (int i = 0; i < tab.length ; i++) {
//            somme += tab[i];
//        }
//        return "La moyenne est de : " + somme/ tab.length;
//    }
//




}











