package model;

import java.util.List;

public class Pedido {
    private int id;
    private List<Item> itens;
    
    public Pedido(int id, List<Item> itens) {
        this.id = id;
        this.itens = itens;
    }

    public Pedido() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
