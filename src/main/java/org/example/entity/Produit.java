package org.example.entity;

import java.util.Date;

public class Produit {
    private Long ref;
    private String nom;
    private double prix;
    private double quantiteStock;
    private Date dateCreation;
    private Date datePremption;
    private TypeProduit type;

    public Produit() {
    }

    public Produit(Long ref, String nom, double prix, double quantiteStock, Date dateCreation, Date datePremption, TypeProduit type) {
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
        this.dateCreation = dateCreation;
        this.datePremption = datePremption;
        this.type = type;
    }

    public Long getRef() {
        return ref;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getQuantiteStock() {
        return quantiteStock;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDatePremption() {
        return datePremption;
    }

    public TypeProduit getType() {
        return type;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantiteStock(double quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDatePremption(Date datePremption) {
        this.datePremption = datePremption;
    }

    public void setType(TypeProduit type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "ref=" + ref +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantiteStock=" + quantiteStock +
                ", dateCreation=" + dateCreation +
                ", datePremption=" + datePremption +
                ", type=" + type +
                '}';
    }
}
