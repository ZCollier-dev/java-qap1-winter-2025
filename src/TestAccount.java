public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account("1", "Zack", 5000);
        Account acc2 = new Account("2", "Colin", 4000);
        int transferAmount = 1000;

        System.out.println(acc1.getName() + " has $" + acc1.getBalance());
        System.out.println(acc2.getName() + " has $" + acc2.getBalance());

        acc1.transferTo(acc2, transferAmount);
        System.out.println(transferAmount + " transferred.");

        System.out.println(acc1.getName() + " now has $" + acc1.getBalance());
        System.out.println(acc2.getName() + " now has $" + acc2.getBalance());
    }
}
