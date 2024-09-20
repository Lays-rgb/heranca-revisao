package model;

public class Livro extends Obra {
    private int tiragem;

    public Livro() {
    }

    public Livro(int id, String titulo, String isbn, double valor, int tiragem) {
        super(id, titulo, isbn, valor);
        this.tiragem = tiragem;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }
    //método sobreescrito. O get e o set é pq o valor está na super classe e ela é privada.
    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.3){
            return false;
           }
           double desconto = getValor() * porcentagem;
           super.setValor(super.getValor() - desconto);
           return true;
    }
}
