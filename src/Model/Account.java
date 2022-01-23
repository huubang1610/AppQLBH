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
public class Account {
    private String idUser;
    private String userName;
    private String passWord;
    private String fullName;
    private String position;
    private String sex;
    private int age;
    private String email;
    private byte[] avatar;
    private String cccd;
    private String address;
    private String date;

    public Account() {
    }

    public Account(String idUser, String userName, String passWord, String fullName, String position, int age, String email, byte[] avatar, String cccd, String address, String date,String sex) {
        this.idUser = idUser;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.email = email;
        this.avatar = avatar;
        this.cccd = cccd;
        this.address = address;
        this.date = date;
        this.sex = sex;
    }
    
    public Account(String idUser, String userName, String passWord, String fullName, String position, int age, String email, byte[] avatar, String cccd, String address,String sex) {
        this.idUser = idUser;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.email = email;
        this.avatar = avatar;
        this.cccd = cccd;
        this.address = address;
        this.sex = sex;
    }

    public Account(String userName, String passWord, String fullName, String email, byte[] avatar, String address) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.email = email;
        this.avatar = avatar;
        this.address = address;
    }
    
    

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    

    @Override
    public String toString() {
        return "Account{" + "idUser=" + idUser + ", userName=" + userName + ", passWord=" + passWord + ", fullName=" + fullName + ", sex=" + sex +", position=" + position + ", age=" + age + ", email=" + email + ", avatar=" + avatar + ", cccd=" + cccd + ", address=" + address + ", date=" + date + '}';
    }
    
    
    
}
