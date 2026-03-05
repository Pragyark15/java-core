jclass Worldcup {

    public static void main(String[] args){
        String india="India";
        String australia="Australia";
        String pakistan="Pakistan";
        String newzealand="New Zealand";
        String srilanka="Sri Lanka";
        String groupA[]={india,australia,pakistan,newzealand,srilanka};

        String england="England";
        String southafrica="South Africa";
        String bangladesh="Bangladesh";
        String afghanistan="Afghanistan";
        String netherlands="Netherlands";
        String groupB[]={england,southafrica,bangladesh,afghanistan,netherlands};

        String westindies="West Indies";
        String ireland="Ireland";
        String zimbabwe="Zimbabwe";
        String scotland="Scotland";
        String uae="UAE";
        String groupC[]={westindies,ireland,zimbabwe,scotland,uae};

        String nepal="Nepal";
        String namibia="Namibia";
        String oman="Oman";
        String usa="USA";
        String canada="Canada";
        String groupD[]={nepal,namibia,oman,usa,canada};
        
        
        System.out.println("Group A:");
        for(String team : groupA){
            System.out.println(team);
        }

        System.out.println("\nGroup B:");
        for(String team : groupB){
            System.out.println(team);
        }

        System.out.println("\nGroup C:");
        for(String team : groupC){
            System.out.println(team);
        }

        System.out.println("\nGroup D:");
        for(String team : groupD){
            System.out.println(team);
        }
    }
}