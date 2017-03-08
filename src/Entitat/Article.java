/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitat;

import java.sql.Date;

/**
 *
 * @author sergi
 */
public class Article {
    private Integer id;
    private String nom;
    private String descripcio;
    private Integer familia;
    private Integer preu;
    private Date data;

    public Article(Integer id, String nom, String descripcio, Integer familia, Integer preu, Date data) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.familia = familia;
        this.preu = preu;
        this.data = data;
    }

    public Article(Integer id) {
        this.id = id;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Integer getFamilia() {
        return familia;
    }

    public void setFamilia(Integer familia) {
        this.familia = familia;
    }

    public Integer getPreu() {
        return preu;
    }

    public void setPreu(Integer preu) {
        this.preu = preu;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", nom=" + nom + ", descripcio=" + descripcio + ", familia=" + familia + ", preu=" + preu + ", data=" + data + '}';
    }
}
