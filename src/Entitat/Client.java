/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitat;

import java.util.Date;

/**
 *
 * @author bernalastic
 */
public class Client {
    private Integer id;
    private String nom;
    private String carrer;
    private Date data_naixement;
    private String cognoms;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the carrer
     */
    public String getCarrer() {
        return carrer;
    }

    /**
     * @param carrer the carrer to set
     */
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    /**
     * @return the data_naixement
     */
    public Date getData_naixement() {
        return data_naixement;
    }

    /**
     * @param data_naixement the data_naixement to set
     */
    public void setData_naixement(Date data_naixement) {
        this.data_naixement = data_naixement;
    }

    /**
     * @return the cognoms
     */
    public String getCognoms() {
        return cognoms;
    }

    /**
     * @param cognoms the cognoms to set
     */
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
    
}
