package models;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Article {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 
    private double prix; 
    private double poids;
    private  String details; 
    @ManyToOne
    private Artisan artisan;
    private ArrayList<Materiel> materiaux;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public Artisan getArtisan() {
        return artisan;
    }
    public void setArtisan(Artisan artisan) {
        this.artisan = artisan;
    }
    public ArrayList<Materiel> getMateriaux() {
        return materiaux;
    }
    public void setMateriaux(ArrayList<Materiel> materiaux) {
        this.materiaux = materiaux;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Article other = (Article) obj;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
            return false;
        if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
            return false;
        if (details == null) {
            if (other.details != null)
                return false;
        } else if (!details.equals(other.details))
            return false;
        if (artisan == null) {
            if (other.artisan != null)
                return false;
        } else if (!artisan.equals(other.artisan))
            return false;
        return true;
    }
   


}
