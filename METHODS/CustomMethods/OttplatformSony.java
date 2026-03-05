class OttplatformSony {

    static String tamil[]={
        "Victim","Iravin Nizhal","Clap","Cadaver","Ayngaran",
        "Sivaranjaniyum Innum Sila Pengalum","Gargi","Vanjagar Ulagam","Nenjam Marappathillai","Kuruthi"
    };

    static String telugu[]={
        "Major","Maharshi","Gatham","Evaru","HIT",
        "Family Drama","Agent Sai Srinivasa Athreya","Bro","Jaanu","Gully Rowdy"
    };

    static String kannada[]={
        "Bhajarangi 2","Rathnan Prapancha","Yuvarathnaa","Roberrt","Sheegrameva Kalyana Praptirastu",
        "Dia","Kavaludaari","Ulidavaru Kandanthe","Tagaru","Alone"
    };

    static String malayalam[]={
        "Maanaadu","Kaanekkaane","Minnal Murali","Ayyappanum Koshiyum","Joseph",
        "Android Kunjappan","Helen","Operation Java","Nayattu","Joji"
    };

    static String marathi[]={
        "Pawankhind","Sairat","Faster Fene","Harishchandrachi Factory","Timepass",
        "Timepass 2","Natsamrat","Double Seat","Bucket List","Ti Saddhya Kay Karte"
    };

    static String punjabi[]={
        "Kuriyan Jawan Bapu Preshaan","Super Singh","Manje Bistre","Qismat","Qismat 2",
        "Laung Laachi","Ardaas","Ardaas Karaan","Puaada","Yaar Anmulle"
    };

    public static void main(String[] args) {

        String platformName = "Sony LIV";
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