package models;

import java.lang.annotation.Inherited;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Panier{
    private int id_user;
    private ArrayList<Article> items;
    public Panier(ArrayList<Article> items) {
        this.items = items;
    }
    public ArrayList<Article> getItems() {
        return items;
    }
    public void setItems(ArrayList<Article> items) {
        this.items = items;
    } 


}