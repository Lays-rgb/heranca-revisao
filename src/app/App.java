package app;

import model.Ebook;
import model.Livro;
import model.Obra;

public class App {
    public static void main(String[] args) {

        Ebook ebook = new Ebook();
        ebook.setTitulo("Java e objetos");
        ebook.setUrlMarcaDagua("https://unsplash.com/capa.png/?width=1024;heigh=1080");
        ebook.setValor(250);
        
        Livro  livro = new Livro();
        livro.setTitulo("Python e Objetos");
        livro.setTiragem(1000);
        livro.setValor(499.99);
        
        System.out.println("Livro" + livro);
        System.out.println("Ebook:" + ebook);

        // polimorfismo
        Obra obra1 = new Ebook();
        obra1.setTitulo("Como ficar rico em uma semana?");

        Obra obra2 = new Livro();
        obra2.setTitulo("Amiga prefere casar com velho, do que onlyfans!");

        System.out.println("Obra1: " + obra1);
        System.out.println("Obra2: " + obra2);
    } 
}
