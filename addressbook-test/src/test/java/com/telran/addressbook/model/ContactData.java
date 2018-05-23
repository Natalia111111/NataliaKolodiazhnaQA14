package com.telran.addressbook.model;

public class ContactData {

    private  String fname;
    private  String LName;
      private  String add;
    private  String tel;

    public ContactData setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public ContactData setLName(String LName) {
        this.LName = LName;
        return this;
    }

    public ContactData setAdd(String add) {
        this.add = add;
        return this;
    }

    public ContactData setTel(String tel) {
        this.tel = tel;
        return this;
    }



    public String getAdd() {
        return add;
    }

    public String getLName() {
        return LName;
    }

    public String getFname() {
        return fname;
    }

    public String getTel() {
        return tel;
    }
}
