class OttplatformNet {

    static String tamil[]={
        "Paava Kadhaigal","Navarasa","Pizza","Mimi","Nayattu",
        "Jagame Thandhiram","Beast","Iraivi","Game Over","Aval"
    };

    static String telugu[]={
        "RRR","Agent Sai Srinivasa Athreya","Mallesham","Ante Sundaraniki","Krishna and His Leela",
        "Bheeshma","Pitta Kathalu","Waltair Veerayya","Major","Guntur Kaaram"
    };

    static String kannada[]={
        "Kantara","KGF","KGF 2","Charlie 777","Dia",
        "Love Mocktail","Love Mocktail 2","Yuvarathna","Roberrt","RangiTaranga"
    };

    static String malayalam[]={
        "Minnal Murali","Forensic","Iratta","Kurup","Joji",
        "Romancham","2018","The Great Indian Kitchen","Trance","Virus"
    };

    static String marathi[]={
        "Sairat","Harishchandrachi Factory","Court","Deool","Natsamrat",
        "Timepass","Timepass 2","Faster Fene","Double Seat","Anandi Gopal"
    };

    static String punjabi[]={
        "Jatt & Juliet","Super Singh","Qismat","Qismat 2","Sufna",
        "Manje Bistre","Nikka Zaildar","Laung Laachi","Ardaas","Honsla Rakh"
    };

    public static void main(String[] args) {

        String platformName = "Netflix";
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