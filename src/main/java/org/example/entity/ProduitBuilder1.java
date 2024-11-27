package org.example.entity;

import java.util.Date;

public class ProduitBuilder1 {
    private Long ref;
    private String nom;
    private double prix;
    private double quantiteStock;
    private Date dateCreation;
    private Date datePeremption;
    private TypeProduit type;

    public ProduitBuilder1 ref(Long ref) {
        this.ref = ref;
        return this;
    }

    public ProduitBuilder1 nom(String nom) {
        this.nom = nom;
        return this;
    }

    public ProduitBuilder1 prix(double prix) {
        this.prix = prix;
        return this;
    }

    public ProduitBuilder1 quantiteStock(double quantiteStock) {
        this.quantiteStock = quantiteStock;
        return this;
    }

    public ProduitBuilder1 dateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
        return this;
    }

    public ProduitBuilder1 datePremption(Date datePeremption) {
        this.datePeremption = datePeremption;
        return this;
    }

    public ProduitBuilder1 type(TypeProduit type) {
        this.type = type;
        return this;
    }
    public Produit build(){
       return new Produit(ref,nom,prix,quantiteStock,dateCreation,datePeremption,type);
    }
}
