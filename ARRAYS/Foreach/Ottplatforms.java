class Ottplatforms {

    public static void main(String[] ott) {

        String platformName = "Netflix";


        String english[]={
        "Stranger Things","The Crown","The Witcher","Extraction","Bird Box","The Gray Man","Enola Holmes","Red Notice","Wednesday","The Irishman",
        "Marriage Story","The Killer","The Mother","Army of the Dead","Glass Onion","Leave the World Behind","The Adam Project","Don't Look Up","Triple Frontier","Polar",
        "Bright","Kate","Outside the Wire","Spectral","The Old Guard","Project Power","The Midnight Sky","Damsel","We Have a Ghost","Carry On"};

        String hindi[]={
        "Sacred Games","Delhi Crime","Jamtara","She","Khakee The Bihar Chapter","Guns and Gulaabs","Lust Stories","Lust Stories 2","Raat Akeli Hai","Darlings",
        "Monica O My Darling","Choked","Pagglait","Haseen Dillruba","Haseen Dillruba 2","Jaane Jaan","Chor Nikal Ke Bhaga","Class","Betaal","Ray",
        "Mismatched","Little Things","Yeh Kaali Kaali Ankhein","Trial by Fire","IC 814 The Kandahar Hijack","Guilty","AK vs AK","Bulbbul","Qala","Mai"};

        String korean[]={
        "Squid Game","All of Us Are Dead","Kingdom","Sweet Home","My Name","Vincenzo","Crash Landing on You","Itaewon Class","Hellbound","The Glory",
        "Business Proposal","Hometown Cha Cha Cha","Extraordinary Attorney Woo","The Silent Sea","Alice in Borderland","Signal","Start Up","Taxi Driver","Flower of Evil","Vagabond",
        "Black Knight","Juvenile Justice","Bloodhounds","Mask Girl","DP","DP Season 2","Hierarchy","The Frog","A Killer's Shopping List","Love Alarm"};

        String spanish[]={
        "Money Heist","Money Heist Korea","Elite","Elite Short Stories","Berlin","Locked Up","Toy Boy","The Innocent","Sky Rojo","Cable Girls",
        "Valeria","The Marked Heart","Muted","Welcome to Eden","Who Killed Sara","Feria The Darkest Light","High Seas","Intimacy","Through My Window","Nowhere",
        "The Snow Girl","Holy Family","Wrong Side of the Tracks","Alpha Males","Elite Season 7","Elite Season 8","The Cook of Castamar","Raising Voices","In Love All Over Again","Criminal Spain"};

        String japanese[]={
        "Alice in Borderland Japan","Good Morning Call","Erased","First Love","The Naked Director","Sanctuary","Switched","Followers","Million Yen Women","Burn the House Down",
        "Re Mind","Scams","Atelier","Japan Sinks","Kotaro Lives Alone","Unnatural","The Journalist","Beyond Goodbye","Giri Haji","Ju On Origins",
        "Let's Get Divorced","Call Me Chihiro","Rilakkuma and Kaoru","The Forest of Love","Pending Train","My Happy Marriage","Yu Yu Hakusho","House of Ninjas","The Days","City Hunter"};

        String turkish[]={
        "The Protector","Love 101","Fatma","Hot Skull","Another Self","Shahmaran","Ethos","Who Were We Running From","Black Money Love","The Club",
        "Rise of Empires Ottoman","Midnight at the Pera Palace","Yakamoz S245","50M2","The Gift","Graveyard","As the Crow Flies","Intersection","Last Summer","Immortals",
        "Love Tactics","Thank You Next","Oh Belinda","The Tailor","Kubra","Wild Abandon","Make Me Believe","You Do You","The Festival of Troubadours","Romantic Comedy"};

        System.out.println("OTT Platform : "+platformName);
        System.out.println("English Titles:");
        for(String title : english){
            System.out.println(title);
        }

        System.out.println("\nHindi Titles:");
        for(String title : hindi){
            System.out.println(title);
        }

        System.out.println("\nKorean Titles:");
        for(String title : korean){
            System.out.println(title);
        }

        System.out.println("\nSpanish Titles:");
        for(String title : spanish){
            System.out.println(title);
        }

        System.out.println("\nJapanese Titles:");
        for(String title : japanese){
            System.out.println(title);
        }

        System.out.println("\nTurkish Titles:");
        for(String title : turkish){
            System.out.println(title);
        }

        String platformName1 = "Amazon Prime Video";

        String tamil[]={
        "Jai Bhim","Soorarai Pottru","Sarpatta Parambarai","Master","Leo","Vikram","Kaithi","Asuran","Karnan","Doctor",
        "Don","Love Today","Mahaan","Jagame Thandhiram","Etharkkum Thunindhavan","Sivaji","Enthiran","2.0","Petta","Darbar",
        "Thunivu","Valimai","Viswasam","Vedalam","Mersal","Bigil","Theri","96","Oh My Kadavule","Comali"};

        String telugu[]={
        "Pushpa","Pushpa 2","RRR","Baahubali The Beginning","Baahubali The Conclusion","Salaar","Eega","Magadheera","Ala Vaikunthapurramuloo","Sarrainodu",
        "DJ Duvvada Jagannadham","Race Gurram","Srimanthudu","Maharshi","Bharat Ane Nenu","Spyder","Arjun Reddy","Dear Comrade","Geetha Govindam","Fidaa",
        "Jersey","Hi Nanna","Ante Sundaraniki","Bro","Bheemla Nayak","Vakeel Saab","Guntur Kaaram","Businessman","Pokiri","Athadu"};

        String kannada[]={
        "Kantara","KGF Chapter 1","KGF Chapter 2","777 Charlie","Ulidavaru Kandanthe","Garuda Gamana Vrishabha Vahana","Avane Srimannarayana","RangiTaranga","Bell Bottom","Dia",
        "Love Mocktail","Love Mocktail 2","Yuvarathnaa","James","Raajakumara","Roberrt","Kirik Party","Googly","Mungaru Male","Mungaru Male 2",
        "U Turn Kannada","Sapta Sagaradaache Ello","Sapta Sagaradaache Ello Side B","Gaalipata","Gaalipata 2","Natasaarvabhowma","Anjaniputra","Tagaru","Popcorn Monkey Tiger","Bhajarangi"};

        String malayalam[]={
        "Drishyam","Drishyam 2","2018","Premam","Hridayam","Bangalore Days","Kumbalangi Nights","Minnal Murali","Jallikattu","Malik",
        "Kurup","Lucifer","Empuraan","Ayyappanum Koshiyum","The Great Indian Kitchen","Android Kunjappan","Romancham","RDX","King of Kotha","Driving Licence",
        "Uyare","Take Off","Virus","Trance","Joji","Iratta","Ela Veezha Poonchira","Nayattu","Operation Java","Varathan"};

        String marathi[]={
        "Sairat","Court","Natsamrat","Timepass","Timepass 2","Duniyadari","Mulshi Pattern","Fandry","Deool","Harishchandrachi Factory",
        "Katyar Kaljat Ghusali","Lai Bhaari","Pawankhind","known Unknown","Me Shivaji Park","Double Seat","Bapjanma","Anandi Gopal","Farzand","Sher Shivraj",
        "Faster Fene","Bucket List","Baipan Bhari Deva","Chandramukhi","Zombivli","Ventilator","Mumbai Pune Mumbai","Mumbai Pune Mumbai 2","Ti Saddhya Kay Karte","Classmates"};

        String punjabi[]={
        "Carry On Jatta","Carry On Jatta 2","Carry On Jatta 3","Jatt and Juliet","Jatt and Juliet 2","Shadaa","Qismat","Qismat 2","Sufna","Chal Mera Putt",
        "Chal Mera Putt 2","Chal Mera Putt 3","Ardaas","Ardaas Karaan","Honsla Rakh","Puaada","Kala Shah Kala","Laung Laachi","Muklawa","Nikka Zaildar",
        "Nikka Zaildar 2","Nikka Zaildar 3","Babe Bhangra Paunde Ne","Manje Bistre","Manje Bistre 2","Saunkan Saunkne","Yaar Anmulle","Yaar Anmulle Returns","Jindua","Super Singh"};


        System.out.println("OTT Platform : "+platformName1);
        System.out.println("\nTamil Titles:");
        for(String title : tamil){
            System.out.println(title);
        }

        System.out.println("\nTelugu Titles:");
        for(String title : telugu){
            System.out.println(title);
        }

        System.out.println("\nKannada Titles:");
        for(String title : kannada){
            System.out.println(title);
        }

        System.out.println("\nMalayalam Titles:");
        for(String title : malayalam){
            System.out.println(title);
        }

        System.out.println("\nMarathi Titles:");
        for(String title : marathi){
            System.out.println(title);
        }

        System.out.println("\nPunjabi Titles:");
        for(String title : punjabi){
            System.out.println(title);
        }


        String platformName2 = "Disney+ Hotstar";

        String chinese[]={
        "The Wandering Earth","The Wandering Earth 2","Hidden Man","Shadow","Hero","House of Flying Daggers","Curse of the Golden Flower","Red Cliff","Red Cliff 2","Kung Fu Hustle",
        "Shaolin Soccer","The Great Wall","Mulan 2020","The Battle at Lake Changjin","Detective Chinatown","Detective Chinatown 2","Detective Chinatown 3","Operation Red Sea","Railroad Tigers","The Eight Hundred",
        "Monster Hunt","Monster Hunt 2","Ne Zha","Journey to the West","The Mermaid","Ip Man","Ip Man 2","Ip Man 3","Ip Man 4","Better Days"};

        String thai[]={
        "Bad Genius","The Medium","Pee Mak","Friend Zone","Happy Old Year","The Con-Heartist","OMG Oh My Girl","Heart Attack","Brother of the Year","Homestay",
        "Ghost Lab","Inhuman Kiss","The Promise","Dorm","Shutter","Alone","Coming Soon","Make Me Shudder","Make Me Shudder 2","Make Me Shudder 3",
        "The Swimmers","Bangkok Traffic Love Story","Love Destiny The Movie","The Cheese Sisters","Cracked","Faces of Anne","One for the Road","Classic Again","Low Season","London Sweeties"};

        String indonesian[]={
        "The Raid","The Raid 2","Headshot","The Night Comes for Us","May the Devil Take You","May the Devil Take You Too","Impetigore","Satan's Slaves","Satan's Slaves 2","Pengabdi Setan",
        "Gundala","Sri Asih","Photocopier","Dear Nathan","Dilan 1990","Dilan 1991","Dilan 1992","Ali and Ratu Ratu Queens","Nanti Kita Cerita Tentang Hari Ini","Mariposa",
        "Ivanna","KKN di Desa Penari","Losmen Bu Broto","Before I Met You","Yuni","Mencuri Raden Saleh","Ghost Writer","Ghost Writer 2","The Big 4","Autobiography"};

        String arabic[]={
        "The Blue Elephant","The Blue Elephant 2","Kira and El Gin","The Treasure","The Treasure 2","122","Diamond Dust","Sheikh Jackson","Clash","Capernaum",
        "Theeb","Wadjda","Mosul","Perfect Strangers Arabic","From A to B","Ali Zaoua","Caramel","West Beirut","Yomeddine","Amira",
        "When We Were Bullies","Al Hayba","The Platform Arabic","The Insult","Costa Brava Lebanon","The Unknown Saint","Papicha","You Resemble Me","Four Daughters","Goodbye Julia"};

        String bengali[]={
        "Chotushkone","Baishe Srabon","Vinci Da","Dracula Sir","Uma","Dwitiyo Purush","Byomkesh Bakshi","Byomkesh O Agnibaan","Gumnaami","Ek Je Chhilo Raja",
        "Haami","Haami 2","Belaseshe","Bela Shuru","Praktan","Nagarkirtan","Asur","Kabir","Kontho","Sanjhbati","Shahjahan Regency","Zulfiqar","Mishawr Rawhoshyo","Kakababur Protyaborton",
        "Yeti Obhijaan","Guptodhoner Sondhane","Durgeshgorer Guptodhon","Golondaaj","Password","Prem Tame"};

        String gujarati[]={
        "Hellaro","Chaal Jeevi Laiye","Love Ni Bhavai","Wrong Side Raju","Passport","Vitamin She","3 Ekka","Gujjubhai The Great","Gujjubhai Most Wanted","Bey Yaar",
        "Natsamrat Gujarati","Fakt Mahilao Maate","Last Film Show","Lakiro","53 Mu Panu","Thai Jashe","Teacher of the Year","Tari Maate Once More","Family Circus","Karsandas Pay and Use",
        "Shu Thayu","Golkeri","Hu Ane Tu","Chabutro","Mara Pappa Superhero","Dhuandhaar","Affraa Taffri","Tamburo","Midnights with Menka","Vickida No Varghodo"};

        System.out.println("OTT Platform : "+platformName2);
        System.out.println("\nChinese Titles:");
        for(String title : chinese){
            System.out.println(title);
        }

        System.out.println("\nThai Titles:");
        for(String title : thai){
            System.out.println(title);
        }

        System.out.println("\nIndonesian Titles:");
        for(String title : indonesian){
            System.out.println(title);
        }

        System.out.println("\nArabic Titles:");
        for(String title : arabic){
            System.out.println(title);
        }

        System.out.println("\nBengali Titles:");
        for(String title : bengali){
            System.out.println(title);
        }

        System.out.println("\nGujarati Titles:");
        for(String title : gujarati){
            System.out.println(title);
        }

        String platformName3 = "SonyLIV";

        String french[]={
        "Lupin","The Intouchables","Amelie","Blue Is the Warmest Color","La Haine","Portrait of a Lady on Fire","The Artist","Raw","Titane","Athena",
        "Paris 13th District","Les Miserables 2019","He Loves Me He Loves Me Not","A Very Long Engagement","Rust and Bone","The Diving Bell and the Butterfly","Tell No One","Martyrs","Irreversible","Climax",
        "Heartbreaker","The Family","OSS 117 Cairo Nest of Spies","OSS 117 Lost in Rio","Delicatessen","Micmacs","The Chorus","Caché","Swimming Pool","Summer of 85"};

        String german[]={
        "Dark","All Quiet on the Western Front","Run Lola Run","The Lives of Others","Good Bye Lenin","Downfall","Victoria","Who Am I","The Wave","Blood Red Sky",
        "Army of Thieves German","Freaks You're One of Us","How About Adolf","The Baader Meinhof Complex","Barbara","Phoenix","Never Look Away","Transit","A Coffee in Berlin","System Crasher",
        "Berlin Syndrome","The Captain","Gold","Lara","Rico Oskar and the Deep Shadows","Balloon","The Silent Revolution","Je Suis Karl","Isi and Ossi","Faraway"};

        String italian[]={
        "La Dolce Vita","Cinema Paradiso","Life Is Beautiful","The Great Beauty","Dogman","Gomorrah","Roman Holiday","The Hand of God","Freaks Out","Perfect Strangers Italian",
        "They Call Me Jeeg","Mediterraneo","I Am Love","The Best of Youth","Suburra","Suburra Aeterna","Welcome to the South","The Invisible Boy","18 Presents","My Brother My Sister",
        "Rose Island","The Ties","Loro","Pinocchio 2019","The Traitor","Human Capital","The Champion","Still Time","The Goddess of Fortune","Security"};

        String portuguese[]={
        "3 Percent","City of God","Elite Squad","Elite Squad 2","The Way He Looks","Bacurau","Invisible City","Good Morning Veronica","Brotherhood","The Mechanism",
        "Sintonia","Nobody's Looking","Reality Z","Too Close to the Sun","Just Another Christmas","Rich in Love","Rich in Love 2","Airplane Mode","Double Dad","Carnaval",
        "The Killer Brazilian","Beyond the Universe","Confessions of an Invisible Girl","The Last Forest","Marighella","The Awakener","Moto Anjos","Loop","Dry Wind","Divine Love"};

        String polish[]={
        "365 Days","365 Days This Day","The Next 365 Days","The Hater","Corpus Christi","Cold War","Spoor","Prime Time","The Mire","High Water",
        "The Woods","Nobody Sleeps in the Woods Tonight","Nobody Sleeps in the Woods Tonight 2","Erotica 2022","Broad Peak","Operation Hyacinth","All My Friends Are Dead","The Getaway King","How I Fell in Love with a Gangster","Furioza",
        "The Champion Polish","Women of Mafia","Women of Mafia 2","The Butler","Silent Night","Sweat","In for a Murder","Justice","Planeta Singli","Letters to Santa"};

        String swedish[]={
        "The Girl with the Dragon Tattoo","The Hunt for a Killer","A Man Called Ove","Let the Right One In","Border","The Square","Force Majeure","Evil","Snabba Cash","Clark",
        "Quicksand","Black Crab Swedish","Red Dot","The Conference","Flocking","438 Days","Sune vs Sune","Simple Simon","Together","The Unthinkable",
        "Jordskott","Caliphate","Young Wallander","Wallander","Beartown","Thicker Than Water","Gasmamman","Love and Anarchy","Bonus Family","Riders of Justice"};

        System.out.println("OTT Platform : "+platformName3);
        System.out.println("\nFrench Titles:");
        for(String title : french){
            System.out.println(title);
        }

        System.out.println("\nGerman Titles:");
        for(String title : german){
            System.out.println(title);
        }

        System.out.println("\nItalian Titles:");
        for(String title : italian){
            System.out.println(title);
        }

        System.out.println("\nPortuguese Titles:");
        for(String title : portuguese){
            System.out.println(title);
        }

        System.out.println("\nPolish Titles:");
        for(String title : polish){
            System.out.println(title);
        }

        System.out.println("\nSwedish Titles:");
        for(String title : swedish){
            System.out.println(title);
        }

        String platformName4 = "ZEE5";

        String urdu[]={
        "Khuda Kay Liye","Bol","Waar","Jawani Phir Nahi Ani","Jawani Phir Nahi Ani 2","Punjab Nahi Jaungi","Teefa in Trouble","Actor in Law","Bin Roye","Ho Mann Jahaan",
        "Cake","Laal Kabootar","Zindagi Tamasha","Parey Hut Love","Load Wedding","Chalay Thay Saath","Verna","Motorcycle Girl","Mah e Mir","Ramchand Pakistani",
        "Siyaah","3 Bahadur","3 Bahadur The Revenge","The Donkey King","Project Ghazi","Superstar","London Nahi Jaunga","Tich Button","Quaid e Azam Zindabad","Money Back Guarantee"};

        String assamese[]={
        "Village Rockstars","Village Rockstars 2","Bulbul Can Sing","Kothanodi","Aamis","Local Kung Fu","Local Kung Fu 2","Ratnakar","Bornodi Bhotiai","Bridge",
        "Xhoixobote Dhemalite","Maj Rati Keteki","Mission China","Priyaar Priyo","Bhaskar The Rascal Assamese","Tora's Husband","Sikaisal","Haanduk","Ishu","Baandhon",
        "Nirvana","Dur","Jonaki","Mon Jaai","Rowd","The Underworld","Nayanmoni","Kolohol","Gangs of North East","Sabaash Naidu Assamese"};

        String odia[]={
        "Hello Arsi","Bye Bye Dubai","Abhay","Daman","Pratikshya","Tu Mo Love Story","Tu Mo Love Story 2","Love Pain Kuch Bhi Karega","Golmaal Love","Chal Tike Dusta Heba",
        "Ishq Puni Thare","Something Something","Something Something 2","Super Michhua","Balunga Toka","Hero No 1","Kie Heba Mo Heroine","Pagala Karichi Paunji Tora","Chocolate Odia","Romeo Juliet",
        "Prem Kumar","Samaya","Suna Chadhei Mo Rupa Chadhei","Ae Mana Khoje Mana Tiye","Kehi Nuhen Kahara","Mu Eka Tumara","Mate Ta Love Helare","Dil Ka Raja","Nijhum Ratira Sathi","Rakta Golap"};

        String bhojpuri[]={
        "Nirahua Hindustani","Nirahua Hindustani 2","Nirahua Hindustani 3","Border","Sasura Bada Paisawala","Patna Se Pakistan","Crack Fighter","Mehandi Laga Ke Rakhna","Mehandi Laga Ke Rakhna 2","Mehandi Laga Ke Rakhna 3",
        "Gadar Bhojpuri","Gadar 2 Bhojpuri","Pawan Raja","Satya","Wanted Bhojpuri","Dulhan Ganga Paar Ke","Sher Singh","Lallu Ki Laila","Raja Babu","Vivah",
        "Challenge","Kasam Paida Karne Wale Ki","Dabang Sarkar","Baaghi","Loha Pahalwan","Pratigya","Pratigya 2","Kashi Amarnath","Balam Ji Love You","Sangharsh"};

        String sinhala[]={
        "Machan","Aloko Udapadi","Nidhanaya","Siri Parakum","Pravegaya","Motor Bicycle","Aswesuma","Sarungale","Samanala Sandhawaniya","Flying Fish",
        "Thanha Rathi Ranga","Ini Avan","Dharmayuddhaya","Ginnen Upan Seethala","Ho Gaana Pokuna","U Turn Sinhala","Deveni Inima","Adaraneeya Kathawak","Sulanga Enu Pinisa","Sakkarang",
        "Karma","Vishama Bhaga","Ko Mark No Mark","Ran Kevita","Ran Kevita 2","Ahelepola Kumarihami","Sewwandi","Sanda Yahanata","Gamani","Rosa Kale"};

        String nepali[]={
        "Kabaddi","Kabaddi Kabaddi","Kabaddi 4","Loot","Loot 2","Chhakka Panja","Chhakka Panja 2","Chhakka Panja 3","Chhakka Panja 4","Jatra",
        "Jatrai Jatra","Pashupati Prasad","Pashupati Prasad 2","Prem Geet","Prem Geet 2","Prem Geet 3","Hostel","Hostel Returns","Aama","Gopi",
        "Selfie King","Talakjung vs Tulke","Dui Rupaiyan","Bulbul Nepali","Prasad","The Break Up","Kri","Dreams","Intu Mintu Londonma","September Falls"};

        System.out.println("OTT Platform : "+platformName4);
        System.out.println("\nUrdu Titles:");
        for(String title : urdu){
            System.out.println(title);
        }

        System.out.println("\nAssamese Titles:");
        for(String title : assamese){
            System.out.println(title);
        }

        System.out.println("\nOdia Titles:");
        for(String title : odia){
            System.out.println(title);
        }

        System.out.println("\nBhojpuri Titles:");
        for(String title : bhojpuri){
            System.out.println(title);
        }

        System.out.println("\nSinhala Titles:");
        for(String title : sinhala){
            System.out.println(title);
        }

        System.out.println("\nNepali Titles:");
        for(String title : nepali){
            System.out.println(title);
        }

    }
}