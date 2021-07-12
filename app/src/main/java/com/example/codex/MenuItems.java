package com.example.codex;

public class MenuItems {
    public Integer MenuFoodImage;
    public String MenuFoodName;

    public MenuItems(Integer menuFoodImage, String menuFoodName) {
        MenuFoodImage = menuFoodImage;
        MenuFoodName = menuFoodName;
    }

    public Integer getMenuFoodImage() {
        return MenuFoodImage;
    }

    public String getMenuFoodName() {
        return MenuFoodName;
    }
}
