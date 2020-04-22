package com.example.listaprodutos;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.widget.ArrayAdapter;

public class ProdutoAdapter extends ArrayAdapter<Produto> {
    Context xcontext;
    int xresource;

    public ProdutoAdapter(Context context, int resource, Produto[] objects) {
        super(context, resource, objects);
        xcontext=context;
        xresource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(xcontext);
        convertView = inflater.inflate(xresource, parent, false);

        TextView textViewNome = convertView.findViewById(R.id.textViewNome);
        TextView textViewPreco = convertView.findViewById(R.id.textViewPreco);
        ImageView imagemProduto = convertView.findViewById(R.id.imagemProduto);

        Produto produto = getItem(position);

        textViewNome.setText(produto.getNome());
        textViewPreco.setText(Double.toString(produto.getPreco()));
        imagemProduto.setImageResource(produto.getImagem());


        return convertView;

    }
}