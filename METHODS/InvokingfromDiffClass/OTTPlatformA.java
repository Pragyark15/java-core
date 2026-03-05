class OTTPlatformA {

    static String platformName = "Amazon Prime Video";

    static String tamil[]={
    "Jai Bhim","Soorarai Pottru","Sarpatta Parambarai","Master","Leo","Vikram","Kaithi","Asuran","Karnan","Doctor",
    "Don","Love Today","Mahaan","Jagame Thandhiram","Etharkkum Thunindhavan","Sivaji","Enthiran","2.0","Petta","Darbar",
    "Thunivu","Valimai","Viswasam","Vedalam","Mersal","Bigil","Theri","96","Oh My Kadavule","Comali"};

    static String telugu[]={
    "Pushpa","Pushpa 2","RRR","Baahubali The Beginning","Baahubali The Conclusion","Salaar","Eega","Magadheera","Ala Vaikunthapurramuloo","Sarrainodu",
    "DJ Duvvada Jagannadham","Race Gurram","Srimanthudu","Maharshi","Bharat Ane Nenu","Spyder","Arjun Reddy","Dear Comrade","Geetha Govindam","Fidaa",
    "Jersey","Hi Nanna","Ante Sundaraniki","Bro","Bheemla Nayak","Vakeel Saab","Guntur Kaaram","Businessman","Pokiri","Athadu"};

    static String kannada[]={
    "Kantara","KGF Chapter 1","KGF Chapter 2","777 Charlie","Ulidavaru Kandanthe","Garuda Gamana Vrishabha Vahana","Avane Srimannarayana","RangiTaranga","Bell Bottom","Dia",
    "Love Mocktail","Love Mocktail 2","Yuvarathnaa","James","Raajakumara","Roberrt","Kirik Party","Googly","Mungaru Male","Mungaru Male 2",
    "U Turn Kannada","Sapta Sagaradaache Ello","Sapta Sagaradaache Ello Side B","Gaalipata","Gaalipata 2","Natasaarvabhowma","Anjaniputra","Tagaru","Popcorn Monkey Tiger","Bhajarangi"};

    static String malayalam[]={
    "Drishyam","Drishyam 2","2018","Premam","Hridayam","Bangalore Days","Kumbalangi Nights","Minnal Murali","Jallikattu","Malik",
    "Kurup","Lucifer","Empuraan","Ayyappanum Koshiyum","The Great Indian Kitchen","Android Kunjappan","Romancham","RDX","King of Kotha","Driving Licence",
    "Uyare","Take Off","Virus","Trance","Joji","Iratta","Ela Veezha Poonchira","Nayattu","Operation Java","Varathan"};

    static String marathi[]={
    "Sairat","Court","Natsamrat","Timepass","Timepass 2","Duniyadari","Mulshi Pattern","Fandry","Deool","Harishchandrachi Factory",
    "Katyar Kaljat Ghusali","Lai Bhaari","Pawankhind","known Unknown","Me Shivaji Park","Double Seat","Bapjanma","Anandi Gopal","Farzand","Sher Shivraj",
    "Faster Fene","Bucket List","Baipan Bhari Deva","Chandramukhi","Zombivli","Ventilator","Mumbai Pune Mumbai","Mumbai Pune Mumbai 2","Ti Saddhya Kay Karte","Classmates"};

    static String punjabi[]={
    "Carry On Jatta","Carry On Jatta 2","Carry On Jatta 3","Jatt and Juliet","Jatt and Juliet 2","Shadaa","Qismat","Qismat 2","Sufna","Chal Mera Putt",
    "Chal Mera Putt 2","Chal Mera Putt 3","Ardaas","Ardaas Karaan","Honsla Rakh","Puaada","Kala Shah Kala","Laung Laachi","Muklawa","Nikka Zaildar",
    "Nikka Zaildar 2","Nikka Zaildar 3","Babe Bhangra Paunde Ne","Manje Bistre","Manje Bistre 2","Saunkan Saunkne","Yaar Anmulle","Yaar Anmulle Returns","Jindua","Super Singh"};

    public static void getPlatformTitles(){

        System.out.println("OTT Platform : "+platformName);

        System.out.println("\nTamil Titles:");
        for(String title : tamil) System.out.println(title);

        System.out.println("\nTelugu Titles:");
        for(String title : telugu) System.out.println(title);

        System.out.println("\nKannada Titles:");
        for(String title : kannada) System.out.println(title);

        System.out.println("\nMalayalam Titles:");
        for(String title : malayalam) System.out.println(title);

        System.out.println("\nMarathi Titles:");
        for(String title : marathi) System.out.println(title);

        System.out.println("\nPunjabi Titles:");
        for(String title : punjabi) System.out.println(title);

        System.out.println("\nEnd of getPlatformTitles");
    }
}