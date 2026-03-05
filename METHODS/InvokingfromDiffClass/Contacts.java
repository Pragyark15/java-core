class Contacts {

    static long contactNumbers[] = {
        9876543210L,9123456780L,9988776655L,9090909090L,8887776665L,
        7894561230L,7012345678L,9345678901L,8123456790L,9765432109L,
        8899001122L,9900112233L,9011223344L,8122334455L,9233445566L,
        8344556677L,9455667788L,8566778899L,7677889900L,6788990011L
    };

    public static void getContactNumbers() {
        System.out.println("Contact Numbers:");

        for (long number : contactNumbers) {
            System.out.println(number);
        }

        System.out.println("End of getContactNumbers");
    }
}