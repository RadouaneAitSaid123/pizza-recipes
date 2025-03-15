package com.example.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.liste_items, null);

        TextView idp = convertView.findViewById(R.id.idp);
        TextView nom = convertView.findViewById(R.id.pizza_name);
        TextView nbrIngred = convertView.findViewById(R.id.nbr_ingred);
        TextView periode = convertView.findViewById(R.id.periode);
        ImageView photos = convertView.findViewById(R.id.image_pizza);

        idp.setText(String.valueOf(produits.get(position).getId()));
        nom.setText(produits.get(position).getNom());
        nbrIngred.setText(String.valueOf(produits.get(position).getNbrIngredients()));
        periode.setText(produits.get(position).getPeriode());
        photos.setImageResource(produits.get(position).getPhoto());

        return convertView;
    }
}
