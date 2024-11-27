package org.example.entity;

import java.util.Date;

public class ProduitBuilder {
    private Long ref;
    private String nom;
    private double prix;
    private double quantiteStock;
    private Date dateCreation;
    private Date datePremption;
    private TypeProduit type;

    public ProduitBuilder ref(Long ref) {
        this.ref = ref;
        return this;
    }

    public ProduitBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }

    public ProduitBuilder prix(double prix) {
        this.prix = prix;
        return this;
    }

    public ProduitBuilder quantiteStock(double quantiteStock) {
        this.quantiteStock = quantiteStock;
        return this;
    }

    public ProduitBuilder dateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
        return this;
    }

    public ProduitBuilder datePremption(Date datePremption) {
        this.datePremption = datePremption;
        return this;
    }

    public ProduitBuilder type(TypeProduit type) {
        this.type = type;
        return this;
    }
    public Produit build(){
        return new Produit(ref,nom,prix,quantiteStock,
                      dateCreation,datePremption,type);
    }
}
