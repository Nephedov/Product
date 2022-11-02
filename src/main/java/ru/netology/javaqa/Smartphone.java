package ru.netology.javaqa;

public class Smartphone extends Product {
    public String getManufacturer() {
        return manufacturer;
    }

    protected String manufacturer;

    public Smartphone(int id, String name, int cost, String manufacturer) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return getName().contains(search);
        } else {
            return getManufacturer().contains(search);
        }

    }
}
