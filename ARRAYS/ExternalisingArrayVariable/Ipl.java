class Ipl {
    
    public static void main(String[] args){

        String chennaiteam = "Chennai Super Kings";
        String mumbaiTeam = "Mumbai Indians";
        String royalTeam = "Royal Challengers Bangalore";
        String kolkataTeam = "Kolkata Knight Riders";
        String delhiTeam = "Delhi Capitals";
        String sunrisersTeam = "Sunrisers Hyderabad";
        String rajasthanTeam = "Rajasthan Royals";
        String punjabTeam = "Punjab Kings";
        String lucknowTeam = "Lucknow Super Giants";
        String gujaratTeam = "Gujarat Titans";

        String iplTeamNames[]={
            chennaiteam,
            mumbaiTeam,
            royalTeam,
            kolkataTeam,
            delhiTeam,
            sunrisersTeam,
            rajasthanTeam,
            punjabTeam,
            lucknowTeam,
            gujaratTeam
        };

        System.out.println("IPL Teams:");

        for(String team : iplTeamNames){
            System.out.println(team);
        }
    }
}