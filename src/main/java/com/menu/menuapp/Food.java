package com.menu.menuapp;

public class Food {
    private Long id;
    private String name;
    private double price;
    private String imageUrl;
    private String description;
    private String category; // "pizza", "drink", "dessert"

    // 1. BOŞ CONSTRUCTOR (HAYATİ ÖNEM TAŞIR!)
    // Spring Boot'un verileri JSON'a çevirirken hata vermemesi için şart.
    public Food() {
    }

    // 2. DOLU CONSTRUCTOR
    public Food(Long id, String name, double price, String imageUrl, String description, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.description = description;
        this.category = category;
    }
    
    // --- GETTER VE SETTER'LAR ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}