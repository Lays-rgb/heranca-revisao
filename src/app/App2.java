package app;

import java.util.Arrays;

import model.Ebook;
import model.Item;
import model.Livro;
import model.Pedido;
 
public class App2 {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        ebook.setTitulo("Ebook java");
        ebook.setUrlMarcaDagua("https://imagem.com");
        ebook.setValor(100);
        ebook.aplicarDesconto(0.5);

        Livro livro = new Livro();
        livro.setTitulo("Livro java");
        livro.setTiragem(150);
        livro.setValor(100);
        livro.aplicarDesconto(0.3);

        Item item = new Item();
        item.setQuantidade(10);
        item.setObra(ebook);

        Item item2 = new Item();
        item2.setQuantidade(2);
        item2.setObra(livro);

        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setItens(Arrays.asList(item, item2));

        for (Item i : pedido.getItens()){
            System.out.println("Título:" + i.getObra().getTitulo());
            System.out.println("Valor: " + i.getObra().getValor());
        }
    }
}
