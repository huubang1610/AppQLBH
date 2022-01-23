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
public class sale {
    private String name_rank;
    private int sale;

    public sale() {
    }

    public sale(String name_rank, int sale) {
        this.name_rank = name_rank;
        this.sale = sale;
    }

    public String getName_rank() {
        return name_rank;
    }

    public void setName_rank(String name_rank) {
        this.name_rank = name_rank;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "sale{" + "name_rank=" + name_rank + ", sale=" + sale + '}';
    }
    
    
    
}
