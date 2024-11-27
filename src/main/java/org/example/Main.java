package org.example;

import org.example.entity.Produit;
import org.example.entity.ProduitBuilder;
import org.example.entity.ProduitBuilder1;
import org.example.entity.TypeProduit;
import org.example.repository.ProduitRepositoryImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Produit p1=new ProduitBuilder()
                .ref(1L)
                .nom("Yaourt")
                .prix(10.23)
                .dateCreation(new Date())
                .type(TypeProduit.Neutritif)
                .build();

        System.out.println(p1.toString());*/
        //ProduitRepositoryImpl pri=new ProduitRepositoryImpl();
        // ceartion d'un singleton
        ProduitRepositoryImpl pri=ProduitRepositoryImpl.getInstence();

        System.out.println("=====================Afficher tous les produits===========================");
        List<Produit> prds=pri.findAll();
        for (Produit p:prds)
            System.out.println(p.toString());

        System.out.println("=====================Ajouter un nouveau produit===========================");
        Produit p=new ProduitBuilder()
                  .nom("Lait")
                   .prix(10)
                  .quantiteStock(500)
                  .type(TypeProduit.Neutritif)
                  .build();
        pri.save(p);
        for (Produit p1:pri.findAll())
            System.out.println(p1.toString());

        System.out.println("=====================Chercher un Produit===========================");
        Optional<Produit> prd=pri.finfByRef(4L);
        if(prd.isPresent())
            System.out.println(prd.toString());

        System.out.println("=====================Modifier un Produit===========================");
        Produit p2=new ProduitBuilder()
                .ref(4L)
                .nom("Lait")
                .prix(13)
                .quantiteStock(1500)
                .type(TypeProduit.Neutritif)
                .build();
        pri.update(p2);
        for (Produit p1:pri.findAll())
            System.out.println(p1.toString());
        System.out.println("=====================Supprimer un Produit===========================");
        pri.detele(4L);
        for (Produit p1:pri.findAll())
            System.out.println(p1.toString());

        System.out.println("=====================chercher un Produit===========================");
       List<Produit> prds1=pri.search(
               new Predicate<Produit>() {
                   @Override
                   public boolean test(Produit p) {
                       return (p.getType().equals(TypeProduit.Cosmitique)
                               && p.getQuantiteStock()>80);
                   }
               }
       );
        for (Produit p1:prds1)
            System.out.println(p1.toString());

    }





}