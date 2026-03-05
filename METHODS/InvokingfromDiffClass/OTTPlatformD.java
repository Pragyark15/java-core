class OTTPlatformD {

    static String platformName = "Disney+ Hotstar";

    static String chinese[]={
    "The Wandering Earth","The Wandering Earth 2","Hidden Man","Shadow","Hero","House of Flying Daggers","Curse of the Golden Flower","Red Cliff","Red Cliff 2","Kung Fu Hustle",
    "Shaolin Soccer","The Great Wall","Mulan 2020","The Battle at Lake Changjin","Detective Chinatown","Detective Chinatown 2","Detective Chinatown 3","Operation Red Sea","Railroad Tigers","The Eight Hundred",
    "Monster Hunt","Monster Hunt 2","Ne Zha","Journey to the West","The Mermaid","Ip Man","Ip Man 2","Ip Man 3","Ip Man 4","Better Days"};

    static String thai[]={
    "Bad Genius","The Medium","Pee Mak","Friend Zone","Happy Old Year","The Con-Heartist","OMG Oh My Girl","Heart Attack","Brother of the Year","Homestay",
    "Ghost Lab","Inhuman Kiss","The Promise","Dorm","Shutter","Alone","Coming Soon","Make Me Shudder","Make Me Shudder 2","Make Me Shudder 3",
    "The Swimmers","Bangkok Traffic Love Story","Love Destiny The Movie","The Cheese Sisters","Cracked","Faces of Anne","One for the Road","Classic Again","Low Season","London Sweeties"};

    static String indonesian[]={
    "The Raid","The Raid 2","Headshot","The Night Comes for Us","May the Devil Take You","May the Devil Take You Too","Impetigore","Satan's Slaves","Satan's Slaves 2","Pengabdi Setan",
    "Gundala","Sri Asih","Photocopier","Dear Nathan","Dilan 1990","Dilan 1991","Dilan 1992","Ali and Ratu Ratu Queens","Nanti Kita Cerita Tentang Hari Ini","Mariposa",
    "Ivanna","KKN di Desa Penari","Losmen Bu Broto","Before I Met You","Yuni","Mencuri Raden Saleh","Ghost Writer","Ghost Writer 2","The Big 4","Autobiography"};

    static String arabic[]={
    "The Blue Elephant","The Blue Elephant 2","Kira and El Gin","The Treasure","The Treasure 2","122","Diamond Dust","Sheikh Jackson","Clash","Capernaum",
    "Theeb","Wadjda","Mosul","Perfect Strangers Arabic","From A to B","Ali Zaoua","Caramel","West Beirut","Yomeddine","Amira",
    "When We Were Bullies","Al Hayba","The Platform Arabic","The Insult","Costa Brava Lebanon","The Unknown Saint","Papicha","You Resemble Me","Four Daughters","Goodbye Julia"};

    static String bengali[]={
    "Chotushkone","Baishe Srabon","Vinci Da","Dracula Sir","Uma","Dwitiyo Purush","Byomkesh Bakshi","Byomkesh O Agnibaan","Gumnaami","Ek Je Chhilo Raja",
    "Haami","Haami 2","Belaseshe","Bela Shuru","Praktan","Nagarkirtan","Asur","Kabir","Kontho","Sanjhbati","Shahjahan Regency","Zulfiqar","Mishawr Rawhoshyo","Kakababur Protyaborton",
    "Yeti Obhijaan","Guptodhoner Sondhane","Durgeshgorer Guptodhon","Golondaaj","Password","Prem Tame"};

    static String gujarati[]={
    "Hellaro","Chaal Jeevi Laiye","Love Ni Bhavai","Wrong Side Raju","Passport","Vitamin She","3 Ekka","Gujjubhai The Great","Gujjubhai Most Wanted","Bey Yaar",
    "Natsamrat Gujarati","Fakt Mahilao Maate","Last Film Show","Lakiro","53 Mu Panu","Thai Jashe","Teacher of the Year","Tari Maate Once More","Family Circus","Karsandas Pay and Use",
    "Shu Thayu","Golkeri","Hu Ane Tu","Chabutro","Mara Pappa Superhero","Dhuandhaar","Affraa Taffri","Tamburo","Midnights with Menka","Vickida No Varghodo"};

    public static void getPlatformTitles(){

        System.out.println("OTT Platform : "+platformName);

        System.out.println("\nChinese Titles:");
        for(String title : chinese) System.out.println(title);

        System.out.println("\nThai Titles:");
        for(String title : thai) System.out.println(title);

        System.out.println("\nIndonesian Titles:");
        for(String title : indonesian) System.out.println(title);

        System.out.println("\nArabic Titles:");
        for(String title : arabic) System.out.println(title);

        System.out.println("\nBengali Titles:");
        for(String title : bengali) System.out.println(title);

        System.out.println("\nGujarati Titles:");
        for(String title : gujarati) System.out.println(title);

        System.out.println("\nEnd of getPlatformTitles");
    }
}