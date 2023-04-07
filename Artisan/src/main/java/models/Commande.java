package main.java.models;

import java.lang.annotation.Inherited;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int num_commande;
    private ArrayList<Article> articles;
    private double total;
    public Commande(int num_commande, ArrayList<Article> articles) {
        this.num_commande = num_commande;
        this.articles = articles;
    }
    public int getNum_commande() {
        return num_commande;
    }
    public void setNum_commande(int num_commande) {
        this.num_commande = num_commande;
    }
    public ArrayList<Article> getArticles() {
        return articles;
    }
    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
}