public class BankingSystem {
    public static void main(String[] args) {
        Account account1 = new Account("John", "123456", 1000);
        Account account2 = new Account("Egnuma", "654321", 500);

        account1.getAccountHolderInfo();
        account2.getAccountHolderInfo();

        account1.deposit(500);
        account1.withdraw(200);
        account1.transfer(account2, 300);

        account1.getAccountHolderInfo();
        account2.getAccountHolderInfo();

        account1.addInterest();
        account2.addInterest();

        account1.getAccountHolderInfo();
        account2.getAccountHolderInfo();
    }
}