package ch_08_class.part_16_account;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("철수","123456",1000);
        // 철수, "123456", 1000
//        account1.setName("철수");
//        account1.setNo("123456");
//        account1.setBalance(1000);

        System.out.println(account1);
    }
}
