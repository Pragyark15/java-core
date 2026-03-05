class Lays {

    static String LaysIngredients[]= {"Potatoes","Edible Vegetable Oil","Palmolein Oil","Salt","Sugar","Spices","Onion Powder","Garlic Powder","Chilli Powder","Black Pepper","Cheese Powder","Milk Solids","Corn Flour","Wheat Flour","Starch","Maltodextrin","Flavour Enhancers","Acidity Regulator","Antioxidant","Natural Flavours","Artificial Flavours","Yeast Extract","Tomato Powder","Citric Acid","Food Colour"};

    public static void main(String[] arg){
		
        System.out.println("Ingredients List:");
        getLaysIngredients();
        
        }
        static void getLaysIngredients(){
        for(String item : LaysIngredients)
            System.out.println(item);
    }
}