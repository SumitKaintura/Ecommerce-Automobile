package com.niit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Automobiles")
public class Automobile {

    @Id
    private int id;
    private String category;
    private String company;
    private String modelName;
    private int price;

    public Automobile() {
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", company='" + company + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }

    public Automobile(int id, String category, String company, String modelName, int price) {
        this.id = id;
        this.category = category;
        this.company = company;
        this.modelName = modelName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
