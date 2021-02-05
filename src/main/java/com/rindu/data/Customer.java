package com.rindu.data;

public class Customer {

    private String idcust;
    private String name;
    private String address;
    private String email;
    private String notelp;

    public Customer(String idcust, String name, String address, String email, String notelp) {
        this.idcust = idcust;
        this.name = name;
        this.address = address;
        this.email = email;
        this.notelp = notelp;
    }

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
}
