class CellPhone {

    public static void main(String[] args){
        long contact1 = 9876543210L;
        long contact2 = 9123456780L;
        long contact3 = 9988776655L;
        long contact4 = 9090909090L;
        long contact5 = 8887776665L;
        long contact6 = 7894561230L;
        long contact7 = 7012345678L;
        long contact8 = 9345678901L;
        long contact9 = 8123456790L;
        long contact10 = 9765432109L;
        long contact11 = 8899001122L;
        long contact12 = 9900112233L;
        long contact13 = 9011223344L;
        long contact14 = 8122334455L;
        long contact15 = 9233445566L;
        long contact16 = 8344556677L;
        long contact17 = 9455667788L;
        long contact18 = 8566778899L;
        long contact19 = 7677889900L;
        long contact20 = 6788990011L;
        long contacts[]={ contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
                        contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18,contact19,contact20
        };

        System.out.println("Contact Numbers:");

        for(long number : contacts){
            System.out.println(number);
        }
    }
}