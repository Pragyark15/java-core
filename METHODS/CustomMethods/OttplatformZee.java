class OttplatformZee {

    static String tamil[]={
        "Vinodhaya Sitham","Oh My Dog","Yaanai","Asuran","Kanaa",
        "Karthik Dial Seytha Yenn","Sila Nerangalil Sila Manidhargal","Chinna","Kaari","Veetla Vishesham"
    };

    static String telugu[]={
        "Bangarraju","Solo Brathuke So Better","Uppena","Kalki","Aravinda Sametha",
        "Akhanda","Ghani","Republic","Bro","Skanda"
    };

    static String kannada[]={
        "Kantara","Rathnan Prapancha","Love Mocktail","Love Mocktail 2","Roberrt",
        "Kotigobba 3","Pogaru","Mugil Pete","Kranthi","Vedha"
    };

    static String malayalam[]={
        "Odiyan","Maniyarayile Ashokan","Mohan Kumar Fans","Chathur Mukham","Cold Case",
        "Kuruthi","Anjaam Pathiraa","Nayattu","Churuli","And The Oscar Goes To"
    };

    static String marathi[]={
        "Sairat","Timepass","Timepass 2","Natsamrat","Faster Fene",
        "Anandi Gopal","Double Seat","Chandramukhi","Pawankhind","Zombivli"
    };

    static String punjabi[]={
        "Puaada","Honsla Rakh","Super Singh","Manje Bistre","Laung Laachi",
        "Qismat","Qismat 2","Chal Mera Putt","Chal Mera Putt 2","Ardaas"
    };

    public static void main(String[] args) {

        String platformName = "Zee5";
        System.out.println("OTT Platform : " + platformName);

        System.out.println("\nTamil Titles:");
        getTamilTitles();

        System.out.println("\nTelugu Titles:");
        getTeluguTitles();

        System.out.println("\nKannada Titles:");
        getKannadaTitles();

        System.out.println("\nMalayalam Titles:");
        getMalayalamTitles();

        System.out.println("\nMarathi Titles:");
        getMarathiTitles();

        System.out.println("\nPunjabi Titles:");
        getPunjabiTitles();
    }

    static void getTamilTitles() {
        for(String title : tamil){
            System.out.println(title);
        }
    }

    static void getTeluguTitles() {
        for(String title : telugu){
            System.out.println(title);
        }
    }

    static void getKannadaTitles() {
        for(String title : kannada){
            System.out.println(title);
        }
    }

    static void getMalayalamTitles() {
        for(String title : malayalam){
            System.out.println(title);
        }
    }

    static void getMarathiTitles() {
        for(String title : marathi){
            System.out.println(title);
        }
    }

    static void getPunjabiTitles() {
        for(String title : punjabi){
            System.out.println(title);
        }
    }
}