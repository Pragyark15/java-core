class Ipl {

        static String  IplTeams[]= {"Chennai Super Kings","Mumbai Indians","Royal Challengers Bangalore","Kolkata Knight Riders","Delhi Capitals","Sunrisers Hyderabad","Rajasthan Royals","Punjab Kings","Lucknow Super Giants","Gujarat Titans"};
    
    public static void main(String[] args){

        System.out.println("IPL Teams:");

        getIplTeams();
       
        }
        
        static void getIplTeams(){
        for(String team:IplTeams)
        System.out.println(team);
        }
    }
