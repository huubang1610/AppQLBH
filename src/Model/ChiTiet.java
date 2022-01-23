/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JSpinner;

/**
 *
 * @author Dell G3
 */
public class ChiTiet {
    private int idChitiet;
    private String idProduct;
    private int numberProduct;
    private double money;
    private int idOrder;
    private String created_at_time;

    public ChiTiet() {
    }

    public ChiTiet(int idChitiet, String idProduct, int numberProduct, double money, int idOrder, String created_at_time) {
        this.idChitiet = idChitiet;
        this.idProduct = idProduct;
        this.numberProduct = numberProduct;
        this.money = money;
        this.idOrder = idOrder;
        this.created_at_time = created_at_time;
    }

    public ChiTiet(String idProduct, int numberProduct, double money, int idOrder, String created_at_time) {
        this.idProduct = idProduct;
        this.numberProduct = numberProduct;
        this.money = money;
        this.idOrder = idOrder;
        this.created_at_time = created_at_time;
    }
    public ChiTiet(String idProduct, int numberProduct, double money, String created_at_time) {
        this.idProduct = idProduct;
        this.numberProduct = numberProduct;
        this.money = money;
        this.created_at_time = created_at_time;
    }

    public ChiTiet(String idProduct, int numberProduct, double money, int idOrder) {
        this.idProduct = idProduct;
        this.numberProduct = numberProduct;
        this.money = money;
        this.idOrder = idOrder;
    }

    public int getIdChitiet() {
        return idChitiet;
    }

    public void setIdChitiet(int idChitiet) {
        this.idChitiet = idChitiet;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getCreated_at_time() {
        return created_at_time;
    }

    public void setCreated_at_time(String created_at_time) {
        this.created_at_time = created_at_time;
    }

    @Override
    public String toString() {
        return "ChiTiet{" + "idChitiet=" + idChitiet + ", idProduct=" + idProduct + ", numberProduct=" + numberProduct + ", money=" + money + ", idOrder=" + idOrder + ", created_at_time=" + created_at_time + '}';
    }

    public void setNumberProduct(JSpinner EditSoLuong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
