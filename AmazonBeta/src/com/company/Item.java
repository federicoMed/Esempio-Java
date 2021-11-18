package com.company;

// Gli Item sono i prodotti
public class Item {

    private float price;
    private int quantity = 0;
    private String type;

    //Costruttori
    public Item(){
        this.price = 0;
        this. quantity = 0;
        this.type = null;
    }

    public Item(float price, int quantity, String type) {
        this.price = price;
        this. quantity = quantity;
        this.type = type;
    }


    //Getter Setter
    public void getItem() {
        System.out.println("Prezzo dell'item: "+this.price);
        System.out.println("Quantita: "+this.quantity);
        System.out.println("Tipologia: "+this.type);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return this.price;
    }
}
