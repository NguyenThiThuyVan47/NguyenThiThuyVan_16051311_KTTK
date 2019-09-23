package com.example.student.nguyenthithuyvan_16051311;

public class Film  {
    private String name;
    private String country;
    private int price;

    public Film(String name, String country, int price){
        this.name = name;
        this.country = country;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
