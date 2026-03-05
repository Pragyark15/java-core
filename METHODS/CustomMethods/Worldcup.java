class Worldcup {
    static String groupA[]={"India","Australia","Pakistan","New Zealand","Sri Lanka"};
     static String groupB[]={"England","South Africa","Bangladesh","Afghanistan","Netherlands"};
     static String groupC[]={"West Indies","Ireland","Zimbabwe","Scotland","UAE"};
     static String groupD[]={"Epal","Namibia","Oman","USA","Canada"};
        
    public static void main(String[] args){
        
        System.out.println("Group A:");
        getGroupA();
        System.out.println("\nGroup B:");
        getGroupB();
        System.out.println("\nGroup C:");
        getGroupC();
        System.out.println("\nGroup D:");
        getGroupD();
    
    }
    static void getGroupA(){
    for(String team : groupA){
            System.out.println(team);
        }
    }
        static void getGroupB(){
        for(String team : groupB){
            System.out.println(team);
        }
        }
        static void getGroupC(){
            for(String team : groupC){
                System.out.println(team);
            }
        }
        static void getGroupD(){
            for(String team : groupD){
                System.out.println(team);
            }
        }
}
