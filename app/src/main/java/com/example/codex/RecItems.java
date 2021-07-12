package com.example.codex;

public class RecItems {
    public Integer RecFoodImage;
    public String RecFoodName;
    public String RecFoodRating;
    public String RecFoodPrice;
    public String RecFoodDescription;

    public RecItems(Integer recFoodImage, String recFoodName, String recFoodRating, String recFoodPrice, String recFoodDescription) {
        RecFoodImage = recFoodImage;
        RecFoodName = recFoodName;
        RecFoodRating = recFoodRating;
        RecFoodPrice = recFoodPrice;
        RecFoodDescription = recFoodDescription;
    }

    public Integer getRecFoodImage() {
        return RecFoodImage;
    }

    public String getRecFoodName() {
        return RecFoodName;
    }

    public String getRecFoodRating() {
        return RecFoodRating;
    }

    public String getRecFoodPrice() {
        return RecFoodPrice;
    }

    public String getRecFoodDescription() {
        return RecFoodDescription;
    }

    //    public RecItems(Integer recFoodImage, String recFoodName, String recFoodRating, String recFoodPrice) {
//        RecFoodImage = recFoodImage;
//        RecFoodName = recFoodName;
//        RecFoodRating = recFoodRating;
//        RecFoodPrice = recFoodPrice;
//    }
//
//    public Integer getRecFoodImage() {
//        return RecFoodImage;
//    }
//
//    public String getRecFoodName() {
//        return RecFoodName;
//    }
//
//    public String getRecFoodRating() {
//        return RecFoodRating;
//    }
//
//    public String getRecFoodPrice() {
//        return RecFoodPrice;
//    }
}
