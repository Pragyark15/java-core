class IPLTeams {

    static String iplTeamNames[] = {
        "Chennai Super Kings",
        "Mumbai Indians",
        "Royal Challengers Bangalore",
        "Kolkata Knight Riders",
        "Delhi Capitals",
        "Sunrisers Hyderabad",
        "Rajasthan Royals",
        "Punjab Kings",
        "Lucknow Super Giants",
        "Gujarat Titans"
    };

    public static void getIplTeams() {
        System.out.println("IPL Teams:");

        for (String team : iplTeamNames) {
            System.out.println(team);
        }

        System.out.println("End of getIplTeams");
    }
}