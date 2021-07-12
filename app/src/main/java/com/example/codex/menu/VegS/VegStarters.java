package com.example.codex.menu.VegS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.codex.R;

import java.util.ArrayList;
import java.util.List;

public class VegStarters extends AppCompatActivity {
    RecyclerView recyclerView3;
    LinearLayoutManager linearLayoutManager3;
    List<Foodparams> foodparamsList;
    VegStartersAdapter adapter3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_starters);
        getSupportActionBar().hide();
        Intent intent2 = getIntent();
        Integer pos = intent2.getIntExtra("pos",0);
        String Name = intent2.getStringExtra("CaName");

        TextView nametextView = findViewById(R.id.forward);
        nametextView.setText(Name);
        if(pos==0){
            initData3();
        }
        if(pos==1){
            initData4();
        }
        if(pos==2){
            initData5();
        }
        if(pos==3){
            initData6();
        }
        if(pos==4){
            initData7();
        }
        if(pos==5){
            initData8();
        }
        if(pos==6){
            initData9();
        }
        if(pos==7){
            initData10();
        }
        if(pos==8){
            initData11();
        }
        if(pos==9){
            initData12();
        }
        if(pos==10){
            initData13();
        }
        if(pos==11){
            initData14();
        }

        initRecyclerView3();
    }
    //MOCKTAILS
    private void initData14() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.fruitpunch,"Fruit Punch","4","Rs. 80","Nne of the most popular welcome drinks served at most parties, the Fruit Punch features a delightful blend of colours and flavours."));
        foodparamsList.add(new Foodparams(R.drawable.pinnn,"Pinnacolada","4.6","Rs. 70","Pinnacolada is a cocktail made with rum, cream of coconut or coconut milk, and pineapple juice, usually served either blended or shaken with ice. It may be garnished with either a pineapple wedge, maraschino cherry, or both. There are two versions of the drink, both originating in Puerto Rico."));
        foodparamsList.add(new Foodparams(R.drawable.virginmojito,"Virgin Mojito","4.4","Rs. 125","Most of you may have heard of cocktail Mojito which is an alcohol based drink made of mint leaves, lemon juice and sweetened with sugar. The non-alcoholic version of this drink is known as Virgin Mojito. The base ingredients remain the same that is mint leaves and lemon juice but the alcohol gets replaced with a bubbling drink like club soda, sprite or simply sparkling water."));
        foodparamsList.add(new Foodparams(R.drawable.bluelagoon,"Blue Lagoon","4.7","Rs. 120","Bluer than the bluest waters, the beautiful hue of the Blue Lagoon Cocktail and its invigorating, tropical flavor give vacation vibes wherever you are! The refreshing union of Vodka, Lemonade, and Blue Curacao, makes this cocktail one you can dive right into."));
    }

    //MILKSHAKES
    private void initData13() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.banmilkshake,"Banana Milkshake","3.9","Rs. 80",""));
        foodparamsList.add(new Foodparams(R.drawable.chocoshake,"Chocolate Milkshake","4.8","Rs. 110",""));
        foodparamsList.add(new Foodparams(R.drawable.manshake,"Mango Milkshake","4.5","Rs. 130",""));
        foodparamsList.add(new Foodparams(R.drawable.oreo,"Oreo Milkshake","4.3","Rs. 120",""));
        foodparamsList.add(new Foodparams(R.drawable.straw,"Strawberry Milkshake","4.8","Rs. 130",""));
    }

    //BEVERAGES
    private void initData12() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.sevenup,"7 Up","4","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.sprite,"Sprite","4","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.thumsup,"Thumbs Up","4.2","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.cocacola,"Coca Cola","4.3","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.pepsi,"Pepsi","4.5","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.lemonade,"Lemonade","4.5","Rs. 110",""));
        foodparamsList.add(new Foodparams(R.drawable.coldcoffee,"Cold Coffee","4","Rs. 85",""));
    }

    //DESSERTS
    private void initData11() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.icecream,"Ice Cream(flavour of choice)","4.2","Rs. 45(per scoop)",""));
        foodparamsList.add(new Foodparams(R.drawable.sizzlingbrownie,"Sizzling Brownie","4.7","Rs. 42(per piece)",""));
        foodparamsList.add(new Foodparams(R.drawable.gulabjamun,"Gulab Jamun","4.8","Rs. 20(per piece)",""));
        foodparamsList.add(new Foodparams(R.drawable.rasgulla,"Rasgulla","4.5","Rs. 20(per piece)","Rasgulla is an Indian dessert made of cheese. It basically consists of boiled milk. Rasgulla comes in the form of small, airy white balls that have a sweet flavor."));
        foodparamsList.add(new Foodparams(R.drawable.rasmalai,"Ras Malai","4.2","Rs. 37(per piece)","Ras malai is a rich Indian dessert made with small balls of paneer that are soaked in flavored, thickened milk. It has an interesting combination of flavors and textures, from the spongy soft paneer to the delicately flavored milk."));
        foodparamsList.add(new Foodparams(R.drawable.rabidi,"Rabadi","4.7","Rs. 100(250 gm)","Rabri is a sweet, condensed-milk-based dish, originating from the Indian subcontinent, made by boiling milk on low heat for a long time until it becomes dense and changes its colour to off-white or pale yellow."));
        foodparamsList.add(new Foodparams(R.drawable.jalebi,"Jalebi","4.5","Rs. 100(250 gm)","Jalebi is India’s number one sweet. Jalebi is basically refined flour batter deep fried in oil and then soaked for a few minutes in sugar syrup that has been infused with some really aromatic spices like cardamom powder or Saffron or both etc."));
    }

    //ACCOMPANIMENTS
    private void initData10() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.friedpapad,"Fried Papad","4.3","Rs. 50",""));
        foodparamsList.add(new Foodparams(R.drawable.choppedonionandlemon,"Sliced Onions & Lemon","4","Rs. 30",""));
        foodparamsList.add(new Foodparams(R.drawable.masalapapad,"Papad Masala","4.6","Rs. 80",""));
        foodparamsList.add(new Foodparams(R.drawable.greensalad,"Green Salad","4.5","Rs. 90",""));
        foodparamsList.add(new Foodparams(R.drawable.pudhchuttney,"Pudhina Chuttney","4","Rs. 30",""));
    }

    //BIRYANI
    private void initData9() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.eggbir,"Egg Biryani","4.4","Rs. 250","Long-grained rice (like basmati) flavoured with fragrant spices such as saffron and layered with, eggs. The dish is then covered, its lid secured with dough, and then the biryani is cooked over a low flame."));
        foodparamsList.add(new Foodparams(R.drawable.chickbir,"Chicken Biryani","4.5","Rs. 330","This biryani has mild fragrance, sticky rice, distinct taste of rice with hot and tangy flavour along with soft meat or vegetables."));
        foodparamsList.add(new Foodparams(R.drawable.chickkabbir,"Chicken Kabab Biryani","3.9","Rs. 350","A fragrant and slightly different from the usual kind of biryani, perfect for very special occasions or when you are in the mood to try out something uniquely different from your normal biryani repertoire. This beautiful meal is one that is bursting with flavour and is made up of harmonious layers of perfectly cooked aromatic rice and spicy rich seekh kabab masala."));
        foodparamsList.add(new Foodparams(R.drawable.chickkhembir,"Chicken Keema Biryani","4","Rs. 330","Keema Biryani is the delicious amalgamation of rice with aromatic spices is a delight to relish on. Aromatic biryani made from minced lamb meat (keema), dry fruits, rose water and a wide variety of masalas."));
        foodparamsList.add(new Foodparams(R.drawable.chickrenbir,"Chicken Reshmi Biryani","4.6","Rs. 380","A delicious example of which is this mouth-watering Chicken Reshmi Biryani. A single pot dish of chicken and rice flavoured with a burst of chillies mingling with the aroma of varied spices."));
        foodparamsList.add(new Foodparams(R.drawable.chicktikbir,"Chicken Tikka Biryani","4.8","Rs. 400","Chicken tikka biryani to your recipe log. The smokiness of chicken tikka adds more heat, aroma and flavours to biryani, making it a smashing hit."));
        foodparamsList.add(new Foodparams(R.drawable.mutbir,"Mutton Biryani","4.2","Rs. 390","This mutton biryani recipe has layers of mutton and saffron-milk infused rice cooked 'dum' style. It has a host of aromatic spices and herbs such as star anise, bay leaves, cardamom, cinnamon, cloves, jaiphal, and javitri along with chillies, rose water, kewda and saffron cooked with succulent mutton pieces."));
        foodparamsList.add(new Foodparams(R.drawable.mutkhebir,"Mutton Kheema Biryani","4.5","Rs. 380","Keema Biryani is the delicious amalgamation of rice with aromatic spices is a delight to relish on. Aromatic biryani made from minced lamb meat (keema), dry fruits, rose water and a wide variety of masalas."));
        foodparamsList.add(new Foodparams(R.drawable.prawbir,"Prawns Biryani","4.9","Rs. 420","Prawns cooked in yogurt, spices, onions and layered with rice, makes this dish bursting with flavours and aromatic spices."));

    }

    //RICE
    private void initData8() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.steamedrice,"Steamed Rice","4.5","Rs. 140","Often served as a side dish, steamed rice is also used as an ingredient in main dishes. Steamed rice can be made from any type of long-grained or short-grained rice. Although the only ingredients that are necessary for this dish are water and rice, salt is sometimes added as well."));
        foodparamsList.add(new Foodparams(R.drawable.jeerarice,"Jeera Rice","4","Rs. 170","Jeera rice is a very simple and popular Indian rice and cumin dish that may be served as a main dish or to accompany many varieties of cold and hot side dishes. This dish is probably the easiest to make of the many rice dishes in Indian cuisine."));
        foodparamsList.add(new Foodparams(R.drawable.vegbiryani,"Veg Biryani","4.8","Rs. 290","Vegetable biryani is an aromatic rice dish made with basmati rice, mix veggies, herbs & biryani spices. This easy veg biryani is a total crowd pleaser! You will love this for everything from busy night meals to holiday family dinners."));
        foodparamsList.add(new Foodparams(R.drawable.vegetablepulav,"Veg Pulav","4","Rs. 270","A pulao is a one pot dish of rice and vegetables or a protein cooked together with aromatics (onions, garlic, ginger etc), spices and herbs. There are many variations of making a pulao."));
        foodparamsList.add(new Foodparams(R.drawable.alchobir,"Aloo Cholle Biryani","4.6","Rs. 280","This Chole Biryani Recipe is a biryani with a difference. Instead of the usual combination of vegetables and meat, this one is made with protein packed chickpeas. Packed with proteins and carbohydrates and aromatics, A lip smacking recipe, this Chole Masala Biryani is combination of Chole Chawal put together as a biryani."));
        foodparamsList.add(new Foodparams(R.drawable.cholbir,"Cholle Biryani","4.5","Rs. 290","This Chole Biryani Recipe is a biryani with a difference. Instead of the usual combination of vegetables and meat, this one is made with protein packed chickpeas. Packed with proteins and carbohydrates and aromatics, A lip smacking recipe, this Chole Masala Biryani is combination of Chole Chawal put together as a biryani."));
        foodparamsList.add(new Foodparams(R.drawable.mushpul,"Mushroom Pulav","4.3","Rs. 240","Mushroom Pulav spiced up with green chillies and cinnamon makes a perfect one dish dinner that can be made under an hour. Mushroom as a vegetable might be a little bland and sometimes doesn't please everyone's taste buds. But with the right mix of spices and aromatics, this simple vegetable produces a dish quite scrumptious. All the flavours of the exotic spices infuse into the rice giving this pulav the perfect flavour."));
        foodparamsList.add(new Foodparams(R.drawable.panbir,"Paneer Biryani","4.7","Rs. 280","A traditional Paneer Biryani recipe is a slow cooked layered casserole of paneer cubes in a curd (yogurt) based gravy, fried onions and par-cooked rice flavored with spices, saffron or rose water. Any traditionally made biryani will have separate layers of the gravy and rice, utilizing the dum method of cooking. The rice and gravy layers are slow cooked and steamed in a tightly sealed pan or pot, where the steam is unable to escape."));
        foodparamsList.add(new Foodparams(R.drawable.pantikbir,"Paneer Tikka Biryani","4.7","Rs. 300","A traditional Paneer Biryani recipe is a slow cooked layered casserole of paneer cubes in a curd (yogurt) based gravy, fried onions and par-cooked rice flavored with spices, saffron or rose water. Any traditionally made biryani will have separate layers of the gravy and rice, utilizing the dum method of cooking. The rice and gravy layers are slow cooked and steamed in a tightly sealed pan or pot, where the steam is unable to escape."));
    }

    //BREAD
    private void initData7() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.roti, "Roti", "4", "Rs. 40","Roti(also known as chapati) is a round flatbread native to the Indian subcontinent made from stoneground whole wheat flour, traditionally known as gehu ka atta, and water that is combined into a dough. Roti is consumed in many countries worldwide. Its defining characteristic is that it is unleavened."));
        foodparamsList.add(new Foodparams(R.drawable.naan,"Naan","4.6", "Rs. 90","Naan is cooked in a tandoor, from which tandoori cooking takes its name. This distinguishes it from roti, which is usually cooked on a flat or slightly concave iron griddle called a tava."));
        foodparamsList.add(new Foodparams(R.drawable.butternaan, "Butter Naan", "3.3", "Rs. 100","Butter Naan is cooked in a tandoor, from which tandoori cooking takes its name. This distinguishes it from roti, which is usually cooked on a flat or slightly concave iron griddle called a tava."));
        foodparamsList.add(new Foodparams(R.drawable.cheesegarlicnaan, "Cheese Garlic Naan", "4", "Rs. 130","Cheese Garlic Naan is cooked in a tandoor, from which tandoori cooking takes its name. This distinguishes it from roti, which is usually cooked on a flat or slightly concave iron griddle called a tava."));
        foodparamsList.add(new Foodparams(R.drawable.rumaliroti, "Rumali Roti", "4", "Rs. 80","Rumali Roti is extremely thin and limp, and served folded like a handkerchief. During the Mughal period, Rumali roti was used as a cloth to wipe the grease off the hands at the end of a rich meal."));
        foodparamsList.add(new Foodparams(R.drawable.aloopar,"Aloo Paratha","4.5","Rs. 70","Piping-hot crisp wheat flatbreads stuffed with spiced, faintly sour mashed potatoes stuffing and relished with some tangy sour mango pickle."));
        foodparamsList.add(new Foodparams(R.drawable.butkul,"Butter Kulcha","4","Rs. 50","Butter Kulcha is probably one of the most sough after bread after Naan."));
        foodparamsList.add(new Foodparams(R.drawable.jeeroti,"Jeera Roti","4.2","Rs. 40","A spicy addition to your regular roti or chapati which adds so much flavour to it. You can have this roti as it is or with some yogurt or pickle. Roti (also known as chapati) is a round flatbread native to the Indian subcontinent made from stoneground whole wheat flour, traditionally known as gehu."));
        foodparamsList.add(new Foodparams(R.drawable.lachpa,"Laccha Paratha","4.7","Rs. 80","Laccha means coil or bundle. As this name suggests this paratha is made by coiling dough together. Essentially instead of following the flat-bread approach, here the dough is flattened and then coiled around so that the final paratha becomes layered. This paratha is known in different names, like flaky-paratha, lacchedar parathha, laccha paratha, Kerala-paratha. All of these are essentially the same with slight variations."));
        foodparamsList.add(new Foodparams(R.drawable.missroti,"Missis Roti","4","Rs. 40","A unique and flavoured flatbread recipe made with wheat and chickpea flour. it is popular in north india particularly in punjab and rajasthani cuisine. it is generally served as it as it contains all the necessary spices, but can be served with any choice of north indian creamy curry."));
        foodparamsList.add(new Foodparams(R.drawable.panpar,"Paneer Paratha","4.1","Rs. 70","Paneer paratha is a popular North Indian flatbread made with whole wheat flour dough and stuffed with savory, spiced, grated paneer (Indian cottage cheese) stuffing."));
        foodparamsList.add(new Foodparams(R.drawable.tanroti,"Tandoori Roti","4.1","Rs. 30","Tandoori Roti is an Indian flatbread made of a mix of wheat flour and all-purpose flour (maida). It’s called Tandoori as it is made in a tandoor or a clay oven. You will find this Indian Bread on the menu of every North Indian Restaurant, which is served along with creamy Dals and rich Gravies Roti(also known as chapati) is a round flatbread native to the Indian subcontinent made from stoneground whole wheat flour, traditionally known as gehu ka atta, and water that is combined into a dough."));
    }

    //NON-VEG MAIN COURSE
    private void initData6() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.butterchicken, "Butter Chicken", "4", "Rs. 430","Its mildly spicy, creamy, savoury flavour makes it more than just delicious, but accessible to almost every palate."));
        foodparamsList.add(new Foodparams(R.drawable.tawachicken,"Tawa Chicken","4.6", "Rs. 390","Here Marinated and roasted Tandoori Chicken Pieces are cooked in Spicy Gravy and Home made Garam Masala."));
        foodparamsList.add(new Foodparams(R.drawable.chickendopyaza, "Chicken Dopyaza", "3.3", "Rs. 530","A scrumptious north Indian chicken recipe, Chicken Do Pyaaza is a delight for chicken lovers! Marinated chicken chunks cooked in a variety of spices, yogurt and kasoori methi. This dish is bursting with aromatic flavours and a beautiful, creamy gravy."));
        foodparamsList.add(new Foodparams(R.drawable.kadhaichicken, "Kadhai Chicken", "4", "Rs. 510","Kadhai Chicken is a delicious, spicy & flavorful dish made with chicken, onions, tomatoes, ginger, garlic & fresh ground spices."));
        foodparamsList.add(new Foodparams(R.drawable.chickenkholapuri, "Chicken Kholapuri", "3.7", "Rs. 530","Marinated and then cooked with bay leaf, cinnamon, cloves, black pepper and ground paste, kolhapuri chicken comes out as a delicious winner."));
        foodparamsList.add(new Foodparams(R.drawable.kadhaimuttoncurry, "Kadhai Mutton", "4", "Rs. 510","Kadhai Mutton is a delicious, spicy & flavorful dish made with mutton, onions, tomatoes, ginger, garlic & fresh ground spices."));
        foodparamsList.add(new Foodparams(R.drawable.muttonkorma, "Mutton Korma", "3.8", "Rs. 490","Mutton korma is a dish made by slow cooking mutton along with yogurt, whole spices and spice powders. There are so many ways a korma is made. This is one of the versions that is close to the authentic mughlai dish except for the use of turmeric and coriander powder."));
        foodparamsList.add(new Foodparams(R.drawable.fishtawafry, "Boneless Fish Tawa Masala", "4", "Rs. 550","Fish fry masala or masala fish is a mouth-watering and very tempting fried fish recipe made using fresh fish pieces coming out straight from freshwater. This is the best masala fish recipe where we need to marinate the coated masala fish pieces and then shallow fry them until they turn soft and crisp."));
        foodparamsList.add(new Foodparams(R.drawable.fishcurry, "Boneless Fish Curry", "4.4", "Rs. 530","Fish curry recipe - Simple, delicious & flavourful Indian fish curry in a onion tomato base. Fish is one of the favourite sea foods at home and most times it is the fish fry or the pepper fish."));
        foodparamsList.add(new Foodparams(R.drawable.chickamrimas,"Chicken Amritsari Masala","4.6","Rs. 550","Chicken Masala is an authentic North Indian dish,simply made in the unique amritsari rich and creamy gravy and flavored with fresh cream, butter and fresh tomatoes. Also known as chicken makhani or murgh, this dish is a very well-known recipe in the Indian restaurants. The unique colour of the gravy comes from the tomato puree."));
        //foodparamsList.add(new Foodparams(R.drawable.chikkheema,"Chicken Kheema","4.5","Rs. 520","It represents a rich and flavorful dish made with ground chicken, peas, and a variety of spices. Because keema matar is the most popular meal offered in practically every other restaurant in India and Southeast Asia, there are numerous versions of Chicken keema matar to choose from. They all have one thing in common, though: a highly flavoured base sauce composed with onions, garlic, and other spices."));
        //foodparamsList.add(new Foodparams(R.drawable.chickmas,"Chicken Masala","4.6","Rs. 560","Chicken Masala recipe where chicken is first marinated with a few Indian spices then slowly cooked in a spicy chicken masala made of onion tomato gravy is one of the simplest but mouth-watering chicken masala gravy recipe."));
        foodparamsList.add(new Foodparams(R.drawable.chickmug,"Chicken Mughlai","4.7","Rs. 540","Mughlai chicken is a Mughlai-style chicken curry. In an onion-tomato gravy, a delectable and creamy chicken curry is prepared. Mughlai cuisine is made up of foods that were created during the Mughal Empire's era.Mughlai food is essentially a hybrid of Persian and Indian cuisines.These Mughlai recipes were created for the Royal family (Mughals) and troops, hence there is a lot of meat in them."));
        foodparamsList.add(new Foodparams(R.drawable.chickresmas,"Chicken Reshmi Masala","4.5","Rs. 550","It is a very delicious dish made with chicken. The chicken is soft and melt in mouth as it's marinated with curds and few spices then cooked in a rich creamy gravy."));
        foodparamsList.add(new Foodparams(R.drawable.palchick,"Palak Chicken","4.1","Rs. 520","Tender pieces of boneless chicken breast and spinach leaves simmered in an onion-tomato gravy made creamy with cashews."));
        foodparamsList.add(new Foodparams(R.drawable.kadmut,"Kadhai Mutton","4.2","Rs. 580","Mixture of spices ground into a paste, used in Indian cookery. adjective. Hinglish spicy."));
        foodparamsList.add(new Foodparams(R.drawable.mutkol,"Mutton Kolhapuri","4.3","Rs. 580","Marinated and then cooked with bay leaf, cinnamon, cloves, black pepper and ground paste, kolhapuri mutton comes out as a delicious winner."));
        foodparamsList.add(new Foodparams(R.drawable.mutkor,"Mutton Korma","4.6","Rs. 570","Mixture of spices ground into a paste, used in Indian cookery. adjective. Hinglish spicy."));
        foodparamsList.add(new Foodparams(R.drawable.mutmas,"Mutton Masala","4.9","Rs. 590","Coriander seeds, Cumin, Red Chillies, Turmeric, Black Pepper, Iodised Salt, Dried Ginger, Mustard, Fennel, Seeds, Garlic, Cassia, Fenugreek Leaves, Cardamom Amomum, Cloves, Nutmeg, Green Cardamom, Mace, Asafoetida."));
        //foodparamsList.add(new Foodparams(R.drawable.surgocu,"Surmai Goan Curry","4.3","Rs. 550","The tender fish marinated in lemon and cooked in a rich masaledaar gravy."));
    }
    //VEG MAIN COURSE
    private void initData5() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.dalfry, "Dal Fry", "3.8", "Rs. 230","Dal Fry is a dish that is made in various ways in many Indian homes with tur dal or pigeon pea lentils.If you are new to Indian cuisine, you may think that ‘dal fry’ indicates that some ingredient is being fried or the lentils are fried."));
        foodparamsList.add(new Foodparams(R.drawable.mixveg,"Mix Veg","4.5", "Rs. 290","Mixed vegetable sabzi or mix vegetable recipe is simple home-style Punjabi curry to serve with Roti and paratha. The mix veg recipe is very simple but it makes for a very hearty curry, especially in winters, when we get very good fresh produce in North India. Incredibly easy, healthy, glutenfree and vegan Indian curry recipe."));
        foodparamsList.add(new Foodparams(R.drawable.kadhaipaneer, "Kadhai Paneer", "4.8", "Rs. 300","It is one of the most popular paneer recipes. It’s there on the menu in almost all Indian restaurants. Kadai is a like a wok commonly used in Indian cooking. We use it to make stir fry and all sorts of things. We also use it for deep frying snacks and sweets."));
        foodparamsList.add(new Foodparams(R.drawable.shahipaneer, "Shahi Paneer", "4.5", "Rs. 280","This Shahi Paneer is deliciously rich and creamy, making it one of the most popular recipes in Mughlai cuisine. Fresh, unmelting cheese is married with a creamy gravy, perfect for serving with naan or roti."));
        foodparamsList.add(new Foodparams(R.drawable.vegkolhapuri, "Veg Kholapuri", "4", "Rs. 290","Veg Kolhapuri, a mixed vegetable curry with thick and spicy coconut based gravy, is a popular dish of Maharashtrian cuisine and is often found in almost all north Indian restaurant menus. Kolhapur is famous for growing and farming of hot red chillis and this curry lives up to its name as it has very aromatic and spicy flavor that it gets from a specially blended curry masala powder."));
        foodparamsList.add(new Foodparams(R.drawable.algob,"Aloo Gobi","3.9","Rs. 245","Aloo Gobi is a vegetarian dish from the Indian subcontinent made with potatoes , cauliflower , and Indian spices. It is popular in Indian and Pakistani cuisines. It is yellowish in colour due to the use of turmeric, and occasionally contains kalonji and curry leaves."));
        foodparamsList.add(new Foodparams(R.drawable.alomut,"Aloo Mutter","4.1","Rs. 230","Aloo mutter  is a Punjabi dish from the Indian subcontinent which is made from potatoes and peas in a spiced creamy tomato based sauce. It is a vegetarian dish. The sauce is generally cooked with garlic, ginger, onion, tomatoes, cilantro, cumin seeds and other spices."));
        foodparamsList.add(new Foodparams(R.drawable.baigbhar,"Baingan Bharta","4.2","Rs. 225","Baingan bharta is a vegetarian Indian dish where eggplants are grilled over hot charcoal, mashed and then mixed or cooked with onions, tomatoes & spices. It originated in the Punjab region of the Indian subcontinent & is a very common dish made for regular meals."));
        foodparamsList.add(new Foodparams(R.drawable.bhinmas,"Bhindi Masala","4.3","Rs. 210","Bhindi Masala is a popular and healthy Indian side dish made with bhindi, onion, tomatoes, Indian spices, and herbs. It is one of the easiest side dishes to make and packed with a lot of health benefits."));
        foodparamsList.add(new Foodparams(R.drawable.malkof,"Malai Kofta","4.3","Rs. 215","Malai means cream and kofta are fried balls. So malai kofta literally translates to koftas dunked in a creamy sauce. It is a popular Indian vegetarian dish in which potato paneer balls are served with a delicious, smooth, rich & creamy gravy. It is served with butter naan, roti or with any flavored rice like jeera rice."));
        foodparamsList.add(new Foodparams(R.drawable.matpan,"Matar Paneer","4.2","Rs. 210","Matar paneer is a delicious curry made of paneer cubes and fresh peas cooked in a rich, spicy and tangy gravy. Matar paneer is one of my favorite North Indian dishes. Matar paneer is a popular dish ordered in Indian restaurants and is also a favorite on special occasions and parties."));
        foodparamsList.add(new Foodparams(R.drawable.panbhur,"Paneer Bhurji","3.9","Rs. 220","One of the most popular savoury dishes made with cottage cheese or paneer, especially in the northern part of India, Paneer Bhurji is a great dish to start your day with. The creaminess of Paneer combined with the tanginess of tomatoes and the freshness of lemon and coriander leaves makes for a scintillating gastronomic experience."));
        foodparamsList.add(new Foodparams(R.drawable.panmak,"Paneer Makhanwala","4.5","Rs. 235","Paneer Makhanwala – a popular North Indian, vegetarian dish. Paneer Makhanwala is made by cooking soft paneer cubes in a silky, creamy gravy.This is one of the favourite dishes of many vegetarians and is a ‘must have’ on most party menus. This delicious gravy is quite easy to prepare and is a frequently made paneer."));
        foodparamsList.add(new Foodparams(R.drawable.panpal,"Paneer Palak","4.3","Rs. 200","Palak Paneer is a hearty and nutritious dish that originated in Punjab, a region in North India. It is made with finely-chopped fresh spinach, generously-sized cubes of homemade paneer (a fresh cottage cheese) and topped with blobs of delicious melting village butter."));
        foodparamsList.add(new Foodparams(R.drawable.sarsag,"Sarson Saag","4.5","Rs. 250","Sarson ka saag is an authentic Punjabi winter special with mustard greens as main ingredient. Along with mustard greens, few more select varieties of greens like spinach, chenopodium (bathua), radish greens etc. The ultimate comfort food for winter, also very healthy, this Pumjabi sarsaon da saag is super easy to make."));
        foodparamsList.add(new Foodparams(R.drawable.sochabutmas,"Soya Chap Butter Masala","4.6","Rs. 265","This butter soya chaap contains butter, and cream, hence if you are vegan, swap with vegan butter and cream. This is a soya makhani chaap is a vegetarian recipe, with amazing north-indian flavours, and can be made at home with minimal expertise."));
        foodparamsList.add(new Foodparams(R.drawable.tasub,"Tawa Subzi","4.3","Rs. 255","Tawa Sabzi means array of seasonal veggies that are spread around a hot tawa/griddle and when asked that particular veggie gets all the attention ,it is brought in the center of the griddle; tossed in masala, sprinkled with chaat masala and served to the guests right off the hot tawa."));
        foodparamsList.add(new Foodparams(R.drawable.veghandi,"Veg Handi","4.6","Rs. 265","Veg Handi is a simple mixed vegetable curry recipe, which is prepared with onion, tomato, ginger, garlic and cashew paste. And if you want to go for Jain Version then just leave onion, garlic and ginger in the recipe. And served with roti, naan and rice."));
        foodparamsList.add(new Foodparams(R.drawable.vegmakh,"Veg Makhanwala","4.9","Rs. 300","Veg Makhanwala Recipe is a popular North Indian mixed vegetable gravy that can be served for your everyday meals or even for your Party meals. This recipe has a balanced blend of spices and a creamy texture from cashew nuts and fresh cream that is added to the gravy. You can add any vegetable of your choice to Veg Makhanwala."));
    }

    //NON VEG STARTERS
    private void initData4() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.tandoorichicken, "Chicken Tandoori", "3.7", "Rs. 300","A dish of roasted chicken marinated in yogurt and generously spiced, giving the meat its trademark red colour."));
        foodparamsList.add(new Foodparams(R.drawable.chickentikka,"Chicken Tikka","4.1", "Rs. 330","Dish consisting of marinated boneless chicken pieces that are traditionally cooked in a tandoor and then served in a subtly spiced tomato-cream sauce."));
        foodparamsList.add(new Foodparams(R.drawable.chickenseekhkabab, "Chicken Seekh Kabab", "4", "Rs. 250","Minced mutton and chicken meat, slathered in a bowl of spices and grilled to perfection."));
        foodparamsList.add(new Foodparams(R.drawable.chickpudh,"Chicken Pudhina","4.3","Rs. 300","Delicious, mintalacious, fabulous Hyderabadi cuisine taste of the recipe depends on the green masala paste which is prepared with fresh mint leaves, coconut pieces, and green chilies."));
        foodparamsList.add(new Foodparams(R.drawable.chickcorkab,"Chicken Coriander Kabab","4.5","Rs. 255","Marinated in coriander paste, yogurt and spices, these are easy to make serve a good gathering."));
        foodparamsList.add(new Foodparams(R.drawable.chickhar,"Chicken Haryali","4.3","Rs. 265","Classic North Indian starter where chicken is flavoured with fresh green herbs - mint and coriander leaves along with spices."));
        foodparamsList.add(new Foodparams(R.drawable.chickkalkab,"Chicken Kalmi Kabab","4.2","Rs. 255","Coated in rich and flavoursome marinade, the spices give it a depth of flavour, while the yogurt keeps them succulent and juicy. The kalmi kababs get a distinctive nutty aroma from the addition of cashews. The flavours are rather mild yet the kebabs taste delicious."));
        foodparamsList.add(new Foodparams(R.drawable.chicklah,"Chicken Lahori","4.8","Rs. 275","Made with chicken pieces that are stir-fried with a variety of spices, plain yogurt, onions, garlic, ginger, and tomatoes, and then simmered with water or chicken stock until the meat is fully cooked."));
        foodparamsList.add(new Foodparams(R.drawable.chickpad,"Chicken Pahadi","4.1","Rs. 245","The chicken is cooked tender in a thick yogurt gravy, the masala is made by roasting coriander seeds, cinnamon stick, cloves, fennel seeds and onions and then ground to form paste which is then cooked with chicken."));
        foodparamsList.add(new Foodparams(R.drawable.chickpermas,"Chicken Peri Peri Masala","4.2","Rs. 225","The peri peri sauce is traditionally made with a fiery pepper from Africa called 'pili'. Chicken breasts marinated in a home made version of this sauce and baked perfect."));
        foodparamsList.add(new Foodparams(R.drawable.chickresh,"Chicken Reshmi","4.6","Rs. 275","Made with Pieces of Boneless Chicken Breast, marinated in juicy mixture of Curd, Cream, Cashew nuts and Spices and then Grilled in Oven."));
        foodparamsList.add(new Foodparams(R.drawable.chicksuk,"Chicken Sukka","4.5","Rs. 285","A Mangalorean special semi dry chicken recipe, made using fresh chicken, host of masalas and grated fresh coconut cooked to perfection."));
        foodparamsList.add(new Foodparams(R.drawable.nimchick,"Nimbu Chicken","4.8","Rs. 290","This lemon chicken recipe yields tender chicken bites with a dominant flavor of lemon juice, mint and mild spices. Slightly tangy, mildly hot with full of flavors."));
        foodparamsList.add(new Foodparams(R.drawable.pepchick,"Pepper Chicken","4.2","Rs. 245","It uses minimal ingredients, and yet the result is just lip smacking. This fiery dish from South India is a must-try if you like to eat food that is high on spiciness."));
        foodparamsList.add(new Foodparams(R.drawable.surtik,"Surmai Tikka","4.1","Rs. 265","Fish Tikka is an amazing tikka dish made with fresh surmai fish marinated in an amazing authentic spicy indian mariation."));
    }

    //VEG STARTERS
    private void initData3() {
        foodparamsList = new ArrayList<>();
        foodparamsList.add(new Foodparams(R.drawable.paneertikka,"Paneer Tikka", "4.6", "Rs. 290","Paneer Tikka is a popular and delicious tandoori snack where paneer (Indian cottage cheese cubes) are marinated in a spiced yogurt-based marinade, arranged on skewers and grilled in the oven."));
        foodparamsList.add(new Foodparams(R.drawable.paneerpakoda,"Paneer Pakoda", "4.7", "Rs. 200","Paneer pakoda is a popular pakora variety that you will also find in many Indian restaurants. In our home, we have a ritual once in a month to make assorted pakora with different vegetables and paneer. Mostly potato, cauliflower, onion, spinach and paneer pakoda are on this list."));
        foodparamsList.add(new Foodparams(R.drawable.harabharakabab,"Harabhara Kabab", "4.4", "Rs. 250","Hara Bhara Kabab is a very popular snack of North Indian fried patties made with spinach, peas and potatoes. This word means a kabab full of greens. Here the green colored veggies are spinach and green peas. These are nutritious since they have the best of both spinach and green peas."));
        foodparamsList.add(new Foodparams(R.drawable.achpantik,"Achari Paneer Tikka","4.5","Rs. 225","Achari Paneer Tikka is the most popular vegetarian appetizer in the Punjabi Cuisine. The word achar in Hindi means pickle. Paneer cubes marinated in an achari marinade makes an aromatic, flavorsome party snack. A blend of pickling spices goes into the marinade giving a distinctive flavor to the paneer."));
        foodparamsList.add(new Foodparams(R.drawable.altik,"Aloo Tikki","3.6","Rs. 210","Aloo tikki is a snack originating from the Indian subcontinent ; in North Indian, Pakistani and Bangladeshi preparation, it is made out of boiled potatoes, peas, and various curry spices. \"Aloo\" means potato, and the word \"tikki\" means a small cutlet or croquette in Hindi and Marathi."));
        foodparamsList.add(new Foodparams(R.drawable.chechilkab,"Cheese Chilli Kabab","4.5","Rs. 200","Seekh Kebabs are the “Shaan” of the grillers…and seekh kebabs are simply yumm !! Malai Seekh Kebab is a delicious mutton kebab which is easy to prepare. Mutton seekh kebab with cheese gives an unique flavor and a delicious melt in the mouth."));
        foodparamsList.add(new Foodparams(R.drawable.cheeseballs,"Cheese Balls","4.6","Rs. 230","Cheese balls are a delicious crispy snack made with potato, cheese, herbs and spices. Potato cheese balls make for a great party snack."));
        foodparamsList.add(new Foodparams(R.drawable.mushtik,"Mushroom Tikka","3.9","Rs. 235","Mushroom tikka is one such recipe, prepared with marinated button mushrooms with other diced vegetables like capsicum and onions. it is best served with dahi mint chutney or green chutney but can also be eaten without any dips."));
        foodparamsList.add(new Foodparams(R.drawable.pancutlet,"Paneer Cutlet","4.0","Rs. 245","Snack recipe using paneer which is mildly spiced and absolutely healthy is paneer cutlet. It has soft and melt-in-mouth inside and crisp and crunchy outside. Paneer cutlets can be prepared quickly and without many ingredients. Paneer cutlets can also be used to make wholesome burgers."));
        foodparamsList.add(new Foodparams(R.drawable.panchepak,"Paneer Cheese Pakora","4.0","Rs. 200","Paneer pakora is a popular evening snack from North Indian cuisine. It is made by batter frying Indian cottage cheese aka paneer. These turn out delicious and mildly spicy. Paneer pakora are usually served with green chutney or red chilli chutney."));
        foodparamsList.add(new Foodparams(R.drawable.pansandwich,"Paneer Sandwich","4.1","Rs. 210","Paneer sandwich is a quick, delicious and protein-packed Indian sandwich made with crumbled paneer (Indian cheese), spices, veggies, herbs and bread. This paneer sandwich makes for a quick breakfast or snack and is kids’ friendly."));
        foodparamsList.add(new Foodparams(R.drawable.reshpan,"Reshmi Paneer","3.9","Rs. 200","Reshmi Paneer is a very delicious and rich accompaniment for Roti / Naan. Its a delicious masala curry made with soft paneer, capsicum and variety of spices. Paneer dishes are all time favorite, especially for kids. Paneer in any form would be a perfect dish for potluck or parties."));
        foodparamsList.add(new Foodparams(R.drawable.soyachap,"Soya Chap","4.3","Rs. 250","It is a delicious North Indian starter where soya chaap is cut into small pieces and then mixed with a marination of hung curd, ginger garlic paste, Kashmiri red chilli powder, turmeric powder, tandoori masala, chaat masala, black pepper powder, salt, garam masala powder, kasuri methi, butter, fresh cream and lemon juice."));
        foodparamsList.add(new Foodparams(R.drawable.tandaloo,"Tandoori Aloo","4.1","Rs. 245","Tandoori potato is a perfect blend of spices and every bite of it has a mixture of crunchiness as well as softness. Its flavour is so overwhelming that it will give you an amazing delight of spices with every bite."));
    }

    private void initRecyclerView3() {
        recyclerView3 = findViewById(R.id.VegStartersRecyclerView);
        linearLayoutManager3 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        adapter3 = new VegStartersAdapter(VegStarters.this, foodparamsList);
        recyclerView3.setAdapter(adapter3);
        adapter3.notifyDataSetChanged();
    }

}