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
public class Product {
    private String idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private byte[] avatar;
    private String size;
    private String idCategory;
    private String statusProduct;
    private Double priceProduct;
    private String created_at;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String descriptionProduct, byte[] avatar, String size, String idCategory, String statusProduct, Double priceProduct, String created_at) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.avatar = avatar;
        this.size = size;
        this.idCategory = idCategory;
        this.statusProduct = statusProduct;
        this.priceProduct = priceProduct;
        this.created_at = created_at;
    }

    public Product(String idProduct, String nameProduct, String descriptionProduct, byte[] avatar, String size, String idCategory, String statusProduct, Double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.avatar = avatar;
        this.size = size;
        this.idCategory = idCategory;
        this.statusProduct = statusProduct;
        this.priceProduct = priceProduct;
    }
    
    public Product(String idProduct, String nameProduct, String size ,String statusProduct, Double priceProduct, byte[] avatar) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.avatar = avatar;
        this.size = size;
        this.statusProduct = statusProduct;
        this.priceProduct = priceProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", descriptionProduct=" + descriptionProduct + ", avatar=" + avatar + ", size=" + size + ", idCategory=" + idCategory + ", statusProduct=" + statusProduct + ", priceProduct=" + priceProduct + ", created_at=" + created_at + '}';
    }
    
    
}

