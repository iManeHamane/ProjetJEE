package models;

import java.lang.annotation.Inherited;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Facture {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private Utilisateur client;
    private double total;
    private Date date;
    public Facture(Utilisateur client) {
        this.client = client;
        this.date = new Date();
    }
    public Utilisateur getClient() {
        return client;
    }
    public void setClient(Utilisateur client) {
        this.client = client;
    }
}
