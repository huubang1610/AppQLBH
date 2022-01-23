/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dell G3
 */
public class Category {
    private String idCategory;
    private String fullnameCategory;
    private String nameCategory;

    public Category() {
    }


    public Category(String idCategory, String fullnameCategory, String nameCategory) {
        this.idCategory = idCategory;
        this.fullnameCategory = fullnameCategory;
        this.nameCategory = nameCategory;
    }
    public Category(String idCategory, String fullnameCategory) {
        this.idCategory = idCategory;
        this.fullnameCategory = fullnameCategory;
    }
    

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getFullnameCategory() {
        return fullnameCategory;
    }

    public void setFullnameCategory(String fullnameCategory) {
        this.fullnameCategory = fullnameCategory;
    }

    @Override
    public String toString() {
        return nameCategory;
    }
    
    
    
}
