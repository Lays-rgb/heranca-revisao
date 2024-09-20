package model;

public class Ebook extends Obra {
    private String urlMarcaDagua;

    public Ebook() {}

    public Ebook(int id, String titulo, String isbn, double valor, String urlMarcaDagua) {
        super(id, titulo, isbn, valor);
        this.urlMarcaDagua = urlMarcaDagua;
    }

    public String getUrlMarcaDagua() {
        return urlMarcaDagua;
    }

    public void setUrlMarcaDagua(String urlMarcaDagua) {
        this.urlMarcaDagua = urlMarcaDagua;
    }

    //tradução: método sobreescrito. O get e o set é pq o valor está na super classe e ela é privada.
    @Override
    public boolean aplicarDesconto(double porcentagem) {
       if (porcentagem > 0.5){
        return false;
       }
       double desconto = getValor() * porcentagem;
       super.setValor(super.getValor() - desconto);
       return true;
    } 
}
