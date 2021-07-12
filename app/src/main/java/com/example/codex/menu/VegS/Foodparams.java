package com.example.codex.menu.VegS;

public class Foodparams {
    public Integer Imagef;
    public String Namef;
    public String Ratingf;
    public String Pricef;
    public String Descriptionf;

    public Foodparams(Integer imagef, String namef, String ratingf, String pricef, String descriptionf) {
        Imagef = imagef;
        Namef = namef;
        Ratingf = ratingf;
        Pricef = pricef;
        Descriptionf = descriptionf;
    }

    public Integer getImagef() {
        return Imagef;
    }

    public String getNamef() {
        return Namef;
    }

    public String getRatingf() {
        return Ratingf;
    }

    public String getPricef() {
        return Pricef;
    }

    public String getDescriptionf() {
        return Descriptionf;
    }

    //    public Foodparams(Integer imagef, String namef, String ratingf, String pricef) {
//        Imagef = imagef;
//        Namef = namef;
//        Ratingf = ratingf;
//        Pricef = pricef;
//    }

//    public Integer getImagef() {
//        return Imagef;
//    }
//
//    public String getNamef() {
//        return Namef;
//    }
//
//    public String getRatingf() {
//        return Ratingf;
//    }
//
//    public String getPricef() {
//        return Pricef;
//    }
}
