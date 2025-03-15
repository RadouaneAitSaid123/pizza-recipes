package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }


    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public List<Produit> finAll() {
        return produits;
    }

    @Override
    public Produit finById(int id) {
        for (Produit p : produits) {
            if (p.getId() == id)
                return p;
        }
        return null;

    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }
}

