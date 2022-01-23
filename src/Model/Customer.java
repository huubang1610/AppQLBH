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
public class Customer {
    private String idCustomer;
    private String fullName;
    private String customerType;
    private String numberPhone;
    private String date;
    private double money;

    public Customer() {
    }

    public Customer(String idCustomer, String fullName, String customerType, String numberPhone, double money, String date) {
        this.idCustomer = idCustomer;
        this.fullName = fullName;
        this.customerType = customerType;
        this.numberPhone = numberPhone;
        this.date = date;
        this.money = money;
    }

    public Customer(String fullName, String numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }
    
    

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" + "idCustomer=" + idCustomer + ", fullName=" + fullName + ", customerType=" + customerType + ", numberPhone=" + numberPhone + ", date=" + date + ", money=" + money + '}';
    }
    
    
    
}
