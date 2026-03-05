class OTTPlatformS {

    static String platformName3 = "SonyLIV";

    static String french[]={
    "Lupin","The Intouchables","Amelie","Blue Is the Warmest Color","La Haine","Portrait of a Lady on Fire","The Artist","Raw","Titane","Athena",
    "Paris 13th District","Les Miserables 2019","He Loves Me He Loves Me Not","A Very Long Engagement","Rust and Bone","The Diving Bell and the Butterfly","Tell No One","Martyrs","Irreversible","Climax",
    "Heartbreaker","The Family","OSS 117 Cairo Nest of Spies","OSS 117 Lost in Rio","Delicatessen","Micmacs","The Chorus","Caché","Swimming Pool","Summer of 85"};

    static String german[]={
    "Dark","All Quiet on the Western Front","Run Lola Run","The Lives of Others","Good Bye Lenin","Downfall","Victoria","Who Am I","The Wave","Blood Red Sky",
    "Army of Thieves German","Freaks You're One of Us","How About Adolf","The Baader Meinhof Complex","Barbara","Phoenix","Never Look Away","Transit","A Coffee in Berlin","System Crasher",
    "Berlin Syndrome","The Captain","Gold","Lara","Rico Oskar and the Deep Shadows","Balloon","The Silent Revolution","Je Suis Karl","Isi and Ossi","Faraway"};

    static String italian[]={
    "La Dolce Vita","Cinema Paradiso","Life Is Beautiful","The Great Beauty","Dogman","Gomorrah","Roman Holiday","The Hand of God","Freaks Out","Perfect Strangers Italian",
    "They Call Me Jeeg","Mediterraneo","I Am Love","The Best of Youth","Suburra","Suburra Aeterna","Welcome to the South","The Invisible Boy","18 Presents","My Brother My Sister",
    "Rose Island","The Ties","Loro","Pinocchio 2019","The Traitor","Human Capital","The Champion","Still Time","The Goddess of Fortune","Security"};

    static String portuguese[]={
    "3 Percent","City of God","Elite Squad","Elite Squad 2","The Way He Looks","Bacurau","Invisible City","Good Morning Veronica","Brotherhood","The Mechanism",
    "Sintonia","Nobody's Looking","Reality Z","Too Close to the Sun","Just Another Christmas","Rich in Love","Rich in Love 2","Airplane Mode","Double Dad","Carnaval",
    "The Killer Brazilian","Beyond the Universe","Confessions of an Invisible Girl","The Last Forest","Marighella","The Awakener","Moto Anjos","Loop","Dry Wind","Divine Love"};

    static String polish[]={
    "365 Days","365 Days This Day","The Next 365 Days","The Hater","Corpus Christi","Cold War","Spoor","Prime Time","The Mire","High Water",
    "The Woods","Nobody Sleeps in the Woods Tonight","Nobody Sleeps in the Woods Tonight 2","Erotica 2022","Broad Peak","Operation Hyacinth","All My Friends Are Dead","The Getaway King","How I Fell in Love with a Gangster","Furioza",
    "The Champion Polish","Women of Mafia","Women of Mafia 2","The Butler","Silent Night","Sweat","In for a Murder","Justice","Planeta Singli","Letters to Santa"};

    static String swedish[]={
    "The Girl with the Dragon Tattoo","The Hunt for a Killer","A Man Called Ove","Let the Right One In","Border","The Square","Force Majeure","Evil","Snabba Cash","Clark",
    "Quicksand","Black Crab Swedish","Red Dot","The Conference","Flocking","438 Days","Sune vs Sune","Simple Simon","Together","The Unthinkable",
    "Jordskott","Caliphate","Young Wallander","Wallander","Beartown","Thicker Than Water","Gasmamman","Love and Anarchy","Bonus Family","Riders of Justice"};

    public static void getPlatformTitles(){

        System.out.println("OTT Platform : "+platformName3);

        System.out.println("\nFrench Titles:");
        for(String title : french) System.out.println(title);

        System.out.println("\nGerman Titles:");
        for(String title : german) System.out.println(title);

        System.out.println("\nItalian Titles:");
        for(String title : italian) System.out.println(title);

        System.out.println("\nPortuguese Titles:");
        for(String title : portuguese) System.out.println(title);

        System.out.println("\nPolish Titles:");
        for(String title : polish) System.out.println(title);

        System.out.println("\nSwedish Titles:");
        for(String title : swedish) System.out.println(title);

        System.out.println("\nEnd of getPlatformTitles");
    }
}