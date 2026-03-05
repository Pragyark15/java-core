class OTTPlatformN {

    static String platformName = "Netflix";

    static String english[]={
    "Stranger Things","The Crown","The Witcher","Extraction","Bird Box","The Gray Man","Enola Holmes","Red Notice","Wednesday","The Irishman",
    "Marriage Story","The Killer","The Mother","Army of the Dead","Glass Onion","Leave the World Behind","The Adam Project","Don't Look Up","Triple Frontier","Polar",
    "Bright","Kate","Outside the Wire","Spectral","The Old Guard","Project Power","The Midnight Sky","Damsel","We Have a Ghost","Carry On"};

    static String hindi[]={
    "Sacred Games","Delhi Crime","Jamtara","She","Khakee The Bihar Chapter","Guns and Gulaabs","Lust Stories","Lust Stories 2","Raat Akeli Hai","Darlings",
    "Monica O My Darling","Choked","Pagglait","Haseen Dillruba","Haseen Dillruba 2","Jaane Jaan","Chor Nikal Ke Bhaga","Class","Betaal","Ray",
    "Mismatched","Little Things","Yeh Kaali Kaali Ankhein","Trial by Fire","IC 814 The Kandahar Hijack","Guilty","AK vs AK","Bulbbul","Qala","Mai"};

    static String korean[]={
    "Squid Game","All of Us Are Dead","Kingdom","Sweet Home","My Name","Vincenzo","Crash Landing on You","Itaewon Class","Hellbound","The Glory",
    "Business Proposal","Hometown Cha Cha Cha","Extraordinary Attorney Woo","The Silent Sea","Alice in Borderland","Signal","Start Up","Taxi Driver","Flower of Evil","Vagabond",
    "Black Knight","Juvenile Justice","Bloodhounds","Mask Girl","DP","DP Season 2","Hierarchy","The Frog","A Killer's Shopping List","Love Alarm"};

    static String spanish[]={
    "Money Heist","Money Heist Korea","Elite","Elite Short Stories","Berlin","Locked Up","Toy Boy","The Innocent","Sky Rojo","Cable Girls",
    "Valeria","The Marked Heart","Muted","Welcome to Eden","Who Killed Sara","Feria The Darkest Light","High Seas","Intimacy","Through My Window","Nowhere",
    "The Snow Girl","Holy Family","Wrong Side of the Tracks","Alpha Males","Elite Season 7","Elite Season 8","The Cook of Castamar","Raising Voices","In Love All Over Again","Criminal Spain"};

    static String japanese[]={
    "Alice in Borderland Japan","Good Morning Call","Erased","First Love","The Naked Director","Sanctuary","Switched","Followers","Million Yen Women","Burn the House Down",
    "Re Mind","Scams","Atelier","Japan Sinks","Kotaro Lives Alone","Unnatural","The Journalist","Beyond Goodbye","Giri Haji","Ju On Origins",
    "Let's Get Divorced","Call Me Chihiro","Rilakkuma and Kaoru","The Forest of Love","Pending Train","My Happy Marriage","Yu Yu Hakusho","House of Ninjas","The Days","City Hunter"};

    static String turkish[]={
    "The Protector","Love 101","Fatma","Hot Skull","Another Self","Shahmaran","Ethos","Who Were We Running From","Black Money Love","The Club",
    "Rise of Empires Ottoman","Midnight at the Pera Palace","Yakamoz S245","50M2","The Gift","Graveyard","As the Crow Flies","Intersection","Last Summer","Immortals",
    "Love Tactics","Thank You Next","Oh Belinda","The Tailor","Kubra","Wild Abandon","Make Me Believe","You Do You","The Festival of Troubadours","Romantic Comedy"};

    public static void getPlatformTitles(){

        System.out.println("OTT Platform : "+platformName);

        System.out.println("English Titles:");
        for(String title : english) System.out.println(title);

        System.out.println("\nHindi Titles:");
        for(String title : hindi) System.out.println(title);

        System.out.println("\nKorean Titles:");
        for(String title : korean) System.out.println(title);

        System.out.println("\nSpanish Titles:");
        for(String title : spanish) System.out.println(title);

        System.out.println("\nJapanese Titles:");
        for(String title : japanese) System.out.println(title);

        System.out.println("\nTurkish Titles:");
        for(String title : turkish) System.out.println(title);

        System.out.println("\nEnd of getPlatformTitles");
    }
}