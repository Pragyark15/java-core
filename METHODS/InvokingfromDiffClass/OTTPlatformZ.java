class OTTPlatformZ {

    static String platformName4 = "ZEE5";

    static String urdu[]={
    "Khuda Kay Liye","Bol","Waar","Jawani Phir Nahi Ani","Jawani Phir Nahi Ani 2","Punjab Nahi Jaungi","Teefa in Trouble","Actor in Law","Bin Roye","Ho Mann Jahaan",
    "Cake","Laal Kabootar","Zindagi Tamasha","Parey Hut Love","Load Wedding","Chalay Thay Saath","Verna","Motorcycle Girl","Mah e Mir","Ramchand Pakistani",
    "Siyaah","3 Bahadur","3 Bahadur The Revenge","The Donkey King","Project Ghazi","Superstar","London Nahi Jaunga","Tich Button","Quaid e Azam Zindabad","Money Back Guarantee"};

    static String assamese[]={
    "Village Rockstars","Village Rockstars 2","Bulbul Can Sing","Kothanodi","Aamis","Local Kung Fu","Local Kung Fu 2","Ratnakar","Bornodi Bhotiai","Bridge",
    "Xhoixobote Dhemalite","Maj Rati Keteki","Mission China","Priyaar Priyo","Bhaskar The Rascal Assamese","Tora's Husband","Sikaisal","Haanduk","Ishu","Baandhon",
    "Nirvana","Dur","Jonaki","Mon Jaai","Rowd","The Underworld","Nayanmoni","Kolohol","Gangs of North East","Sabaash Naidu Assamese"};

    static String odia[]={
    "Hello Arsi","Bye Bye Dubai","Abhay","Daman","Pratikshya","Tu Mo Love Story","Tu Mo Love Story 2","Love Pain Kuch Bhi Karega","Golmaal Love","Chal Tike Dusta Heba",
    "Ishq Puni Thare","Something Something","Something Something 2","Super Michhua","Balunga Toka","Hero No 1","Kie Heba Mo Heroine","Pagala Karichi Paunji Tora","Chocolate Odia","Romeo Juliet",
    "Prem Kumar","Samaya","Suna Chadhei Mo Rupa Chadhei","Ae Mana Khoje Mana Tiye","Kehi Nuhen Kahara","Mu Eka Tumara","Mate Ta Love Helare","Dil Ka Raja","Nijhum Ratira Sathi","Rakta Golap"};

    static String bhojpuri[]={
    "Nirahua Hindustani","Nirahua Hindustani 2","Nirahua Hindustani 3","Border","Sasura Bada Paisawala","Patna Se Pakistan","Crack Fighter","Mehandi Laga Ke Rakhna","Mehandi Laga Ke Rakhna 2","Mehandi Laga Ke Rakhna 3",
    "Gadar Bhojpuri","Gadar 2 Bhojpuri","Pawan Raja","Satya","Wanted Bhojpuri","Dulhan Ganga Paar Ke","Sher Singh","Lallu Ki Laila","Raja Babu","Vivah",
    "Challenge","Kasam Paida Karne Wale Ki","Dabang Sarkar","Baaghi","Loha Pahalwan","Pratigya","Pratigya 2","Kashi Amarnath","Balam Ji Love You","Sangharsh"};

    static String sinhala[]={
    "Machan","Aloko Udapadi","Nidhanaya","Siri Parakum","Pravegaya","Motor Bicycle","Aswesuma","Sarungale","Samanala Sandhawaniya","Flying Fish",
    "Thanha Rathi Ranga","Ini Avan","Dharmayuddhaya","Ginnen Upan Seethala","Ho Gaana Pokuna","U Turn Sinhala","Deveni Inima","Adaraneeya Kathawak","Sulanga Enu Pinisa","Sakkarang",
    "Karma","Vishama Bhaga","Ko Mark No Mark","Ran Kevita","Ran Kevita 2","Ahelepola Kumarihami","Sewwandi","Sanda Yahanata","Gamani","Rosa Kale"};

    static String nepali[]={
    "Kabaddi","Kabaddi Kabaddi","Kabaddi 4","Loot","Loot 2","Chhakka Panja","Chhakka Panja 2","Chhakka Panja 3","Chhakka Panja 4","Jatra",
    "Jatrai Jatra","Pashupati Prasad","Pashupati Prasad 2","Prem Geet","Prem Geet 2","Prem Geet 3","Hostel","Hostel Returns","Aama","Gopi",
    "Selfie King","Talakjung vs Tulke","Dui Rupaiyan","Bulbul Nepali","Prasad","The Break Up","Kri","Dreams","Intu Mintu Londonma","September Falls"};

    public static void getPlatformTitles(){

        System.out.println("OTT Platform : "+platformName4);

        System.out.println("\nUrdu Titles:");
        for(String title : urdu) System.out.println(title);

        System.out.println("\nAssamese Titles:");
        for(String title : assamese) System.out.println(title);

        System.out.println("\nOdia Titles:");
        for(String title : odia) System.out.println(title);

        System.out.println("\nBhojpuri Titles:");
        for(String title : bhojpuri) System.out.println(title);

        System.out.println("\nSinhala Titles:");
        for(String title : sinhala) System.out.println(title);

        System.out.println("\nNepali Titles:");
        for(String title : nepali) System.out.println(title);

        System.out.println("\nEnd of getPlatformTitles");
    }
}