package model;

public class Item {
    private int quantidade;
    private Obra obra;

    public Item(int quantidade, Obra obra) {
        this.quantidade = quantidade;
        this.obra = obra;
    }
    public Item() {}

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Obra getObra() {
        return obra;
    }
    public void setObra(Obra obra) {
        this.obra = obra;
    }
}
