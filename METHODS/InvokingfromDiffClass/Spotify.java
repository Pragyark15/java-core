class Spotify{
    static String songNames[]={"Shape of You","Blinding Lights","Dance Monkey","Rockstar","One Dance","Closer"};
    public static void getSongNames(){
        System.out.println("getSongNames invoked");
        for(String songName:songNames){
            System.out.println(songName);
        }
        System.out.println("end of getSongNames");
    }
}