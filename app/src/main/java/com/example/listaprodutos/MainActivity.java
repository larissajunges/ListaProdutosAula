package com.example.listaprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        ArrayList<Produto> arrayList = new ArrayList<Produto>();

        ProdutosController produtoController = new ProdutosController();

        ProdutoAdapter adapter = new ProdutoAdapter(
                getApplicationContext(),
                R.layout.list_item_produto,
                produtoController.PRODUTO
        );


    }
}
