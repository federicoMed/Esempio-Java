package com.company;

import java.util.ArrayList;

//carrello, dove l'utente inserisce i prodotti scelti. Conterrà una lista di prodotti Item
public class Cart {

    private ArrayList<Item> listOfItem; //lista con solo item

    //Costruttori
    public Cart (){
        this.listOfItem = null;
    }

    public Cart (Item a){
        if(this.listOfItem == null) {
            this.listOfItem = new ArrayList();
            this.listOfItem.add(a);
        }
        else{
            this.listOfItem.add(a);
        }
    }

    //Getter setter
    public void getListOfItem() {
        int count = 0;

        try {
            if (this.listOfItem != null) {
                for (Item next : this.listOfItem) {
                    count++;
                    System.out.println("\nElemento numero " + count + " :");
                    next.getItem();
                }
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }

    public float getTotalPrice(){
        float total = 0;

        if(this.listOfItem == null)
            return total;

        for (Item next : this.listOfItem) {
            total = total + next.getPrice();
        }

        return total;
    }

    public int getNumberOfElement(){
        int total = 0;

        if(this.listOfItem == null)
            return total;

        for (Item next : this.listOfItem) {
            total++;
        }

        return total;
    }

    public void addItem(Item a) {
        if(this.listOfItem == null){
            this.listOfItem = new ArrayList();
            this.listOfItem.add(a);
        }
        else
            this.listOfItem.add(a);
    }

    public void removeItem(Item a){
        if(this.listOfItem != null)
            this.listOfItem.remove(a);
    }
}
