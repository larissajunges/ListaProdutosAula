package com.example.listaprodutos;
import java.util.HashMap;

public class ProdutoController {
    public Produto [] PRODUTO ={  CASACO,TENIS,CAMISA,SANDALIA };

    public HashMap<String, Produto> PRODUTOS_MAP = new HashMap<>();

    public ProdutoController() {
        for (Produto produto: PRODUTO){
            PRODUTOS_MAP.put(String.valueOf(produto.getNome()),produto);
        }
    }

    public  static final Produto CASACO =new Produto("Casaco vermelho",66.90,R.drawable.casaco);
    public  static final Produto TENIS =new Produto("Tenis Feminino",130.45,R.drawable.tenis);
    public  static final Produto CAMISA =new Produto("Camisa básica feminina",34.50,R.drawable.blusa);
    public  static final Produto SANDALIA =new Produto("Sandália marrom",74.00,R.drawable.sandalia);
}
