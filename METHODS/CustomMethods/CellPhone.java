class CellPhone {

    static long contacts[]={
        9876543210L,9123456780L,9988776655L,9090909090L,8887776665L,
        7894561230L,7012345678L,9345678901L,8123456790L,9765432109L,
        8899001122L,9900112233L,9011223344L,8122334455L,9233445566L,
        8344556677L,9455667788L,8566778899L,7677889900L,6788990011L
        };

    public static void main(String[] args){
    
        System.out.println("Contact Numbers:");

        getContacts();
        
    }
    static void getContacts(){
    for(long number : contacts)
    System.out.println(number);
        }
}