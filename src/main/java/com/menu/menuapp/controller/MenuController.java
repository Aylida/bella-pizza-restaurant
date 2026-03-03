package com.menu.menuapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu.menuapp.Food;

@RestController
@RequestMapping("/api")
public class MenuController {
    private List<Food> menu = new ArrayList<>();

 
    	public MenuController() {
    		// MenuController.java - Senin listenin güncellenmiş ve açıklamalı hali

    		
    		    // PİZZALAR (Sonlarına "pizza" kategorisi eklendi)
    		    menu.add(new Food(1L, "Margarita Premium", 185.0, "https://images.unsplash.com/photo-1574071318508-1cdbad80ad50?w=500", "Taze Buffalo Mozzarella, San Marzano Domates Sosu ve Fesleğen.", "pizza"));
    		    menu.add(new Food(2L, "Double Pepperoni", 240.0, "https://images.unsplash.com/photo-1628840042765-356cda07504e?w=500", "Bol Dana Pepperoni, Mozzarella Peyniri ve Özel Baharatlı Sos.", "pizza"));
    		    menu.add(new Food(3L, "Quattro Formaggi", 225.0, "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=500", "Gorgonzola, Parmesan, Mozzarella ve Fontina Peynirlerinin Efsane Uyumu.", "pizza"));
    		    menu.add(new Food(4L, "Bresaola Special", 280.0, "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e?w=500", "Dana Bresaola, Roka, Parmesan Dilimleri ve Balzamik Sirke.", "pizza"));
    		    menu.add(new Food(5L, "Funghi & Truffle", 215.0, "https://images.unsplash.com/photo-1536183380849-094187063428?w=500", "Kültür Mantarı, İstiridye Mantarı ve Mis Kokulu Trüf Yağı.", "pizza"));
    		    menu.add(new Food(6L, "Hot Veggie", 195.0, "https://images.unsplash.com/photo-1576458088443-04a19bb13da6?w=500", "Izgara Sebzeler, Jalapeno Biberi ve Acı Süzme Zeytinyağı.", "pizza"));
    		    menu.add(new Food(7L, "BBQ Chicken", 230.0, "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=500", "Barbekü Soslu Tavuk, Karamelize Soğan ve Mısır.", "pizza"));
    		    menu.add(new Food(8L, "Seafood Marinara", 295.0, "https://images.unsplash.com/photo-1555072956-7758afb20e8f?w=500", "Karides, Kalamar, Sarımsaklı Sos ve Taze Maydanoz Dokunuşu.", "pizza"));
    		    menu.add(new Food(9L, "Anatolian Meat", 260.0, "https://images.unsplash.com/photo-1544982503-9f984c14501a?w=500", "Kayseri Sucuğu, Pastırma, Köy Biberi ve Siyah Zeytin.", "pizza"));
    		    menu.add(new Food(10L, "Pesto Verde", 210.0, "https://images.unsplash.com/photo-1458642849426-cfb724f15ef7?w=500", "Ev Yapımı Fesleğenli Pesto Sos, Çeri Domates ve Buffalo Mozzarella.", "pizza"));
    		    menu.add(new Food(11L, "Spicy Mexicana", 225.0, "https://images.unsplash.com/photo-1590947132387-155cc02f3212?w=500", "Baharatlı Kıyma, Meksika Fasulyesi, Mısır ve Acı Biberler.", "pizza"));
    		    menu.add(new Food(12L, "Smoked Salmon", 310.0, "https://images.unsplash.com/photo-1510629954389-c1e0da47d414?w=500", "Füme Somon Dilimleri, Kapari, Dereotu ve Labne Dokunuşu.", "pizza"));
    		    menu.add(new Food(13L, "Burrata & Basil", 275.0, "https://images.unsplash.com/photo-1588315029754-2dd089d39a1a?w=500", "Bütün Burrata Peyniri, Taze Fesleğen ve Sızma Zeytinyağı.", "pizza"));
    		    menu.add(new Food(14L, "Calzone Classic", 200.0, "https://images.unsplash.com/photo-1541745537411-b8046dc6d66c?w=500", "Kapalı Pizza: Jambon, Mantar, Mozzarella ve Yumurta Sarısı.", "pizza"));
    		    menu.add(new Food(15L, "Tuna Onion", 220.0, "https://images.unsplash.com/photo-1604908176997-125f25cc6f3d?w=500", "Ton Balığı, Kırmızı Soğan, Kapari ve Mozzarella.", "pizza"));
    		    menu.add(new Food(16L, "Beef Carpaccio", 290.0, "https://images.unsplash.com/photo-1506354666786-959d6d497f1a?w=500", "İncecik Dana Carpaccio, Trüf Mayonezi ve Roka.", "pizza"));
    		    menu.add(new Food(17L, "Napolitana", 180.0, "https://images.unsplash.com/photo-1594007654729-407eedc4be65?w=500", "Ançüez, Kapari, Siyah Zeytin ve Domates Sosu.", "pizza"));
    		    menu.add(new Food(18L, "Four Seasons", 245.0, "https://images.unsplash.com/photo-1571066811402-9d8d7759d08c?w=500", "Enginar, Zeytin, Mantar ve Jambonun Dört Mevsim Dansı.", "pizza"));
    		    menu.add(new Food(19L, "Truffle Mushroom", 265.0, "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=500", "Özel Beyaz Sos, Karışık Mantarlar ve Yoğun Trüf Aroması.", "pizza"));
    		    menu.add(new Food(20L, "Garden Fresh", 190.0, "https://images.unsplash.com/photo-1528137884232-ec01f9f1aa55?w=500", "Mevsim Sebzeleri, Mısır, Zeytin ve Taze Baharatlar.", "pizza"));

    		    // İÇECEKLER
    		    menu.add(new Food(21L, "Ev Yapımı Limonata", 45.0, "https://images.unsplash.com/photo-1513558161293-cdaf765ed2fd?w=500", "Taze nane ve zencefil dokunuşuyla.", "drink"));
    		    menu.add(new Food(22L, "Fesleğenli Ayran", 35.0, "https://images.unsplash.com/photo-1626128665085-47372a3e5f01?w=500", "Özel yayık ayranı, taze fesleğen.", "drink"));
    		    menu.add(new Food(23L, "San Pellegrino", 55.0, "https://images.unsplash.com/photo-1543362906-acfc16c67564?w=500", "İtalyan doğal maden suyu.", "drink"));

    		    // TATLILAR
    		    menu.add(new Food(31L, "Tiramisu Classic", 120.0, "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=500", "Mascarpone peyniri ve espresso ile.", "dessert"));
    		    menu.add(new Food(32L, "Çikolatalı Soufflé", 135.0, "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=500", "Belçika çikolatası ve vanilyalı dondurma.", "dessert"));
    		    menu.add(new Food(33L, "Panna Cotta", 110.0, "https://images.unsplash.com/photo-1488477181946-6428a0291777?w=500", "Orman meyveleri sosu eşliğinde.", "dessert"));
    		}
    @GetMapping("/menu")
    public List<Food> getMenu() {
        return menu;
    }
}