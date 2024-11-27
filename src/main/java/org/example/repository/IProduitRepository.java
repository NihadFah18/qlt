package org.example.repository;

import org.example.entity.Produit;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface IProduitRepository {
    public Produit save(Produit p);
    public List<Produit> findAll();
    Optional<Produit> finfByRef(Long ref);
    public Produit update(Produit p);
    public void detele(Long ref);
    public List<Produit>   search(Predicate<Produit> predicate);

}
