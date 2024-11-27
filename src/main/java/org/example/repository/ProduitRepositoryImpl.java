package org.example.repository;

import org.example.entity.Produit;
import org.example.entity.ProduitBuilder;
import org.example.entity.TypeProduit;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProduitRepositoryImpl implements IProduitRepository{

    private Map<Long,Produit> produits=new HashMap<>();
    private long nbrProduit;

    private static  ProduitRepositoryImpl produitRepository;

    private ProduitRepositoryImpl() {
        init();
    }

    @Override
    public Produit save(Produit p) {
        Long ref=++nbrProduit;
        p.setRef(ref);
        produits.put(ref,p);
        return p;
    }

    @Override
    public List<Produit> findAll() {
        return produits.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Produit> finfByRef(Long ref) {
        Produit prd=produits.get(ref);
        return Optional.of(prd);
    }

    @Override
    public Produit update(Produit p) {
        produits.put(p.getRef(),p);
        return p;
    }

    @Override
    public void detele(Long ref) {
        produits.remove(ref);
    }

    @Override
    public List<Produit> search(Predicate<Produit> predicate) {
        return produits.values().stream().filter(predicate).collect(Collectors.toList());
    }

    private void init(){
        save( new ProduitBuilder()
                .nom("Libre")
                .prix(580.23)
                .type(TypeProduit.Cosmitique)
                .quantiteStock(100)
                .build());
        save( new ProduitBuilder()
                .nom("yaourt")
                .prix(12.45)
                .type(TypeProduit.Neutritif)
                .quantiteStock(300)
                .build());
        save( new ProduitBuilder()
                .nom("Gel Cheveux")
                .prix(100.00)
                .type(TypeProduit.Cosmitique)
                .quantiteStock(50)
                .build());

    }
    public static ProduitRepositoryImpl getInstence(){
        if(produitRepository==null)
            produitRepository=new ProduitRepositoryImpl();
        return produitRepository;
    }
}
