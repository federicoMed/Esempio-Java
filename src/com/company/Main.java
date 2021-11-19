package com.company;

public class Main {

    //Main dove vado a testare
    public static void main(String[] args) {

        //Creo dei prodotti
        Item prodotto1 = new Item(10,2,"Mozzarella");
        Item prodotto2 = new Item( 2, 1, "Mattarello");
        Item prodotto3 = new Item( 3, 1, "Penna Bic");
        Item prodotto4 = new Item( 22, 10, "Banana");
        Item prodotto5 = new Item( 34, 13, "Orologio");


        //creo un carrello e ci aggiungo i prodotti creti
        Cart carrello = new Cart();
        carrello.addItem(prodotto1);
        carrello.addItem(prodotto2);
        carrello.addItem(prodotto3);

        carrello.removeItem(prodotto3);

        System.out.println("\nPrinto i prodotti del carrello");
        carrello.getListOfItem();

        Book casualBook = new Book(1,2,"Mammamia", 200, "Feltrinelli", "La peste", "Albert Camous");


        carrello.addItem(casualBook);

        System.out.println("\n\n Il prezzo totale del carrello e': "+carrello.getTotalPrice());

        System.out.println("\n\n Il numero totale dei prodotti nel carrello e': "+carrello.getNumberOfElement());



    }
}
