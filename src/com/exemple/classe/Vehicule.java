package com.exemple.classe;

public class Vehicule {

    // Attributs privés
    private String nom;
    private int nbrRoue;
    private int vitesse;

    // Constructeurs
    public Vehicule() {}

    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    // Méthode boost
    public void boost() {
        this.vitesse += 50;
    }

    // Méthode detect
    public String detect() {
        if (nbrRoue == 2) {
            return "moto";
        } else if (nbrRoue == 4) {
            return "voiture";
        } else {
            return "autre";
        }
    }

    // Méthode plusRapide
    public String plusRapide(Vehicule vehicule) {
        if (this.vitesse > vehicule.vitesse) {
            return this.nom + " (" + this.vitesse + " km/h)";
        } else {
            return vehicule.nom + " (" + vehicule.vitesse + " km/h)";
        }
    }

}
