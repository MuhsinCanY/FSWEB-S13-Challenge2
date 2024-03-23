package org.example.enums;

public enum Plan {
    BASIC("Low",10),
    mid("n1",20),
    high("n1",30);

    private String name;
    private int price;

    Plan() {
        this.name = getName();
        this.price = getPrice();
    }

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
