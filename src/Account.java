public class Account {

    //attributes
    private String id;
    private String name;
    private int balance;

    //methods
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public int transferTo(Account other, int amount){
        if (amount <= this.balance){
            this.balance -= amount;
            other.balance += amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public String toString(){
        return "Account - " + this.id + this.name + this.balance;
    }
}
