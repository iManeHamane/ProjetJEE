package main.java.models;

import java.lang.annotation.Inherited;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Materiel{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;

    public Materiel(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Materiel other = (Materiel) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (id != other.id) {
                return false;
        }
        return true;
    } 

}