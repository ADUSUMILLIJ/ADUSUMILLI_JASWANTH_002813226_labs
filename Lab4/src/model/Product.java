/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class Product {
     private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features=new ArrayList<Feature>();
        
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public Product(ArrayList<Feature> features) {
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public Iterable<Feature> getFeatures1() {
        return features;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public Feature addNewFeature() {
     
    Feature newFeature = new Feature(this);
    newFeature.setName("New Feature"); // Set the name explicitly
    features.add(newFeature);
    return newFeature;

    
    }
    

}
