package me.gabeve.recipeapp;

/**
 * Created by Gabriel on 2/22/16.
 */
public class Recipe {
    private String name;
    private String weblink;
    private int catID;
    private float rating;
    //1 = app, 2 = main, 3 = desert

    //now we create an array to hold all of our recipes
    public static final Recipe[] recipes = {
            new Recipe("Guinness Beer Cheese Dip",
                    "http://allrecipes.com/recipe/220556/guinness-beer-cheese-dip/",
                    0,
                    R.drawable.app_icon),
            new Recipe("Bacon Cheddar Deviled Eggs",
                    "http://allrecipes.com/recipe/69084/bacon-cheddar-deviled-eggs/",
                    0,
                    R.drawable.app_icon),
            new Recipe("Artichoke Stuffed Mushrooms",
                    "http://allrecipes.com/recipe/175989/artichoke-stuffed-mushrooms/",
                    0,
                    R.drawable.app_icon),
            new Recipe("Super Nachos",
                    "http://allrecipes.com/recipe/51147/super-nachos/",
                    0,
                    R.drawable.app_icon),
            new Recipe("Chef John's Beef Sliders",
                    "http://allrecipes.com/recipe/233655/chef-johns-beef-sliders/",
                    0,
                    R.drawable.app_icon),
            new Recipe("Bahama Mama Porkchops",
                    "http://allrecipes.com/recipe/23249/bahama-mama-pork-chops/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Slow Cooker Beef Pot Roast",
                    "http://allrecipes.com/recipe/220125/slow-cooker-beef-pot-roast/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Meatball Nirvana",
                    "http://allrecipes.com/recipe/213742/meatball-nirvana/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Chicken Breast w/ Balsamic Vinegar & Garlic",
                    "http://allrecipes.com/recipe/8701/chicken-breasts-with-balsamic-vinegar-and-garlic/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Chicken Pot Pie",
                    "http://allrecipes.com/recipe/26317/chicken-pot-pie-ix/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Zesty Slow-Cooker Chicken BBQ",
                    "http://allrecipes.com/recipe/65896/zesty-slow-cooker-chicken-barbecue/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Chicken Marsala",
                    "http://allrecipes.com/recipe/8887/chicken-marsala/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Bow Ties w/ Sausage Tomatoes & Cream",
                    "http://allrecipes.com/recipe/26257/bow-ties-with-sausage-tomatoes-and-cream/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Curried Coconut Chicken",
                    "http://allrecipes.com/recipe/68532/curried-coconut-chicken/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Szechwan Shrimp",
                    "http://allrecipes.com/recipe/86230/szechwan-shrimp/",
                    0,
                    R.drawable.maindish_icon),
            new Recipe("Sam's Famous Carrot Cake",
                    "http://allrecipes.com/recipe/8270/sams-famous-carrot-cake/",
                    0,
                    R.drawable.desert_icon),
            new Recipe("Lemon Bars",
                    "http://allrecipes.com/recipe/9842/lemon-bars-i/",
                    0,
                    R.drawable.desert_icon),
            new Recipe("Homemade Samoa Cookies",
                    "http://allrecipes.com/recipe/241752/homemade-samoa-cookies/",
                    0,
                    R.drawable.desert_icon),
            new Recipe("White Chocolate Raspberry Cheesecake",
                    "http://allrecipes.com/recipe/25642/white-chocolate-raspberry-cheesecake/",
                    0,
                    R.drawable.desert_icon),
            new Recipe("Double Layer Pumpkin Cheesecake",
                    "http://allrecipes.com/recipe/13477/double-layer-pumpkin-cheesecake/",
                    0,
                    R.drawable.desert_icon),


    };

    public Recipe(String name, String weblink, float rating, int catID){
        this.name = name;
        this.weblink = weblink;
        this.rating = rating;
        this.catID = catID;
    }

    public String getName(){
        return name;
    }

    public String getLink(){
        return weblink;
    }

    public int getCID(){
        return catID;
    }

    public float getRating() { return rating; }

    public String toString(){
        return this.name;
    }



}
