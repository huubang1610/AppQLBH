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
public class ThongBao {
    private String ThongBao;
    private int id;

    public ThongBao(String ThongBao, int id) {
        this.ThongBao = ThongBao;
        this.id = id;
    }

    public ThongBao() {
    }

    public String getThongBao() {
        return ThongBao;
    }

    public void setThongBao(String ThongBao) {
        this.ThongBao = ThongBao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
