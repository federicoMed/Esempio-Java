package com.company;

public class Book extends Item{

    private int Npage;
    private String Editor;
    private String Titolo;
    private String Autore;

    public Book(float price, int quantity, String type){
        super(price, quantity, type);
    }

    public Book(float price, int quantity, String type, int nPage, String editor, String titolo, String autore){

        super(price,quantity,type); //richiamo gli attributi della classe estesa

        this.Npage = nPage;
        this.Editor = editor;
        this.Titolo = titolo;
        this.Autore = autore;
    }


}
