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
public class Supplier {
    private int idSupplier;
    private String nameSupplier;
    private String number;
    private Double price;
    private String idProduct;
    private String idUser;
    private String created_at;

    public Supplier(int idSupplier, String nameSupplier, String number, Double price, String idProduct, String idUser, String created_at) {
        this.idSupplier = idSupplier;
        this.nameSupplier = nameSupplier;
        this.number = number;
        this.price = price;
        this.idProduct = idProduct;
        this.idUser = idUser;
        this.created_at = created_at;
    }
     public Supplier(String nameSupplier, String number, Double price, String idProduct, String idUser, String created_at) {
        this.nameSupplier = nameSupplier;
        this.number = number;
        this.price = price;
        this.idProduct = idProduct;
        this.idUser = idUser;
        this.created_at = created_at;
    }

    public Supplier(String nameSupplier, String number, Double price, String idProduct, String idUser) {
        this.nameSupplier = nameSupplier;
        this.number = number;
        this.price = price;
        this.idProduct = idProduct;
        this.idUser = idUser;
    }
     

    public Supplier() {
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    
    
}
