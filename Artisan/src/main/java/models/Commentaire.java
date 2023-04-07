package main.java.models;

import java.lang.annotation.Inherited;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String contenu;
    private int id_user;
    private int id_article;
    public Commentaire(String contenu, int id_user, int id_article) {
        this.contenu = contenu;
        this.id_user = id_user;
        this.id_article = id_article;
    }
    public String getContenu() {
        return contenu;
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    public int getId_article() {
        return id_article;
    }
    public void setId_article(int id_article) {
        this.id_article = id_article;
    }
}
