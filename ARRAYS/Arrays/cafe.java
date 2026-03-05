class Cafe{

public static void main(String[] cafe){
	
	String elaichi="Elaichi";
	String black="Black";
	String masala="Masala";
	String kt="KT";
	String lemon="Lemon";
	String ginger="Ginger";
	String jaggery="Jaggery";

	String americano="Americano";
	String cappachino="Cappachino";
	String cold="Cold";
	String iced="Iced";
	String latte="Latte";
	
	String samosa="Samosa";
	String vadapav="Vadapav";
	String panipuri="Panipuri";
	String pavbhaji="Pavbhaji";
	String toast="Toast";
	String sandwich="Sandwich";


String cafeName="Cloud Nine";

String teaNames[]={elaichi,black,masala,kt,lemon,ginger,jaggery};

String coffeeNames[]={americano,cappachino,cold,iced,latte};

String snacks[]={samosa,vadapav,panipuri,pavbhaji,toast,sandwich};

System.out.println("The cafe name is "+ cafeName);

for(String tea:teaNames)
System.out.println(tea);

for(String coffee:coffeeNames)
System.out.println(coffee);

for(String snack:snacks)
System.out.println(snack);

}

}