package com.example.pizzarecipes.classes;

public class Produit {

    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String detailsIngred;
    private String description;
    private String preparation;
    private String periode;
    private static int count;


    public Produit(String nom, int nbrIngredients, int photo, String periode, String detailsIngred, String description, String preparation) {
        this.id = ++count;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
        this.periode = periode;


    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Produit() {
    }


}
