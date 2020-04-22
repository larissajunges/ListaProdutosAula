package com.example.listaprodutos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        ArrayList<Produto> arrayList = new ArrayList<Produto>();

        ProdutoController produtoController = new ProdutoController();

        ProdutoAdapter adapter = new ProdutoAdapter(
                getApplicationContext(),
                R.layout.listaprodutos,
                produtoController.PRODUTO
        );


    }
}
