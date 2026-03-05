class Cafe{

static String teaNames[]={"Elaichi","Black","Masala","KT","Lemon","Ginger","Jaggery"};

static String coffeeNames[]={"Americano","Cappachino","Cold","Iced","Latte"};

static String snacks[]={"Samosa","Vadapav","Panipuri","Pavbhaji","Toast","Sandwich"};


public static void main(String[] cafe){
	

String cafeName="Cloud Nine";

System.out.println("The cafe name is "+ cafeName);

getteaNames();
getcoffeeNames();
getsnacks();


}
static void getteaNames() {
for(String tea:teaNames)
System.out.println(tea);
}

static void getcoffeeNames() {
for(String coffee:coffeeNames)
System.out.println(coffee);
}

static void getsnacks() {
for(String snack:snacks)
System.out.println(snack);
}


}