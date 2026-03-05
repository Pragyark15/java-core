class OttplatformDisney {

    static String tamil[]={
        "Raatchasi","Mookuthi Amman","Oh My Kadavule","Enemy","Plan Panni Pannanum",
        "Lift","Netrikann","Atrangi Re","Bhoomi","Kaadan"
    };

    static String telugu[]={
        "Ala Vaikunthapurramuloo","Bheemla Nayak","DJ","Agnyaathavaasi","Bro",
        "Saaho","Baahubali","Baahubali 2","Okka Ammayi Thappa","RRR"
    };

    static String kannada[]={
        "KGF","KGF 2","Kantara","777 Charlie","Yuvarathna",
        "Roberrt","Kotigobba 3","Kurukshetra","Pailwaan","Bhajarangi 2"
    };

    static String malayalam[]={
        "Hridayam","Varatan","Joseph","Helen","Lucifer",
        "Kurup","Jallikattu","Kumbalangi Nights","Take Off","Uyare"
    };

    static String marathi[]={
        "Sairat","Timepass","Timepass 2","Double Seat","Natsamrat",
        "Bucket List","Lai Bhaari","Deool","Faster Fene","Pawankhind"
    };

    static String punjabi[]={
        "Qismat","Qismat 2","Sufna","Ardaas","Ardaas Karaan",
        "Manje Bistre","Manje Bistre 2","Chal Mera Putt","Super Singh","Yaar Anmulle"
    };

    public static void main(String[] args) {

        String platformName = "Disney+ Hotstar";
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