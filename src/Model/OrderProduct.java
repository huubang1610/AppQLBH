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
public class OrderProduct {
    private int idOrder;
    private int idCustomer;
    private String idUser;
    private int sale;
    private double totalPrice;
    private String created_at_date;

    public OrderProduct() {
    }

    public OrderProduct(int idOrder, int idCustomer, String idUser, int sale,double totalPrice, String created_at_date) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.idUser = idUser;
        this.sale = sale;
        this.totalPrice = totalPrice;
        this.created_at_date = created_at_date;
    }

    public OrderProduct(int idCustomer, String idUser, int sale, double totalPrice, String created_at_date) {
        this.idCustomer = idCustomer;
        this.idUser = idUser;
        this.sale = sale;
        this.totalPrice = totalPrice;
        this.created_at_date = created_at_date;
    }

    public OrderProduct(int idCustomer, String idUser, int sale, double totalPrice) {
        this.idCustomer = idCustomer;
        this.idUser = idUser;
        this.sale = sale;
        this.totalPrice = totalPrice;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCreated_at_date() {
        return created_at_date;
    }

    public void setCreated_at_date(String created_at_date) {
        this.created_at_date = created_at_date;
    }

    @Override
    public String toString() {
        return "OrderProduct{" + "idOrder=" + idOrder + ", idCustomer=" + idCustomer + ", idUser=" + idUser + ", sale=" + sale + ", totalPrice=" + totalPrice + ", created_at_date=" + created_at_date + '}';
    }

    
    
}
